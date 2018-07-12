package com.caih.mapper;

import java.util.List;

import com.caih.po.IhomeRecord;

public interface IhomeMapper {

	List<IhomeRecord> findNew();
	List<IhomeRecord> findNewById(String id);
}
