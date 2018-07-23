package com.caih.mapper;

import com.caih.po.ApprovalRecord;

import java.util.List;

public interface ApprovalMapper {

    //获取政务数据最新的数据，字段isnew为1表示最新
    List<ApprovalRecord> findNew();

    //根据id获取政务数据最新的数据，字段isnew为1表示最新
    ApprovalRecord findNewByKeyword(String keyword);
}
