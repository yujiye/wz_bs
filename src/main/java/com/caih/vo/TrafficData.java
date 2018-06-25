package com.caih.vo;

import java.util.Map;

import com.caih.bo.TrafficUnit;
import com.caih.po.TrafficRecord;

public class TrafficData {

	private TrafficUnit trafficUnit;
	private Map<String,String> curveMinute;

	public TrafficUnit getTrafficUnit() {
		return trafficUnit;
	}

	public void setTrafficUnit(TrafficUnit trafficUnit) {
		this.trafficUnit = trafficUnit;
	}
	public Map<String, String> getCurveMinute() {
		return curveMinute;
	}
	public void setCurveMinute(Map<String, String> curveMinute) {
		this.curveMinute = curveMinute;
	}
	
}
