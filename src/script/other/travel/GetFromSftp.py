# -*- coding: utf-8 -*-
"""
Created on Wed Jun 20 10:07:07 2018

@author: zaizhongyang
"""
import paramiko
import os
import logging
import uuid
import pymysql
import MailUtil

fileName2tableName = {
        "RT_PF":"t_travelbigscreen_scenicflowhours",
        "D_PF":"t_travelbigscreen_scenicflowdate",
        "OC_PF":"t_travelbigscreen_passengersource",
        "P_ST":"t_travelbigscreen_staytime",
        "P_AA":"t_travelbigscreen_touristapp",
        "P_TV":"t_travelbigscreen_vehicletype",
        "P_VT":"t_travelbigscreen_touristtrack",
        "OP_PA":"t_travelbigscreen_userportrait"
        }

logging.basicConfig(filename='log.txt', level=logging.INFO, format=' %(asctime)s - %(levelname)s - %(message)s')

def insertDatas(db, tableName, tableField_list, data_list):
    cursor = db.cursor()
    paramField = [tableName] + tableField_list
    padding = ""
    for i in range(len(tableField_list)):
        if i < len(tableField_list)-1:
            padding = padding + "%s, "
        else:
            padding = padding + "%s"
    sql_insert = "INSERT INTO %s(" + padding + ")" 
    sql_insert = sql_insert % tuple(paramField)
    sql_insert = sql_insert + " VALUES(" + padding + ")"
    try:
        cursor.executemany(sql_insert,data_list)
        db.commit()
    except:
        db.rollback()
        #添加日志
        logging.error("Error: unable to insert data."+ "tableName is: " + tableName)   
        
def file2mysql(db, tableName, fileName):
    
    if not os.path.exists(fileName):
        return False   
    try:
#    获取文本文件中字段名称   
        f = open(fileName)
        tablefiled = f.readline().split("	")
        tablefiled = ["id"] + tablefiled
#    从文本中提取数据
        datalist = []
        f = open(fileName)
        for l in f.readlines()[1:]:
            temp = [str(uuid.uuid1())]
            temp.extend(l.split("	"))
            datalist.append(temp)
#    判断datalist是否为空，为空的话则发邮件提醒 
        if len(datalist) == 0:
            MailUtil.sendMail(configFile = "config/config_mail.ini", 
                              section = "mail", 
                              subject="旅游数据断流提醒", 
                              context="文件空，文件名：" + fileName)
            logging.info("文件空，文件名：" + fileName)
        else:
#    将list格式数据插入数据库    
            insertDatas(db, tableName, tablefiled, datalist)
            logging.info("Success to insert mysql. fileName is: " + fileName)
    except:
        logging.error("Error: unable to save to mysql. fileName is: " + fileName)
        
    return True

def sftp_download(db,host,port,username,password,local,remote):
    sf = paramiko.Transport((host,port))
    sf.connect(username = username,password = password)
    sftp = paramiko.SFTPClient.from_transport(sf)
    try:
        if os.path.isdir(local):#判断本地参数是目录还是文件
            for f in sftp.listdir(remote):#遍历远程目录
                if not os.path.exists(local+f):
                    sftp.get(os.path.join(remote+f),os.path.join(local+f))#下载目录中文件
                    #录入数据库
                    for m in fileName2tableName:
                        if m in f:
                            tableName = fileName2tableName[m]
                            file2mysql(db, tableName, local+f)
                    logging.info( "Success download " + f )
        else:
            sftp.get(remote,local)#下载文件
    except Exception,e:
        logging.error('download exception:',e)
    sf.close()

if __name__ == '__main__':
    sftphost = '112.54.48.55'#主机
    sftpPort = 15016 #端口
    sftpusername = 'wz_zhlv' #用户名
    sftppassword = 'zhlv123456' #密码
    sftplocal = '/app/wz_sftp/data/'#本地文件或目录，与远程一致，当前为windows目录格式，window目录中间需要使用双斜线
    sftpremote = '/'#远程文件或目录，与本地一致，当前为linux目录格式

    host="rm-bp1c3j9xj20z1wd62go.mysql.rds.aliyuncs.com"
    user="wz_big_sc"
    passwd="wz_bigscreen#321"
    port=3306
    dbName="wz_big_sc"
    charset='utf8'
    
    db = pymysql.connect(host=host,
                 port=port,
                 user=user,
                 passwd=passwd,
                 db=dbName,
                 charset=charset)
        
    sftp_download(db,sftphost,sftpPort,sftpusername,sftppassword,sftplocal,sftpremote)#下载
    
    logging.info( "Success update the file" )