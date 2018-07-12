package com.caih;

import com.caih.bo.TravelTouristUnit;
import com.caih.mapper.TrafficMapper;
import com.caih.mapper.TravelMapper;
import com.caih.po.TrafficIndexRecord;
import com.caih.po.TravelRecord;
import com.caih.service.TravelService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUnit {

    private ApplicationContext applicationContext = null;

    {
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
    @Test
    public void testMapper(){
        TrafficIndexRecord record = null;
        try{
            TrafficMapper recordmapper = (TrafficMapper) applicationContext.getBean("trafficMapper");
            record = recordmapper.findIndexNewOne();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(record);
    }

    @Test
    public void testTravelMapper(){
        List<TravelRecord> record = null;
        try{
            TravelMapper recordmapper = (TravelMapper) applicationContext.getBean("travelMapper");
            record = recordmapper.findTouristFolwHoursbak(24);
        }catch(Exception e){
            e.printStackTrace();
        }
        if(record.isEmpty()){
            System.out.println("empty");
        }
        System.out.println(record);
    }

    @Test
    public void testTravelSevice(){
        List<TravelTouristUnit> record = null;
        TravelService travelSevice = new TravelService();
        record = travelSevice.getTouristFolwHoursbak();
        System.out.println(record);
    }

}
