package com.caih.service.Impl;

import com.caih.mapper.CreditMapper;
import com.caih.po.CreditRecord;
import com.caih.service.CreditService;
import com.caih.vo.CreditData;
import com.caih.vo.CreditShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:lizhou
 * @data: 2018/7/23 14:28
 */
@Service
public class CreditServiceImpl implements CreditService {

    @Autowired
    CreditMapper creditMapper;

    private List<CreditRecord> getCreditRecrds(String company){
        List<CreditRecord> creditRecords = creditMapper.findRecordByCompany(company);
        return creditRecords;
    }
    @Override
    public CreditShow getShowByCompany(String company) {
        CreditShow creditShow = new CreditShow();
        if( company == null ){
            return creditShow;
        }
        List<CreditRecord> creditRecords = getCreditRecrds(company);
        List<CreditData> creditDataList = new ArrayList<CreditData>();
        //能查到记录则显示记录
        if( creditRecords != null && !creditRecords.isEmpty() ){

            creditShow.setStatus(creditRecords.get(0).getStatus());
            creditShow.setCompany(creditRecords.get(0).getCompany());
            creditShow.setCreatetime(creditRecords.get(0).getCreatetime());

            for(CreditRecord record : creditRecords){
                CreditData tmpCreditData = new CreditData();
                tmpCreditData.setCertificate(record.getCertificate());
                tmpCreditData.setContent(record.getContent());
                tmpCreditData.setDeadline(record.getDeadline());
                tmpCreditData.setDepartment(record.getDepartment());
                tmpCreditData.setEffectivedate(record.getEffectivedate());
                creditDataList.add(tmpCreditData);
            }
            creditShow.setMessageList(creditDataList);
        }else{
            //不能查到记录则显示错误信息
            creditShow.setStatus("1");
            creditShow.setCompany(company);
            creditShow.setCreatetime(null);
            for(int i = 0; i < 3; i++){
                CreditData tmpCreditData = new CreditData();
                tmpCreditData.setCertificate(" ");
                tmpCreditData.setContent(" ");
                tmpCreditData.setDeadline(" ");
                tmpCreditData.setDepartment(" ");
                tmpCreditData.setEffectivedate(" ");
                creditDataList.add(tmpCreditData);
            }
            creditShow.setMessageList(creditDataList);
        }
        return creditShow;
    }
}
