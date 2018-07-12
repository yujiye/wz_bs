package com.caih;

import com.caih.service.ApprovalService;
import com.caih.vo.ApprovalShow;
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
    @Test
    public void testApprovalService(){
        ApprovalShow show = approvalService.getShow();
        System.out.println( show );
    }
}
