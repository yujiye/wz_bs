package com.caih.mapper;

import java.util.List;

import com.caih.po.TravelRecord;

public interface TravelMapper {
	public List<TravelRecord> findVehicle();
	public List<TravelRecord> findTouristSource();
	public List<TravelRecord> findStayTime();
	public List<TravelRecord> findTouristFolwHours();
	public List<TravelRecord> findTouristFolwHoursbak(int nDay);
	public List<TravelRecord> findTouristFolwHoursYesterday();
	public List<TravelRecord> findConsumption();
	public List<TravelRecord> findAppType();
	public List<TravelRecord> findtouristFlowDate();
	public List<TravelRecord> findtouristFlowWeek();
	public List<TravelRecord> findtouristFlowMonth();
}
