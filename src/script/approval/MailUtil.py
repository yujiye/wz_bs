# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
import logging
import smtplib
from email.mime.text import MIMEText
from email.header import Header
from email.mime.multipart import MIMEMultipart
import ConfigUtil

def sendMail(configFile, section):
    
    
    config_mail = ConfigUtil.config2map(configFile, section)
    # 第三方 SMTP 服务
    mail_host=config_mail["mail.host"]  #设置服务器
    mail_user=config_mail["mail.user"]   #用户名
    mail_pass=config_mail["mail.pass"]  #口令 
     
    sender = config_mail["mail.sender"]
    receivers = config_mail["mail.receivers"].split(";")  # 接收邮件，可设置为你的QQ邮箱或者其他邮箱
    
    subject = config_mail["mail.subject"]
    context = config_mail["mail.context"]
    
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
        print "邮件发送成功"
    except smtplib.SMTPException:
        print "Error: 无法发送邮件"
        
if __name__ == '__main__':
    sendMail("config/config_mail.ini", "mail")