package com.caih.mapper;

import com.caih.po.Touristapp;
import com.caih.po.TouristappExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TouristappMapper {
    int countByExample(TouristappExample example);

    int deleteByExample(TouristappExample example);

    int deleteByPrimaryKey(String id);

    int insert(Touristapp record);

    int insertSelective(Touristapp record);

    List<Touristapp> selectByExample(TouristappExample example);

    Touristapp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Touristapp record, @Param("example") TouristappExample example);

    int updateByExample(@Param("record") Touristapp record, @Param("example") TouristappExample example);

    int updateByPrimaryKeySelective(Touristapp record);

    int updateByPrimaryKey(Touristapp record);
}