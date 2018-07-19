package com.caih.mapper;

import com.caih.po.CreditRecord;

public interface CreditMapper {
    CreditRecord findRecordByCompany(String company);
}
