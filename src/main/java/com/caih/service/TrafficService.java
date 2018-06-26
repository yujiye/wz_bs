package com.caih.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.caih.bo.TrafficUnit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caih.mapper.TrafficMapper;
import com.caih.po.CurveRecord;
import com.caih.po.TrafficRecord;
import com.caih.vo.TrafficData;
import com.caih.vo.TrafficShow;

public class TrafficService {
	
	private ApplicationContext applicationContext = null;
	
	public TrafficService(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	private TrafficRecord getOneNewRecord(){
		TrafficRecord record = null;
		try{
			TrafficMapper recordmapper = (TrafficMapper) applicationContext.getBean("trafficMapper");
			record = recordmapper.findNewOne();
		}catch(Exception e){
			e.printStackTrace();
		}
		return record;
	}
	private List<CurveRecord> getCurveRecordList(){
		List<CurveRecord> curveRecords = null;
		try{
			TrafficMapper recordmapper = (TrafficMapper) applicationContext.getBean("trafficMapper");
			curveRecords = recordmapper.findCurve();
		}catch(Exception e){
			e.printStackTrace();
		}
		return curveRecords;
	}
	private Map<String,String> getCurve(){
		Map<String,String> map = new TreeMap<String,String>();
		List<CurveRecord> curveRecords = getCurveRecordList();
		for(CurveRecord e : curveRecords){
			map.put(e.getUpdatetime(),e.getCurrent_index());
		}
		return map;
	}
	private TrafficData getData(){
		TrafficData data = new TrafficData();
		
		try{
			TrafficRecord record = getOneNewRecord(); 
			Map<String,String> curve = getCurve();
			TrafficUnit trafficUnit = new TrafficUnit();
			//设置当前拥堵指数
			trafficUnit.setCurrent_index(record.getCurrent_index());
			trafficUnit.setWeek_rate(record.getWeek_rate());
			//设置拥堵里程
			trafficUnit.setAvg_congest(record.getAvg_congest());
			trafficUnit.setAvg_serious(record.getAvg_serious());
			trafficUnit.setAvg_slowly(record.getAvg_slowly());
			trafficUnit.setCongest(record.getCongest());
			trafficUnit.setSerious(record.getSerious());
			trafficUnit.setSlowly(record.getSlowly());
			//设置早晚高峰
			trafficUnit.setEvening_hour(record.getEvening_hour());
			trafficUnit.setMorning_hour(record.getMorning_hour());
			trafficUnit.setEvening_index(record.getEvening_index());
			trafficUnit.setMorning_index(record.getMorning_index());
			//设置道路拥堵指数
			trafficUnit.setGeneral_way_index(record.getGeneral_way_index());
			trafficUnit.setHighway_index(record.getHighway_index());
			trafficUnit.setGeneral_way_speed(record.getGeneral_way_speed());
			trafficUnit.setHighway_speed(record.getHighway_speed());
			trafficUnit.setGeneral_way_week_rate(record.getGeneral_way_week_rate());
			trafficUnit.setHighway_week_rate(record.getHighway_week_rate());

			data.setTrafficUnit(trafficUnit);
			data.setCurveMinute(curve);
		}catch(Exception e){
			e.printStackTrace();
		}
		return data;
	}
	
	public TrafficShow getShow(){
		TrafficShow trafficShow = new TrafficShow();
		TrafficData trafficData = getData();
		
		try{
			if(trafficData == null)
				throw new Exception("unable to get data!");
			trafficShow.setStatus("success");
			trafficShow.setData(trafficData);
		}catch(Exception e){
			e.printStackTrace();
			trafficShow.setStatus("failed");
		}
		
		return trafficShow;
	}
}
