package com.caih.service;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caih.bo.TravelBaseUnit;
import com.caih.bo.TravelTouristUnit;
import com.caih.mapper.TravelMapper;
import com.caih.mapper.VehicletypeMapper;
import com.caih.po.Scenicflowhours;
import com.caih.po.TravelRecord;
import com.caih.po.Vehicletype;
import com.caih.po.VehicletypeExample;
import com.caih.vo.TravelData;
import com.caih.vo.TravelShow;

public class TravelService {
	private ApplicationContext applicationContext = null;
	TravelMapper travelMapper = null;
	VehicletypeMapper vehicletypeMapper = null;
	
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
	
	private List<Scenicflowhours> getTodayData(){
		
		return null;
	}
	private List<Vehicletype> getMonthAgoVehicletypeData(){
		
		Date currentTime = getAgoTime(0);//当前时间
		Date monthAgoTime = getAgoTime(31);//一个月前时间
		
		VehicletypeExample vtExample = new VehicletypeExample();
		VehicletypeExample.Criteria criteria = vtExample.createCriteria();
		criteria.andCreateTimeBetween(monthAgoTime, currentTime);//设置查询条件
		
		List<Vehicletype> list = vehicletypeMapper.selectByExample(vtExample);
		return list;
	}
	
	public List<TravelTouristUnit> getTouristNum(){
		List<TravelTouristUnit> list = new ArrayList<TravelTouristUnit>();
		TravelTouristUnit temp = new TravelTouristUnit();
		
		List<Scenicflowhours> sfhList =  getTodayData();
		
		return list;
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
		int sum = 0;
		for(TravelRecord record : records){
			TravelTouristUnit baseunit = new TravelTouristUnit();
			baseunit.setName(record.getTname());
			baseunit.setNum(record.getTvalue());
			sum = sum + Integer.parseInt(record.getTvalue());
			list.add(baseunit);
		}
		TravelTouristUnit baseunit = new TravelTouristUnit();
		baseunit.setName("currentNum");
		baseunit.setNum(String.valueOf(sum));
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
