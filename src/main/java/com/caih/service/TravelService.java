package com.caih.service;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caih.bo.TravelBaseUnit;
import com.caih.bo.TravelTouristUnit;
import com.caih.mapper.TravelMapper;
import com.caih.po.TravelRecord;
import com.caih.vo.TravelData;
import com.caih.vo.TravelShow;
import org.springframework.stereotype.Service;

@Service
public class TravelService {

	@Autowired
	TravelMapper travelMapper;
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
	//当日游客人数-修复bug
	public List<TravelTouristUnit> getTouristFolwHoursbak(){
		List<TravelTouristUnit> list = new ArrayList<TravelTouristUnit>();
		List<TravelRecord> records = null;
		List<TravelRecord> yesterdayRecords = null;
		//nday表示前nday天
		int nday = 0;
		while(records == null || records.isEmpty()){
			//获取今天的游客数量，循环保证数据断档时仍能取到历史数据
			records = travelMapper.findTouristFolwHoursbak( nday );
			nday++;
			if( nday > 15) {
				return list;
			}
		}
		while (yesterdayRecords == null || yesterdayRecords.isEmpty()) {
			//获取昨天的游客数量，循环保证数据断档时仍能取到历史数据
			yesterdayRecords = travelMapper.findTouristFolwHoursbak( nday );
			nday++;
			if( nday > 20) {
				return list;
			}
		}
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
	//景区承载量
	public List<TravelBaseUnit> getCapacity(){
		List<TravelBaseUnit> list = new ArrayList<TravelBaseUnit>();
		List<TravelRecord> records = null;
		int nDay = 0;
		while(records == null || records.isEmpty()) {
			records = travelMapper.findTouristFolwHoursCapacity(nDay);
			nDay++;
		}
		for(TravelRecord record : records){
			float percent = 0.0f;
			TravelBaseUnit baseunit = new TravelBaseUnit();
			switch (record.getTkey()){
				case "450403003000003": percent = (Integer.parseInt( record.getTvalue().trim() ) / 8000.0f); break;//珠山景区
				case "450403003000005": percent = (Integer.parseInt( record.getTvalue().trim() ) / 30000.0f); break;//白云山公园
				case "450423003000003": percent = (Integer.parseInt( record.getTvalue().trim() ) / 4000.0f); break;//梁羽生公园
				case "450422003000002": percent = (Integer.parseInt( record.getTvalue().trim() ) / 2000.0f); break;//黎寨蝴蝶谷
				case "450423003000001": percent = (Integer.parseInt( record.getTvalue().trim() ) / 10000.0f); break;//蒙山县永安王城景区
				case "450422003000001": percent = (Integer.parseInt( record.getTvalue().trim() ) / 15000.0f); break;//藤县石表山休闲旅游景区
				case "450481003000001": percent = (Integer.parseInt( record.getTvalue().trim() ) / 1000.0f); break;//天龙顶山地公园
				case "450403003000001": percent = (Integer.parseInt( record.getTvalue().trim() ) / 38000.0f); break;//梧州骑楼城—龙母庙景区
				case "450403003000004": percent = (Integer.parseInt( record.getTvalue().trim() ) / 10000.0f); break;//梧州市中山公园
			}
			//保留四位小数
			percent = (float)(Math.round(percent*10000))/10000;
			baseunit.setName(record.getTname());
			baseunit.setValue(String.valueOf(percent));
			if(baseunit.getValue().startsWith("0.") && !baseunit.getValue().endsWith("0.0")) {
				list.add(baseunit);
			}
		}
		//根据百分率进行从高到低排序
		Collections.sort(list, new Comparator<TravelBaseUnit>() {
			@Override
			public int compare(TravelBaseUnit o1, TravelBaseUnit o2) {
				return o2.getValue().compareTo( o1.getValue() );
			}
		});
		return list;
	}
	public TravelData getData(){
		
		TravelData travelData = new TravelData();
		
		travelData.setTouristVehicle(getTouristVehicleNum());
		travelData.setStayTime(getStayTime());
		travelData.setTouristSource(getTouristSource());
		travelData.setTouristNum(getTouristFolwHoursbak());
		travelData.setConsumption(getConsumption());
		travelData.setTouristApp(getAppType());
		travelData.setScenicCapacity(getCapacity());
		
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
