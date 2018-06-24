package com.caih.mapper;

import java.util.List;

import com.caih.po.IhomeRecord;

public interface IhomeMapper {

	public List<IhomeRecord> findNew();
	public List<IhomeRecord> findNewById(String id);
}
