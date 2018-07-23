package com.caih.service.Impl;


import com.caih.mapper.ApprovalMapper;
import com.caih.po.ApprovalRecord;
import com.caih.service.ApprovalService;
import com.caih.vo.ApprovalData;
import com.caih.vo.ApprovalShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ApprovalServiceImpl implements ApprovalService {
    @Autowired
    private ApprovalMapper approvalMapper;
    private Map<String, String> ApprovalRecordList2Map(List<ApprovalRecord> list){
        Map<String, String> map = new HashMap<String, String>();
        for(ApprovalRecord e : list){
            map.put(e.getKeyword(), e.getData());
        }
        return map;
    }
    private ApprovalData getData(){
        ApprovalData approvalData = new ApprovalData();
        List<ApprovalRecord> approvalRecordList = approvalMapper.findNew();
        Map<String, String> map = ApprovalRecordList2Map(approvalRecordList);
        //当前排队人数
        approvalData.setLinenumber(map.get("linenumber"));
        //今日累计受理
        approvalData.setAccepttoday(map.get("accepttoday"));
        //累计受理业务
        approvalData.setAcceptsum(map.get("acceptsum"));
        //平均受理时长
        approvalData.setAcceptaverage(map.get("acceptaverage"));
        //出证总数&累计出证
        approvalData.setHallissuing(map.get("hallissuing"));
        //在途业务
        approvalData.setOnwork(map.get("onwork"));

        return approvalData;
    }

    public ApprovalShow getShow(){
        ApprovalShow approvalShow = new ApprovalShow();
        approvalShow.setStatus("success");
        approvalShow.setData(getData());
        return approvalShow;
    }
}
