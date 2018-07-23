package com.caih;

import com.caih.service.ApprovalService;
import com.caih.service.CreditService;
import com.caih.service.TravelService;
import com.caih.vo.ApprovalShow;
import com.caih.vo.CreditShow;
import com.caih.vo.TravelShow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestService {
    @Autowired
    ApprovalService approvalService;
    @Autowired
    TravelService travelService;
    @Autowired
    CreditService creditService;
    @Test
    public void testApprovalService(){
        ApprovalShow show = approvalService.getShow();
        System.out.println( show );
    }
    @Test
    public void testTravelService(){
        TravelShow show = travelService.getShow();
        System.out.println( show );
    }
    @Test
    public void testCreditService(){
        CreditShow show = creditService.getShowByCompany(null);
        System.out.println( show );
    }
}
