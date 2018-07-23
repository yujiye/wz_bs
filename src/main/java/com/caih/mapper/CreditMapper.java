package com.caih.mapper;

import com.caih.po.CreditRecord;

public interface CreditMapper {
    //根据company获取公司诚信记录
    CreditRecord findRecordByCompany(String company);
}
