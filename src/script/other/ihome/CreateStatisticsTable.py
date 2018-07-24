# -*- coding: utf-8 -*-
"""
Created on Thu May 10 08:59:53 2018

@author: zaizhongyang
"""
import pymysql

statistics_id = {"老人年龄分布": "OldPeopleForAgeDistribution",
             "政府购买服务分布": "ServiceDistribution",
             "病情分布": "IllnessDistribution",
             "商家类型分布": "MerchantTypeDistribution",
             "月服务次数统计": "ServiceMonthCount",
             "月服务时长统计": "ServiceMonthDuration",
             "通话状态分布": "CallStatusDistribution",
             "已接电话、呼出电话统计": "CallCount"
             }




sql = """create table ihome.z_statistics_table( 
   statistics_id varchar(32), 
   statistics_name varchar(32),
   id_comment varchar(128),
   bussiness_key varchar(64),
   bussiness_value1 varchar(64),
   bussiness_value2 varchar(64),
   bussiness_value3 varchar(64),
   isnew varchar(8),
   spider_time timestamp NOT NULL default current_timestamp
)"""

if __name__ == '__main__':
    host="localhost"
    port=3306
    user="root"
    passwd="root"
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
        print "Create Table Success."
    except:
       print "Error: unable to create table z_statistics_table, it is exists possibly."
    # 关闭数据库连接
    db.close()