package com.caih.util;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时从国信接口拉取数据的工具类
 * 
 */
//@Component
public class GetJsonFromInterfaceUtil {
	private static Logger logger = LoggerFactory.getLogger(GetJsonFromInterfaceUtil.class);
	

	@Scheduled(cron = "0/10 * * * * ?") // 执行一分钟拉取数据的定时任务
	// @Scheduled(fixedDelay = 5000)
	public void lineNumberServiceMethod() {
		int i=0;
		System.out.println((i++)+"taskJob:::"+new Date());
	
		logger.info("taskJob start");
	}

}