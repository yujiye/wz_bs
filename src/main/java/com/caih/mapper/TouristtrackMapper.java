package com.caih.mapper;

import com.caih.po.Touristtrack;
import com.caih.po.TouristtrackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TouristtrackMapper {
    int countByExample(TouristtrackExample example);

    int deleteByExample(TouristtrackExample example);

    int deleteByPrimaryKey(String id);

    int insert(Touristtrack record);

    int insertSelective(Touristtrack record);

    List<Touristtrack> selectByExample(TouristtrackExample example);

    Touristtrack selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Touristtrack record, @Param("example") TouristtrackExample example);

    int updateByExample(@Param("record") Touristtrack record, @Param("example") TouristtrackExample example);

    int updateByPrimaryKeySelective(Touristtrack record);

    int updateByPrimaryKey(Touristtrack record);
}