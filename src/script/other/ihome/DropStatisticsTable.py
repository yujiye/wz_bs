# -*- coding: utf-8 -*-
"""
Created on Thu May 10 08:59:53 2018

@author: zaizhongyang
"""
import pymysql

sql = """drop table ihome.z_statistics_table"""


if __name__ == '__main__':
    host="localhost"
    port=3306
    user="lizhou"
    passwd="lizhou"
    dbName="ihome"
    charset='utf8'
    # 打开数据库连接
    db = pymysql.connect(host=host,
                         port=port,
                         user=user,
                         passwd=passwd,
                         db=dbName,
                         charset=charset)
    cursor = db.cursor()
#    建数据表    
    try:
        #执行SQL语句
        cursor.execute(sql)
        print "Drop Table Success."
    except:
       print "Error: unable to drop table z_statistics_table, it is not exists possibly."
    # 关闭数据库连接
    db.close()