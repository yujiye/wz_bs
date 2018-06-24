package com.caih.vo;

import java.util.List;

import com.caih.bo.TravelBaseUnit;
import com.caih.bo.TravelTouristUnit;

public class TravelData {
	
	private List<TravelTouristUnit> touristNum;//景点人次
	private List<TravelBaseUnit> touristSource;//游客来源
	private List<TravelBaseUnit> touristVehicle;//交通工具
	private List<TravelBaseUnit> touristApp;//游客APP
	private List<TravelBaseUnit> consumption;//消费能力
	private List<TravelBaseUnit> stayTime;//逗留时长
	private List<TravelBaseUnit> touristFlowDate;//日客流量
	private List<TravelBaseUnit> touristFlowWeek;//周客流量
	private List<TravelBaseUnit> touristFlowMonth;//月客流量
	
	public List<TravelTouristUnit> getTouristNum() {
		return touristNum;
	}
	public void setTouristNum(List<TravelTouristUnit> touristNum) {
		this.touristNum = touristNum;
	}
	public List<TravelBaseUnit> getTouristSource() {
		return touristSource;
	}
	public void setTouristSource(List<TravelBaseUnit> touristSource) {
		this.touristSource = touristSource;
	}
	public List<TravelBaseUnit> getTouristVehicle() {
		return touristVehicle;
	}
	public void setTouristVehicle(List<TravelBaseUnit> touristVehicle) {
		this.touristVehicle = touristVehicle;
	}
	public List<TravelBaseUnit> getTouristApp() {
		return touristApp;
	}
	public void setTouristApp(List<TravelBaseUnit> touristApp) {
		this.touristApp = touristApp;
	}
	public List<TravelBaseUnit> getConsumption() {
		return consumption;
	}
	public void setConsumption(List<TravelBaseUnit> consumption) {
		this.consumption = consumption;
	}
	public List<TravelBaseUnit> getStayTime() {
		return stayTime;
	}
	public void setStayTime(List<TravelBaseUnit> stayTime) {
		this.stayTime = stayTime;
	}
	public List<TravelBaseUnit> getTouristFlowDate() {
		return touristFlowDate;
	}
	public void setTouristFlowDate(List<TravelBaseUnit> touristFlowDate) {
		this.touristFlowDate = touristFlowDate;
	}
	public List<TravelBaseUnit> getTouristFlowWeek() {
		return touristFlowWeek;
	}
	public void setTouristFlowWeek(List<TravelBaseUnit> touristFlowWeek) {
		this.touristFlowWeek = touristFlowWeek;
	}
	public List<TravelBaseUnit> getTouristFlowMonth() {
		return touristFlowMonth;
	}
	public void setTouristFlowMonth(List<TravelBaseUnit> touristFlowMonth) {
		this.touristFlowMonth = touristFlowMonth;
	}

	
}
