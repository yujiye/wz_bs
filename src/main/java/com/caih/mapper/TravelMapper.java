package com.caih.mapper;

import com.caih.po.TravelRecord;

import java.util.List;

public interface TravelMapper {
	//返回三十天内游客交通工具数量总和
	List<TravelRecord> findVehicle();
	//返回三十天内游客来源省份地市总和
	List<TravelRecord> findTouristSource();
	//返回三十天内游客游客逗留时长总和
	List<TravelRecord> findStayTime();
	//获取当前小时段游客量
	List<TravelRecord> findTouristFolwHours();
	/**
	 * function:获取当前小时段前nDay天对应时间段的游客量
	 * param:nDay表示当前小时段前nDay天对应时段
	 * result:
	 */
 	List<TravelRecord> findTouristFolwHoursbak(int nDay);
	/**
	 * function:获取当前小时段前nDay天对应时间段的景区的承载率
	 * param:nDay表示当前小时段前nDay天对应时段
	 * result:
	 */
	List<TravelRecord> findTouristFolwHoursCapacity(int nDay);
	//获取昨天对应小时段游客量
	List<TravelRecord> findTouristFolwHoursYesterday();
	//返回三十天内游客消费特征
	List<TravelRecord> findConsumption();
	//返回三十天内游客APP使用量
	List<TravelRecord> findAppType();
	//返回日客流量统计数据
	List<TravelRecord> findtouristFlowDate();
	//返回周客流量统计数据
	List<TravelRecord> findtouristFlowWeek();
	//返回月客流量统计数据
	List<TravelRecord> findtouristFlowMonth();
}
