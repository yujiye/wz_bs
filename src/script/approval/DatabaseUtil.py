# -*- coding: utf-8 -*-
"""
Created on Mon Jul  9 21:57:31 2018

@author: lizhou
"""
import logging
import datetime

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
        cursor.executemany(sql_insert,data_list)
        db.commit()
    except:
        db.rollback()
        #添加日志
        logging.error("Error: unable to insert data."+ "tableName is: " + tableName)
        
def insertAndUpdateData(db, tableName, updatekeyword, tableField_list, data_list):
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
    sql_insert = sql_insert.encode("utf-8")
    #把之前的记录标志为0
    sql_update = "UPDATE " + db.db + "."+ tableName + " SET isnew = '0' WHERE " + updatekeyword + " = %s AND isnew = '1'"
    #设置状态为最新
    data_list.append("1")
    try:
        #获取两分钟前的时间
#        dtime = datetime.datetime.now() - datetime.timedelta(minutes=2)
        #执行SQL语句
        cursor.execute(sql_update,data_list[1])
        cursor.execute(sql_insert,data_list)
        db.commit()
    except:
        db.rollback()
        #添加日志
        logging.error("Error: unable to insert data.")