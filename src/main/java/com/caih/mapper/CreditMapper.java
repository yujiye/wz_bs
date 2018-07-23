package com.caih.mapper;

import com.caih.po.CreditRecord;

import java.util.List;

public interface CreditMapper {
    //根据company获取公司诚信记录
    List<CreditRecord> findRecordByCompany(String company);
}
