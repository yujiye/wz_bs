package com.caih.vo;

import java.util.Map;

import com.caih.po.TrafficRecord;

public class TrafficData {

	private TrafficRecord trafficRecord;
	private Map<String,String> curveMinute;
	public TrafficRecord getTrafficRecord() {
		return trafficRecord;
	}
	public void setTrafficRecord(TrafficRecord trafficRecord) {
		this.trafficRecord = trafficRecord;
	}
	public Map<String, String> getCurveMinute() {
		return curveMinute;
	}
	public void setCurveMinute(Map<String, String> curveMinute) {
		this.curveMinute = curveMinute;
	}
	
}
