package com.caih;

import com.caih.bo.TravelBaseUnit;
import com.caih.mapper.ApprovalMapper;
import com.caih.mapper.CreditMapper;
import com.caih.mapper.TravelMapper;
import com.caih.po.ApprovalRecord;
import com.caih.po.CreditRecord;
import com.caih.po.TravelRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDao {

    @Autowired
    CreditMapper creditMapper;
    @Autowired
    TravelMapper travelMapper;

    @Test
    public void testApprovalMap(){
        CreditRecord record = creditMapper.findRecordByCompany("梧州市粤广石料厂");
        System.out.println(record);
    }

    @Test
    public void testTravelMapper(){
        List<TravelRecord> list = travelMapper.findTouristFolwHoursCapacity(0);
        System.out.println(list);
    }
}
