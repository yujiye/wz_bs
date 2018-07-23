# -*- coding: utf-8 -*-
"""
Created on Mon Jul  9 21:07:47 2018

@author: zaizhongyang
"""

import ConfigUtil
import DatabaseUtil
import requests
import json
import uuid
import pymysql
import logging

def getDateFromInterface():
    #载入url
    urls = ConfigUtil.config2map('config/config_url.ini','URL')        
    headers = {'content-type': 'application/json'}
#    headers = {}
    data={}
    for url_key in urls.keys():
        resquest_data = json.dumps({"messageid": str(uuid.uuid1())})
        response = requests.post(url = urls[url_key], data = resquest_data, headers=headers, timeout=10)  
        data[url_key] = json.loads(response.text)
    return data

if __name__ == '__main__':

    config_mysql = ConfigUtil.config2map('config/config_mysql.ini','mysql-local')
    
    host = str(config_mysql["host"])
    user = str(config_mysql["user"])
    passwd = str(config_mysql["passwd"])
    port = int(config_mysql["port"])
    dbName = str(config_mysql["dbname"])
    tableName = str(config_mysql["tablename"])
    charset = str(config_mysql["charset"])
    

    
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
        
        
    filed = ConfigUtil.config2options("config/config_field.ini","field")
    records = getDateFromInterface()
    
    datas = []
    for record_key in records.keys():
        data = []
        r = records[record_key]
        
        data.append(str(r["messageid"]))
        data.append(str(record_key))
        if str(r["code"]) != "1":
            continue
        data.append(str(r["code"]))
        data.append(r["msg"].encode("utf-8")  )
        data.append(str(r["data"]))
#        data.append("1")
        
        datas.append(data)
        
#    DatabaseUtil.insertData(db, tableName, filed, datas)
    
    for i in datas:
        DatabaseUtil.insertAndUpdateData(db, tableName, "keyword", filed, i)
    
    db.close()