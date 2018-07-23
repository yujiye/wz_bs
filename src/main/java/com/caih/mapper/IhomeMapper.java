package com.caih.mapper;

import java.util.List;

import com.caih.po.IhomeRecord;

public interface IhomeMapper {

	//获取养老数据最新的数据，字段isnew为1表示最新
	List<IhomeRecord> findNew();
	//根据id获取养老数据最新的数据，字段isnew为1表示最新
	List<IhomeRecord> findNewById(String id);
}
