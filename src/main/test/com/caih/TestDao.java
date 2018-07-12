package com.caih;

import com.caih.mapper.ApprovalMapper;
import com.caih.po.ApprovalRecord;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestDao {

    private ApplicationContext applicationContext = null;
    private List<ApprovalRecord> records = null;

    @Test
    public void testApprovalMap(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ApprovalMapper recordmapper = (ApprovalMapper) applicationContext.getBean("approvalMapper");
        records = recordmapper.findNew();
        System.out.println(records);
    }

    @Test
    public void testApprovalMapByKeyword(){
        ApprovalRecord record = null;
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ApprovalMapper recordmapper = (ApprovalMapper) applicationContext.getBean("approvalMapper");
        record = recordmapper.findNewByKeyword("onwork");
        System.out.println(record);
    }
}
