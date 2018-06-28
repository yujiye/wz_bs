package com.caih.service;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caih.bo.TravelBaseUnit;
import com.caih.bo.TravelTouristUnit;
import com.caih.mapper.TravelMapper;
import com.caih.po.TravelRecord;
import com.caih.vo.TravelData;
import com.caih.vo.TravelShow;

public class TravelService {
	private ApplicationContext applicationContext = null;
	TravelMapper travelMapper = null;
	
	public TravelService(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		travelMapper = (TravelMapper) applicationContext.getBean("travelMapper");
	}
	/*
	 * 功能 ： 获取去前nDay天时间
	 * */
	private Date getAgoTime(int nDay){
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
        c.add(Calendar.DATE, - nDay);
        return c.getTime();
	}
	private Map<String,String> travelRecordList2Map(List<TravelRecord> list){
		Map<String,String> map = new HashMap<String,String>();
		for(TravelRecord e : list){
			map.put(e.getTkey(),e.getTvalue());
		}
		return map;
	}
	//交通工具
	public List<TravelBaseUnit> getTouristVehicleNum(){
		List<TravelBaseUnit> list = new ArrayList<TravelBaseUnit>(); 
		List<TravelRecord> records = travelMapper.findVehicle();

		for(TravelRecord record : records){
			TravelBaseUnit baseunit = new TravelBaseUnit();
			baseunit.setName(record.getTname());
			baseunit.setValue(record.getTvalue());
			list.add(baseunit);
		}
		return list;
	}
	//逗留时间
	public List<TravelBaseUnit> getStayTime(){
		List<TravelBaseUnit> list = new ArrayList<TravelBaseUnit>(); 
		List<TravelRecord> records = travelMapper.findStayTime();
		
		for(TravelRecord record : records){
			TravelBaseUnit baseunit = new TravelBaseUnit();
			baseunit.setName(record.getTname());
			baseunit.setValue(record.getTvalue());
			list.add(baseunit);
		}
		return list;
	}
	//游客来源
	public List<TravelBaseUnit> getTouristSource(){
		List<TravelBaseUnit> list = new ArrayList<TravelBaseUnit>(); 
		List<TravelRecord> records = travelMapper.findTouristSource();
		for(TravelRecord record : records){
			TravelBaseUnit baseunit = new TravelBaseUnit();
			baseunit.setName(record.getTname());
			baseunit.setValue(record.getTvalue());
			list.add(baseunit);
		}
		return list;
	}
	//当日游客人数
	public List<TravelTouristUnit> getTouristFolwHours(){
		List<TravelTouristUnit> list = new ArrayList<TravelTouristUnit>(); 
		List<TravelRecord> records = travelMapper.findTouristFolwHours();
		List<TravelRecord> yesterdayRecords = travelMapper.findTouristFolwHoursYesterday();
		Map<String,String> yesterdayMap = travelRecordList2Map(yesterdayRecords);

		int sum = 0;
		int yesterdaySum = 0;
		//计算今天的当前总人数并赋值
		for(TravelRecord record : records){
			TravelTouristUnit baseunit = new TravelTouristUnit();
			baseunit.setName(record.getTname());
			baseunit.setNum(record.getTvalue());
			//获取昨天的人数
			baseunit.setDategrowth(yesterdayMap.get(record.getTkey()));
			sum = sum + Integer.parseInt(record.getTvalue());
			list.add(baseunit);
		}
		//计算昨天的同时刻的总人数
		for(String key : yesterdayMap.keySet()){
			yesterdaySum = yesterdaySum + Integer.parseInt(yesterdayMap.get(key));
		}

		TravelTouristUnit baseunit = new TravelTouristUnit();
		baseunit.setName("currentNum");
		baseunit.setNum(String.valueOf(sum));
		baseunit.setDategrowth(String.valueOf(yesterdaySum));
		list.add(0, baseunit);
		return list;
	}
	//消费
	public List<TravelBaseUnit> getConsumption(){
		List<TravelBaseUnit> list = new ArrayList<TravelBaseUnit>(); 
		List<TravelRecord> records = travelMapper.findConsumption();
		for(TravelRecord record : records){
			TravelBaseUnit baseunit = new TravelBaseUnit();
			baseunit.setName(record.getTname());
			baseunit.setValue(record.getTvalue());
			list.add(baseunit);
		}
		return list;
	}
	//App类型
	public List<TravelBaseUnit> getAppType(){
		List<TravelBaseUnit> list = new ArrayList<TravelBaseUnit>(); 
		List<TravelRecord> records = travelMapper.findAppType();		

		for(int i = 0; i < 10; i++){
			TravelBaseUnit baseunit = new TravelBaseUnit();
			baseunit.setName(records.get(i).getTname());
			baseunit.setValue(records.get(i).getTvalue());
			list.add(baseunit);
		}
		return list;
	}
	//月客流量
	public List<TravelBaseUnit> getTouristFlowMonth(){
		List<TravelBaseUnit> list = new ArrayList<TravelBaseUnit>(); 
		List<TravelRecord> records = travelMapper.findtouristFlowMonth();
		for(TravelRecord record : records){
			TravelBaseUnit baseunit = new TravelBaseUnit();
			baseunit.setName(record.getTkey());
			baseunit.setValue(record.getTvalue());
			list.add(baseunit);
		}
		return list;
	}
	//日客流量
	public List<TravelBaseUnit> getTouristFlowDate(){
		List<TravelBaseUnit> list = new ArrayList<TravelBaseUnit>(); 
		List<TravelRecord> records = travelMapper.findtouristFlowDate();
		for(TravelRecord record : records){
			TravelBaseUnit baseunit = new TravelBaseUnit();
			baseunit.setName(record.getTkey());
			baseunit.setValue(record.getTvalue());
			list.add(baseunit);
		}
		return list;
	}
	//周客流量
	public List<TravelBaseUnit> getTouristFlowWeek(){
		List<TravelBaseUnit> list = new ArrayList<TravelBaseUnit>(); 
		List<TravelRecord> records = travelMapper.findtouristFlowWeek();
		for(TravelRecord record : records){
			TravelBaseUnit baseunit = new TravelBaseUnit();
			baseunit.setName(record.getTkey());
			baseunit.setValue(record.getTvalue());
			list.add(baseunit);
		}
		return list;
	}
	public TravelData getData(){
		
		TravelData travelData = new TravelData();
		
		travelData.setTouristVehicle(getTouristVehicleNum());
		travelData.setStayTime(getStayTime());
		travelData.setTouristSource(getTouristSource());
		travelData.setTouristNum(getTouristFolwHours());
		travelData.setConsumption(getConsumption());
		travelData.setTouristApp(getAppType());
		
		travelData.setTouristFlowDate(getTouristFlowDate());
		travelData.setTouristFlowWeek(getTouristFlowWeek());
		travelData.setTouristFlowMonth(getTouristFlowMonth());
		return travelData;
	}
	
	public TravelShow getShow(){
		
		TravelShow travelShow = new TravelShow();
		
		travelShow.setStatus("success");
		travelShow.setData(getData());
		
		return travelShow;
	}
}
