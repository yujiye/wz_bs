package com.caih.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
	private TrafficData getShowData(){
		TrafficData data = new TrafficData();
		
		try{
			TrafficRecord record = getOneNewRecord(); 
			Map<String,String> curve = getCurve();
			
			data.setTrafficRecord(record);
			data.setCurveMinute(curve);
		}catch(Exception e){
			e.printStackTrace();
		}
		return data;
	}

	private TrafficData getData(){
		return getShowData();
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
