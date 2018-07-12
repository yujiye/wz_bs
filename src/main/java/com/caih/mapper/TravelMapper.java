package com.caih.mapper;

import java.util.List;

import com.caih.po.TravelRecord;

public interface TravelMapper {
	List<TravelRecord> findVehicle();
	List<TravelRecord> findTouristSource();
	List<TravelRecord> findStayTime();
	List<TravelRecord> findTouristFolwHours();
	List<TravelRecord> findTouristFolwHoursbak(int nDay);
	List<TravelRecord> findTouristFolwHoursYesterday();
	List<TravelRecord> findConsumption();
	List<TravelRecord> findAppType();
	List<TravelRecord> findtouristFlowDate();
	List<TravelRecord> findtouristFlowWeek();
	List<TravelRecord> findtouristFlowMonth();
}
