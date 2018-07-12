package com.caih.mapper;

import java.util.List;

import com.caih.po.CurveRecord;
import com.caih.po.TrafficIndexRecord;
import com.caih.po.TrafficRecord;

public interface TrafficMapper {

	TrafficRecord findNewOne();
	TrafficIndexRecord findIndexNewOne();
	List<CurveRecord> findCurve();
}
