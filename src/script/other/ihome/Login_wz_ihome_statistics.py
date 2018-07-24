# -*- coding: utf-8 -*-
import requests
import json
import pymysql
import logging
import datetime

# http://www.wz-ihome.com/admin/managerLoginAction.action
# 8001  123123
#配置日志信息
logging.basicConfig(filename='log.txt', level=logging.INFO, format=' %(asctime)s - %(levelname)s - %(message)s')

def login(user_name, user_password):
    login_url = "http://www.wz-ihome.com/admin/managerLoginAction.action"
    postData = {
        "admineRegister.loginName": user_name,
        "admineRegister.loginPassword": user_password

    }
    session = requests.Session()
    res = session.post(login_url, data=postData)
    # 将cookie加入headers
    cookies = res.cookies.get_dict()
    cookies = [key + "=" + value for key, value in cookies.items()]
    cookies = "; ".join(cookies)
    #清空响应头，只返回cookies
    re = {}
    re["Cookie"] = cookies
    return re

cTime = datetime.datetime.now()
#{key:{'url':value,'tableField':value}}
statistics_dict = {
        "老人年龄分布": "http://www.wz-ihome.com//json/queryForAll.action?myOrder=queryOldPeopleForAge",
             "政府购买服务分布": "http://www.wz-ihome.com//json/queryForAll.action?myOrder=oldCondition&ptypeId=3",
             "病情分布": "http://www.wz-ihome.com//json/queryForAll.action?myOrder=oldCondition&ptypeId=2",
             "商家类型分布": "http://www.wz-ihome.com//json/queryForAll.action?myOrder=queryMerchantType",
             "月服务次数和时长统计": "http://www.wz-ihome.com//json/queryForAll.action?myOrder=allNurseService&myYear=%s&myMonth=%s&merchantId=0" %(cTime.year,cTime.month),
             "通话状态分布": "http://www.wz-ihome.com//json/queryCallDate.action",
             "已接电话、呼出电话统计": "http://www.wz-ihome.com//json/queryhuawu.action",
             "服务订单类型分布":"http://www.wz-ihome.com//json/queryForAll.action?myOrder=serviceType",
             "服务评价":"http://www.wz-ihome.com//json/queryForAll.action?myOrder=queryGreat",
             "本月订单数量":"http://www.wz-ihome.com//json/queryForAll.action?myOrder=queryUserAccountInformationForDay",
             "本年订单数量":"http://www.wz-ihome.com//json/queryForAll.action?myOrder=queryUserAccountInformationForMonth",
             "线上服务数":"http://www.wz-ihome.com//json/queryCallInAndCallOut.action",
             "线下服务数":"http://www.wz-ihome.com//json/queryForAll.action?myOrder=findUserOrderGenerateCount"
             }
statistics_id = {"老人年龄分布": ["1","bussiness_value1表示各类bussiness_key的百分比（%）"],
             "政府购买服务分布": ["2","bussiness_value1为当天政府购买服务记录数量"],
             "病情分布": ["3","bussiness_value1为当天病情分布记录数量"],
             "商家类型分布": ["4","bussiness_value1为当天商家类型分布占比（%）"],
             "月服务次数和时长统计": ["5","bussiness_key表示日期，bussiness_value1表示月服务次数，bussiness_value2表示月服务时长"],
             "通话状态分布": ["6","bussiness_value1表示各类key的数量"],
             "已接电话、呼出电话统计": ["7","bussiness_key表示姓名，bussiness_value1表示已接电话次数，bussiness_value2表示呼出电话次数"],
             "服务订单类型分布":["8","bussiness_value1表示各类bussiness_key的百分比（%）"],
             "服务评价":["9","bussiness_value1表示各类bussiness_key的百分比（%）"],
             "本月订单数量":["10","bussiness_key表示日期，bussiness_value1表示当日数量"],
             "本年订单数量":["11","bussiness_key表示月份，bussiness_value1表示当月数量" ],
             "线上服务数":["12","bussiness_key表示线上服务数，bussiness_value1表示数量"],
             "线下服务数":["13","bussiness_key表示线下服务数，bussiness_value1表示数量"],
             "用户数量":["14","bussiness_key表示用户类型，bussiness_value1表示数量"]             
             }
statistics_field = {"老人年龄分布": ["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],
             "政府购买服务分布": ["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],
             "病情分布": ["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],
             "商家类型分布": ["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],
             "月服务次数和时长统计": ["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","bussiness_value2","isnew"],
             "通话状态分布": ["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],
             "已接电话、呼出电话统计": ["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","bussiness_value2","isnew"],
             "服务订单类型分布":["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],
             "服务评价":["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],
             "本月订单数量":["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],
             "本年订单数量":["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],
             "线上服务数":["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],              
             "线下服务数":["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"],
             "用户数量":["statistics_id","statistics_name","id_comment","bussiness_key","bussiness_value1","isnew"]
             }
    
def insertData(db, tableField_list, data_list):
    cursor = db.cursor()
    paramField = ["z_statistics_table"] + tableField_list
    padding = ""
    for i in range(len(tableField_list)):
        if i < len(tableField_list)-1:
            padding = padding + "%s, "
        else:
            padding = padding + "%s"
    sql_insert = "INSERT INTO %s(" + padding + ")" 
    sql_insert = sql_insert % tuple(paramField)
    sql_insert = sql_insert + " VALUES(" + padding + ")"
    #把之前的记录标志为0
    sql_update = "UPDATE " + db.db + ".z_statistics_table SET isnew = '0' WHERE statistics_id = %s AND isnew = '1' AND spider_time < %s"
    #设置状态为最新
    data_list.append("1")
    try:
        #获取两分钟前的时间
        dtime = datetime.datetime.now() - datetime.timedelta(minutes=2)
        #执行SQL语句
        cursor.execute(sql_update,[data_list[0],dtime.strftime("%Y-%m-%d %H:%M:%S")])
        cursor.execute(sql_insert,data_list)
        db.commit()
    except:
        db.rollback()
        #添加日志
        logging.error("Error: unable to insert data.")
        
def getAndInsertUser(db, res):
    response = requests.request("POST", "http://www.wz-ihome.com//json/queryForAll.action?myOrder=findAllCount", headers=res, timeout=30)
    data = json.loads(response.text)
    #data[1]为护工，data[2]为商家，data[3]为义工，data[4]为社工，data[5]为青年志愿者
    nurse = [statistics_id["用户数量"][0],"用户数量",statistics_id["用户数量"][1]] + ["护工", data[1]]
    merchant = [statistics_id["用户数量"][0],"用户数量",statistics_id["用户数量"][1]] + ["商家", data[2]]
    volunteer = [statistics_id["用户数量"][0],"用户数量",statistics_id["用户数量"][1]] + ["义工", data[3]]
    social = [statistics_id["用户数量"][0],"用户数量",statistics_id["用户数量"][1]] + ["社工", data[4]]
    youth = [statistics_id["用户数量"][0],"用户数量",statistics_id["用户数量"][1]] + ["青年志愿者", data[5]]
    insertData(db, statistics_field["用户数量"], nurse)
    insertData(db, statistics_field["用户数量"], merchant)
    insertData(db, statistics_field["用户数量"], volunteer)
    insertData(db, statistics_field["用户数量"], social)
    insertData(db, statistics_field["用户数量"], youth)

if __name__ == '__main__':
    user_name = "8001"
    user_password = "123123"
    res = login(user_name, user_password)
    host="localhost"
    port=3306
    user="lizhou"
    passwd="lizhou"
    dbName="ihome"
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

    dataset = {}
    for statistics_key in statistics_dict.keys():
        try:
            response = requests.request("POST", statistics_dict[statistics_key], headers=res, timeout=30)
            data = json.loads(response.text)
        except:
            res = login(user_name, user_password)
            try:
                response = requests.request("POST", statistics_dict[statistics_key], headers=res, timeout=30)
            except:
                #添加日志
                logging.error( "unable to connect %s" % statistics_key)
            data = json.loads(response.text)
        #插入数据    
        if isinstance(data, int):
            record = [statistics_id[statistics_key][0],statistics_key,statistics_id[statistics_key][1]] + [statistics_key,data]
            insertData(db, statistics_field[statistics_key], record)
        else:
            for record in data:
                #"月服务次数和时长统计"和"本月订单数量"加上时间戳
                if statistics_key == "月服务次数和时长统计" or statistics_key == "本月订单数量":
                    record[0] = "%s-%s-%s" % (cTime.year, str(cTime.month).zfill(2), str(record[0]).zfill(2))
                #"本年订单数量"加上时间戳
                if statistics_key == "本年订单数量":
                    record[0] = "%s-%s" % (cTime.year, str(record[0]).zfill(2))
                record = [statistics_id[statistics_key][0],statistics_key,statistics_id[statistics_key][1]] + record           
                insertData(db, statistics_field[statistics_key], record)
    #获取和插入“用户数量”
    getAndInsertUser(db,res)
    #添加日志        
    logging.info( "Finish the spider task today!" )


    db.close()
