package com.caih.mapper;

import java.util.List;

import com.caih.po.CurveRecord;
import com.caih.po.TrafficIndexRecord;
import com.caih.po.TrafficRecord;

public interface TrafficMapper {

	//获取一条交通数据记录
	TrafficRecord findNewOne();
	//获取高速路拥堵指数记录（因接口findNewOne()返回的高速拥堵指数为空）
	TrafficIndexRecord findIndexNewOne();
	//获取交通拥堵指数24小时内的变化曲线
	List<CurveRecord> findCurve();
}
