# -*- coding: utf-8 -*-
"""
Created on Mon Jul  9 20:18:12 2018

@author: lizhou
"""

#fileName默认为同一目录
import ConfigParser
import logging

logging.basicConfig(filename='log.txt', level=logging.INFO, format=' %(asctime)s - %(levelname)s - %(message)s')

def config2map(fileName, section):
    try:
        config = ConfigParser.ConfigParser()
        config.read(fileName)
        options = config.options(section)
        configMap = {}
        
        for i in options:
            configMap[i] = config.get(section=section, option=i)
            
        return configMap
    except:
        logging.error('no config.ini')
        return

def config2options(fileName, section):
    try:
        config = ConfigParser.ConfigParser()
        config.read(fileName)
        options = config.options(section)
            
        return options
    except:
        logging.error('no config.ini')
        return
