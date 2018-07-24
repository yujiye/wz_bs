# -*- coding: utf-8 -*-
"""
Created on Sun Jun 17 01:57:36 2018

@author: zaizhongyang
"""
import requests
import json
import pymysql
import logging
import uuid

logging.basicConfig(filename='log.txt', level=logging.INFO, format=' %(asctime)s - %(levelname)s - %(message)s')

#全市范围高速路拥堵数据接口
url1 = "http://jiaotong.baidu.com/openapi/v1/city/roadboard?ak=KIQLobmtmMs4uqWPQXfTX6YbWcGVxDxY&cityCode=304&districtType=0&roadType=1"
#全市范围主干道拥堵数据接口
url2 = "http://jiaotong.baidu.com/openapi/v1/city/roadboard?ak=KIQLobmtmMs4uqWPQXfTX6YbWcGVxDxY&cityCode=304&districtType=0&roadType=3"
def getDateFromInterface(url):
    response = requests.request("GET", url, timeout=30)
    data = json.loads(response.text)
    return data

def dealdata():

    datamap = {}
    datamap['id'] = str(uuid.uuid1())
    
    data = getDateFromInterface(url1)
    datatmp = data['result']['list']
    datamap['highway_index'] = datatmp['index']
    datamap['highway_speed'] = datatmp['speed']
    datamap['highway_week_rate'] = datatmp['index_chain']
    
    data = getDateFromInterface(url2)
    datatmp = data['result']['list']
    datamap['general_way_index'] = datatmp['index']
    datamap['general_way_speed'] = datatmp['speed']
    datamap['general_way_week_rate'] = datatmp['index_chain']
       
    return datamap

def insertData(db, tableName, tableField_list, data_list):
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
        cursor.execute(sql_insert,data_list)
        db.commit()
    except:
        db.rollback()
        #添加日志
        logging.error("Error: unable to insert data.")   
    

if __name__ == '__main__':
#    host="localhost"
#    user="lizhou"
#    passwd="lizhou"
    host="rm-bp1c3j9xj20z1wd62go.mysql.rds.aliyuncs.com"
    user="wz_big_sc"
    passwd="wz_bigscreen#321"
    port=3306
    dbName="wz_big_sc"
    tableName="t_trafficbigscreen_trafficindex"
    charset='utf8'
    # 打开数据库连接
    try:
        db = pymysql.connect(host=host,
                             port=port,
                             user=user,
                             passwd=passwd,
                             db=dbName,
                             charset=charset)
    except:
        #添加日志
        logging.error("unable to connect database!")
    #获取数据
    data = dealdata()
    try:
        #插入数据
        insertData(db, tableName, data.keys(), data.values())
    except:
        logging.error( "unable to insert data!" )
        
    logging.info( "Success saving trafficindex data!" )
    db.close()
    
#    d = dealdata()