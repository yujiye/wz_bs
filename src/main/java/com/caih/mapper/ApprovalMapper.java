package com.caih.mapper;

import com.caih.po.ApprovalRecord;

import java.util.List;

public interface ApprovalMapper {
    List<ApprovalRecord> findNew();
    ApprovalRecord findNewByKeyword(String keyword);
}
