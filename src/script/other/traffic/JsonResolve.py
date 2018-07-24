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
import datetime

logging.basicConfig(filename='log.txt', level=logging.INFO, format=' %(asctime)s - %(levelname)s - %(message)s')

def getDateFromInterface():
    response = requests.request("GET", "http://jiaotong.baidu.com/openapi/v1/trafficindex/getcitydetail?ak=KIQLobmtmMs4uqWPQXfTX6YbWcGVxDxY&cityCode=304", timeout=30)
    data = json.loads(response.text)
    return data

def dealdata():
    data = getDateFromInterface()
    datatmp = data['result']['list']
    datamap = {}
    
    datamap['id'] = str(uuid.uuid1())
    
    city_detail = datatmp['city_detail']
    #数据库中不能用index作为字段，将index改成current_index
    datamap['current_index'] = city_detail['index']
    datamap['last_index'] = city_detail['last_index']
    datamap['week_rate'] = city_detail['week_rate']
    datamap['max_congest_day'] = city_detail['max_congest_day']
    datamap['max_week_day'] = city_detail['max_week_day']
    datamap['max_index'] = city_detail['max_index']
    
    road_index = datatmp['road_index']
    datamap['highway_index'] = road_index['highway_index']
    datamap['general_way_index'] = road_index['general_way_index']
    datamap['lhighway_index'] = road_index['lhighway_index']
    datamap['lgeneral_way_index'] = road_index['lgeneral_way_index']
    datamap['highway_speed'] = road_index['highway_speed']
    datamap['general_way_speed'] = road_index['general_way_speed']
    datamap['highway_week_rate'] = road_index['highway_week_rate']
    datamap['general_way_week_rate'] = road_index['general_way_week_rate']
    
    congest_mile = datatmp['congest_mile']
    datamap['slowly'] = congest_mile['slowly']
    datamap['congest'] = congest_mile['congest']
    datamap['serious'] = congest_mile['serious']
    datamap['avg_slowly'] = congest_mile['avg_slowly']
    datamap['avg_congest'] = congest_mile['avg_congest']
    datamap['avg_serious'] = congest_mile['avg_serious']
    datamap['slowly_rate'] = congest_mile['slowly_rate']
    datamap['congest_rate'] = congest_mile['congest_rate']
    datamap['serious_rate'] = congest_mile['serious_rate']
    datamap['is_work'] = congest_mile['is_work']
    
    peak_detail = datatmp['peak_detail']
    datamap['morning_hour'] = peak_detail['morning_hour']
    datamap['morning_index'] = peak_detail['morning_index']
    datamap['evening_hour'] = peak_detail['evening_hour']
    datamap['evening_index'] = peak_detail['evening_index']
    
    #时间转成标准格式
    updatetime = datetime.datetime.strptime(datatmp['updatetime'],'%Y%m%d%H%M')
    datamap['updatetime'] = updatetime.strftime("%Y-%m-%d %H:%M")
    
    
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
    tableName="t_trafficbigscreen_trafficdata"
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
        
    logging.info( "Success saving traffic data!" )
    db.close()