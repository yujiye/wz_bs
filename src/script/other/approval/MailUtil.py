# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
import time
import logging
import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart
import ConfigUtil

logging.basicConfig(filename='log.txt', level=logging.INFO, format=' %(asctime)s - %(levelname)s - %(message)s')


def sendMail(configFile, section, subject=0, context=0):
        
    config_mail = ConfigUtil.config2map(configFile, section)
    # 第三方 SMTP 服务
    mail_host=config_mail["mail.host"]  #设置服务器
    mail_user=config_mail["mail.user"]  #用户名
    mail_pass=config_mail["mail.pass"]  #口令 
     
    sender = config_mail["mail.sender"]
    receivers = config_mail["mail.receivers"].split(";")  # 接收邮件，可设置为你的QQ邮箱或者其他邮箱
    if subject == 0:
        subject = config_mail["mail.subject"] + " —— " + time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())
    else:
        subject = subject + " —— " + time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())
        
    if context == 0:
        context = config_mail["mail.context"] + " —— " + time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())
    else:
        context = context + " —— " + time.strftime("%Y-%m-%d %H:%M:%S", time.localtime())
    #创建一个带附件的实例
    message = MIMEMultipart('mixed')
    message['From'] = "系统邮件<%s>" % sender
    message['To'] =  ";".join(receivers)
    message['Subject'] = subject
    #邮件正文内容
    message.attach(MIMEText(context, 'plain', 'utf-8'))
    
     
    try:
        smtpObj = smtplib.SMTP() 
        smtpObj.connect(mail_host, 25)    # 25 为 SMTP 端口号
        smtpObj.login(mail_user,mail_pass)  
        smtpObj.sendmail(sender, receivers, message.as_string())
        logging.info("邮件发送成功")
    except smtplib.SMTPException:
        logging.info("Error: 无法发送邮件")
        
if __name__ == '__main__':
    l = "html"
    sendMail(configFile = "config/config_mail.ini", section = "mail", subject="数据断流提醒", context="文件为空"+l)