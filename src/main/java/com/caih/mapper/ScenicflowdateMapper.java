package com.caih.mapper;

import com.caih.po.Scenicflowdate;
import com.caih.po.ScenicflowdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicflowdateMapper {
    int countByExample(ScenicflowdateExample example);

    int deleteByExample(ScenicflowdateExample example);

    int deleteByPrimaryKey(String id);

    int insert(Scenicflowdate record);

    int insertSelective(Scenicflowdate record);

    List<Scenicflowdate> selectByExample(ScenicflowdateExample example);

    Scenicflowdate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Scenicflowdate record, @Param("example") ScenicflowdateExample example);

    int updateByExample(@Param("record") Scenicflowdate record, @Param("example") ScenicflowdateExample example);

    int updateByPrimaryKeySelective(Scenicflowdate record);

    int updateByPrimaryKey(Scenicflowdate record);
}