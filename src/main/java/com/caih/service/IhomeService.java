package com.caih.service;

import java.util.*;

import com.caih.bo.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caih.mapper.IhomeMapper;
import com.caih.po.IhomeRecord;
import com.caih.vo.IhomeData;
import com.caih.vo.IhomeShow;

public class IhomeService {
	
	private ApplicationContext applicationContext = null;
	private List<IhomeRecord> records = null;
	
	public IhomeService(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		records = getRecords();
	}
	
	private List<IhomeRecord> getRecords(){
		List<IhomeRecord> records = null;
		try{
			IhomeMapper recordmapper = (IhomeMapper) applicationContext.getBean("ihomeMapper");
			records = recordmapper.findNew();
		}catch(Exception e){
			e.printStackTrace();
		}
		return records;
	}
	private List<IhomeRecord> getRecordsById(String id){
		List<IhomeRecord> records = null;
		try{
			IhomeMapper recordmapper = (IhomeMapper) applicationContext.getBean("ihomeMapper");
			records = recordmapper.findNewById(id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return records;
	}
	//id=2为政府购买服务分布，id=3为病情分布，id=4为商家类型分布，id=14为用户数量
	private Map<String, Object> getMapsData(String id){
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> tmpmap = new HashMap<String, Object>();
		
		List<IhomeRecord> mapsData = getRecordsById(id);
		for(IhomeRecord record : mapsData){
			tmpmap.put(record.getBussiness_key(), record.getBussiness_value1());
		}
		map.put(mapsData.get(0).getStatistics_name(), tmpmap);
		return map;
	}
	private Map<String, Object> getServiceData(){
		Map<String, Object> map = new TreeMap<String, Object>();
		Map<String, Object> tmpmapcout = new TreeMap<String, Object>();
		Map<String, Object> tmpmaptime = new TreeMap<String, Object>();
		
		List<IhomeRecord> mapsData = getRecordsById("5");
		int sum = 0;
		for(IhomeRecord record : mapsData){
			String serviceNumStr = record.getBussiness_value1();
			sum = sum + Integer.parseInt(serviceNumStr);
			tmpmapcout.put(record.getBussiness_key(), serviceNumStr);
			tmpmaptime.put(record.getBussiness_key(), record.getBussiness_value2());
		}
//		月总服务次数-ServiceTotalNumMonth
//		月服务次数-ServiceNumMonth
//		月服务时长-ServiceTimeMonth
		map.put("serviceTotalNumMonth", String.valueOf(sum));
		map.put("serviceNumMonth", tmpmapcout);
		map.put("serviceTimeMonth", tmpmaptime);
		return map;
	}
	private Map<String, Object> getPeopleNum(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<IhomeRecord> onlineRecord = getRecordsById("12");
		List<IhomeRecord> offlineRecord = getRecordsById("13");
		
		String onlineNumstr = onlineRecord.get(0).getBussiness_value1();
		String offlineNumstr = offlineRecord.get(0).getBussiness_value1();
		int onlineNum = Integer.parseInt(onlineNumstr);
		int offlineNum = Integer.parseInt(offlineNumstr);
		int totalNum = onlineNum + offlineNum;
//		线上服务数-OnlineServiceNum
//		线下服务数-OfflineServiceNum
//		总服务数-CurrentServiceNum
		map.put("onlineServiceNum", onlineNumstr);
		map.put("offlineServiceNum", offlineNumstr);
		map.put("currentServiceNum", String.valueOf(totalNum));
		
		return map;
	}
	private Map<String, Object> getEvaluateData(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<IhomeRecord> evaluates = getRecordsById("9");
		float sum = 0;
		for(IhomeRecord record : evaluates){
			if( record.getBussiness_key().equals("强烈推荐") 
					|| record.getBussiness_key().equals("很满意")
					|| record.getBussiness_key().equals("满意")){
				sum = sum + Float.parseFloat(record.getBussiness_value1());
			}
		}
//		满意率-SatisfactionRate
		map.put("satisfactionRate", String.valueOf(sum));
		return map;
	}
	private IhomeServicePurchase getIhomeServicePurchase(){
		IhomeServicePurchase ihomeServicePurchase = new IhomeServicePurchase();
		Map<String, String> servicePurchase = (Map<String, String>) getMapsData("2").get("政府购买服务分布");//政府购买服务分布
		
		ihomeServicePurchase.setTotalNum(servicePurchase.get("总记录数"));
		ihomeServicePurchase.setOther(servicePurchase.get("--无--"));
		ihomeServicePurchase.setSanWu(servicePurchase.get("三无"));
		ihomeServicePurchase.setWuBao(servicePurchase.get("五保"));
		ihomeServicePurchase.setDiBao(servicePurchase.get("低保"));
		ihomeServicePurchase.setKunNanLaoRen(servicePurchase.get("困难老人"));
		ihomeServicePurchase.setShiDu(servicePurchase.get("失独"));
		ihomeServicePurchase.setShiNeng(servicePurchase.get("失能"));
		ihomeServicePurchase.setCanJi(servicePurchase.get("残疾"));
		ihomeServicePurchase.setKongChao(servicePurchase.get("空巢"));
		ihomeServicePurchase.setKeyEntitled(servicePurchase.get("重点优抚对象"));
		ihomeServicePurchase.setGaoLing(servicePurchase.get("高龄"));
		return ihomeServicePurchase;
	}
	private IhomeIll getIhomeIll(){
		IhomeIll ihomeIll = new IhomeIll();
		Map<String, String> ill = (Map<String, String>) getMapsData("3").get("病情分布");//病情分布
		ihomeIll.setBaineizhang(ill.get("白内障"));
		ihomeIll.setFengshi(ill.get("风湿"));
		ihomeIll.setGaoxueya(ill.get("高血压"));
		ihomeIll.setGuanxin(ill.get("冠心病"));
		ihomeIll.setNormal(ill.get("正常"));
		ihomeIll.setOther(ill.get("其他"));
		ihomeIll.setShenjieshi(ill.get("肾结石"));
		ihomeIll.setShili(ill.get("视力障碍"));
		ihomeIll.setTangniao(ill.get("糖尿病"));
		ihomeIll.setTotalNum(ill.get("总记录"));
		ihomeIll.setXinzang(ill.get("心脏病"));
		ihomeIll.setZhongfeng(ill.get("中风"));
		return ihomeIll;
	}
	private IhomeMerchantType getIhomeMerchantType(){
		IhomeMerchantType ihomeMerchantType = new IhomeMerchantType();
		Map<String, String> merchantType = (Map<String, String>) getMapsData("4").get("商家类型分布");//商家类型分布
		ihomeMerchantType.setFazhi(merchantType.get("法制服务"));
		ihomeMerchantType.setJiazheng(merchantType.get("家政服务"));
		ihomeMerchantType.setShebao(merchantType.get("社会保障"));
		ihomeMerchantType.setWaimai(merchantType.get("美食外卖"));
		ihomeMerchantType.setWangdian(merchantType.get("服务网点"));
		ihomeMerchantType.setWeixiu(merchantType.get("综合维修"));
		ihomeMerchantType.setYiliao(merchantType.get("医疗保健"));
		ihomeMerchantType.setYule(merchantType.get("休闲娱乐"));
		return ihomeMerchantType;
	}
	private IhomeUserNum getIhomeUserNum(){
		IhomeUserNum ihomeUserNum = new IhomeUserNum();
		Map<String, String> userNum = (Map<String, String>) getMapsData("14").get("用户数量");//用户数量
		ihomeUserNum.setHugong(userNum.get("护工"));
		ihomeUserNum.setShangjia(userNum.get("商家"));
		ihomeUserNum.setShegong(userNum.get("社工"));
		ihomeUserNum.setYigong(userNum.get("义工"));
		ihomeUserNum.setZhiyuanzhe(userNum.get("青年志愿者"));
		return ihomeUserNum;
	}

	private List<IhomeBaseUnit> getIhomeServicePurchaseA(){
		List<IhomeBaseUnit> list = new ArrayList<IhomeBaseUnit>();
//		Map<String, String> servicePurchase = (Map<String, String>) getMapsData("2").get("政府购买服务分布");//政府购买服务分布
		List<IhomeRecord> servicePurchase = getRecordsById("2");
		for(IhomeRecord e : servicePurchase){
			IhomeBaseUnit tmp = new IhomeBaseUnit();
			tmp.setName(e.getBussiness_key());
			tmp.setValue(e.getBussiness_value1());
			list.add(tmp);
		}
		return list;
	}
	private List<IhomeBaseUnit> getIhomeIllA(){
		List<IhomeBaseUnit> list = new ArrayList<IhomeBaseUnit>();
//		Map<String, String> ill = (Map<String, String>) getMapsData("3").get("病情分布");//病情分布
		List<IhomeRecord> ill = getRecordsById("3");
		for(IhomeRecord e : ill){
			IhomeBaseUnit tmp = new IhomeBaseUnit();
			tmp.setName(e.getBussiness_key());
			tmp.setValue(e.getBussiness_value1());
			list.add(tmp);
		}
		return list;
	}
	private List<IhomeBaseUnit> getIhomeMerchantTypeA(){
		List<IhomeBaseUnit> list = new ArrayList<IhomeBaseUnit>();
//		Map<String, String> merchantType = (Map<String, String>) getMapsData("4").get("商家类型分布");//商家类型分布
		List<IhomeRecord> merchantType = getRecordsById("4");
		for(IhomeRecord e : merchantType){
			IhomeBaseUnit tmp = new IhomeBaseUnit();
			tmp.setName(e.getBussiness_key());
			tmp.setValue(e.getBussiness_value1());
			list.add(tmp);
		}
		return list;
	}
	private List<IhomeBaseUnit> getIhomeUserNumA(){
		List<IhomeBaseUnit> list = new ArrayList<IhomeBaseUnit>();
//		Map<String, String> userNum = (Map<String, String>) getMapsData("14").get("用户数量");//用户数量
		List<IhomeRecord> userNum = getRecordsById("14");
		for(IhomeRecord e : userNum){
			IhomeBaseUnit tmp = new IhomeBaseUnit();
			tmp.setName(e.getBussiness_key());
			tmp.setValue(e.getBussiness_value1());
			list.add(tmp);
		}
		return list;
	}
	private IhomeData combineData(){
		IhomeData ihomeData = new IhomeData();
		Map<String, Object> peopleNum = getPeopleNum();
		Map<String, Object> serviceData = getServiceData();
		//当前总人数
		ihomeData.setCurrentServiceNum((String) peopleNum.get("currentServiceNum"));
		//线上人数
		ihomeData.setOnlineServiceNum((String) peopleNum.get("onlineServiceNum"));
		//线下人数
		ihomeData.setOfflineServiceNum((String) peopleNum.get("offlineServiceNum"));
		//满意率
		ihomeData.setSatisfactionRate((String) getEvaluateData().get("satisfactionRate"));
		//月总服务次数
		ihomeData.setServiceTotalNumMonth((String) serviceData.get("serviceTotalNumMonth"));
		//月服务次数
		ihomeData.setServiceNumMonth((Map<String, String>) serviceData.get("serviceNumMonth"));
		//月服务时长
		ihomeData.setServiceTimeMonth((Map<String, String>) serviceData.get("serviceTimeMonth"));
		//政府购买服务分布
		ihomeData.setServicePurchase(getIhomeServicePurchaseA());
		//病情分布
		ihomeData.setIll(getIhomeIllA());
		//商家类型分布
		ihomeData.setMerchantType(getIhomeMerchantTypeA());
		//用户数量
		ihomeData.setUserNum(getIhomeUserNumA());
		return ihomeData;
	}
	private IhomeData getData(){
		/*
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "success");
		map.putAll( getMapsData("2") );//政府购买服务分布
		map.putAll( getMapsData("3") );//病情分布
		map.putAll( getMapsData("4") );//商家类型分布
		map.putAll( getMapsData("14") );//用户数量
		map.putAll( getPeopleNum() );//线上线下人数
		map.putAll( getServiceData() );//服务次数和服务时长
		map.putAll( getEvaluateData() );//满意率
		return map;
		*/
		return combineData();
		
	}
	public IhomeShow getShow(){
		IhomeShow ihomeShow = new IhomeShow();
		IhomeData ihomeData = getData();

		try{
			if(ihomeData == null)
				throw new Exception("unable to get data!");
			ihomeShow.setStatus("seccess");
			ihomeShow.setData(ihomeData);
		}catch(Exception e){
			ihomeShow.setStatus("failed");
			e.printStackTrace();
		}

		return ihomeShow;
	}
}
