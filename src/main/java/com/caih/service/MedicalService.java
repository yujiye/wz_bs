package com.caih.service;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.TreeMap;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.caih.util.HttpRequestProxyUtils;
import com.caih.vo.MedicalData;
import com.caih.vo.MedicalShow;
import org.springframework.stereotype.Service;

@Service
public class MedicalService {
	
	private String URL2JsonText(String url){
		String content = HttpRequestProxyUtils.sendGet(url, null);
		return content;
	}
	
	private String JSON2JsonObjectString(String jsonText){
		JSONObject object = (JSONObject) JSONObject.parse(jsonText); 	
		return object.getJSONObject("data").getString("count");
	}
	
	private Map<String, String> JsonArray2Map(String jsonText){
		Map<String, String> map = new TreeMap<String,String>();
		JSONObject object = (JSONObject) JSONObject.parse(jsonText); 
		JSONArray arr = object.getJSONArray("data");
		for(int i = 0; i < arr.size(); i++){
			String key = arr.getJSONObject(i).getString("name");
			String value = arr.getJSONObject(i).getString("count");
			map.put(key, value);
		}
		return map;
	}
	public MedicalData combineData(){
		MedicalData medicalData = new MedicalData();
		
		String medicalUrl = "http://10.67.239.52:8080/wzhmc/getOrgNum?messageid=9E372BAE-01CE-4649-8B7E-E1407D7F6F6B&keyword=接入医疗机构数量";
		String dateResNumUrl = "http://10.67.239.52:8080/wzhmc/getResFromPlat?messageid=9E372BAE-01CE-4649-8B7E-E1407D7F6F6B&keyword=今日累计预约量";
		String healthRecordNumUrl = "http://10.67.239.52:8080/wzhmc/getHealthRecord?messageid=9E372BAE-01CE-4649-8B7E-E1407D7F6F6B&keyword=健康档案查询总累计量";
		String hcpSignedNumUrl = "http://10.67.239.52:8080/wzhmc/getHcpSigned?messageid=9E372BAE-01CE-4649-8B7E-E1407D7F6F6B&keyword=家庭医生签约总累计量";
		
		String medicalJsonText = null;
		try {
			medicalJsonText = new String(URL2JsonText(medicalUrl).getBytes("GBK"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String dateResNum = JSON2JsonObjectString(URL2JsonText(dateResNumUrl));
		String healthRecordNum = JSON2JsonObjectString(URL2JsonText(healthRecordNumUrl));
		String hcpSignedNum = JSON2JsonObjectString(URL2JsonText(hcpSignedNumUrl));

		Map<String, String> medicalmap = JsonArray2Map(medicalJsonText);

		medicalData.setOrgNum(medicalmap.get("接入医疗机构"));
		medicalData.setOrgNumCity(medicalmap.get("接入医疗机构(市级)"));
		medicalData.setOrgNumCounty(medicalmap.get("接入医疗机构(县级)"));
		medicalData.setOrgNumCommunity(medicalmap.get("接入医疗机构(社区服务)"));
		medicalData.setDateResNum(dateResNum);
		medicalData.setHealthRecordNum(healthRecordNum);
		medicalData.setHcpSignedNum(hcpSignedNum);
		return medicalData;
	}
	public MedicalData combineDataText(){
		
		MedicalData medicalData = new MedicalData();		
		//test
		String medicalJsonText = "{\"data\":[{\"name\":\"接入医疗机构\",\"count\":112},{\"name\":\"接入医疗机构(市级)\",\"count\":15},{\"name\":\"接入医疗机构(县级)\",\"count\":96},{\"name\":\"接入医疗机构(社区服务)\",\"count\":7}],\"messageid\":\"9E372BAE-01CE-4649-8B7E-E1407D7F6F6B\",\"message\":\"\",\"status\":1}";
		String dateResNumText = "{\"data\":{\"count\":0},\"messageid\":\"9E372BAE-01CE-4649-8B7E-E1407D7F6F6B\",\"message\":\"\",\"status\":1}";
		String healthRecordNumText = "{\"data\":{\"count\":429},\"messageid\":\"9E372BAE-01CE-4649-8B7E-E1407D7F6F6B\",\"message\":\"\",\"status\":1}";
		String hcpSignedNumText = "{\"data\":{\"count\":132636},\"messageid\":\"9E372BAE-01CE-4649-8B7E-E1407D7F6F6B\",\"message\":\"\",\"status\":1}";
		String dateResNum = JSON2JsonObjectString(dateResNumText);
		String healthRecordNum = JSON2JsonObjectString(healthRecordNumText);
		String hcpSignedNum = JSON2JsonObjectString(hcpSignedNumText);

		Map<String, String> medicalmap = JsonArray2Map(medicalJsonText);
		medicalData.setOrgNum(medicalmap.get("接入医疗机构"));
		medicalData.setOrgNumCity(medicalmap.get("接入医疗机构(市级)"));
		medicalData.setOrgNumCounty(medicalmap.get("接入医疗机构(县级)"));
		medicalData.setOrgNumCommunity(medicalmap.get("接入医疗机构(社区服务)"));
		medicalData.setDateResNum(dateResNum);
		medicalData.setHealthRecordNum(healthRecordNum);
		medicalData.setHcpSignedNum(hcpSignedNum);
		return medicalData;
	}
	
	public MedicalShow getShow(){
		MedicalShow medicalShow = new MedicalShow();
		try{
			medicalShow.setStatus("success");
			medicalShow.setData(combineData());
		}catch(Exception e){
			medicalShow.setStatus("failed");
			e.printStackTrace();
		}
		return medicalShow;
	}
}
