package com.caih.mapper;

import com.caih.po.Staytime;
import com.caih.po.StaytimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaytimeMapper {
    int countByExample(StaytimeExample example);

    int deleteByExample(StaytimeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Staytime record);

    int insertSelective(Staytime record);

    List<Staytime> selectByExample(StaytimeExample example);

    Staytime selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Staytime record, @Param("example") StaytimeExample example);

    int updateByExample(@Param("record") Staytime record, @Param("example") StaytimeExample example);

    int updateByPrimaryKeySelective(Staytime record);

    int updateByPrimaryKey(Staytime record);
}