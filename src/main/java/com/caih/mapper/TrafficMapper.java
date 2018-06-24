package com.caih.mapper;

import java.util.List;

import com.caih.po.CurveRecord;
import com.caih.po.TrafficRecord;

public interface TrafficMapper {

	public TrafficRecord findNewOne();
	public List<CurveRecord> findCurve();
}
