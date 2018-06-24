package com.caih.mapper;

import com.caih.po.Scenicflowhours;
import com.caih.po.ScenicflowhoursExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicflowhoursMapper {
    int countByExample(ScenicflowhoursExample example);

    int deleteByExample(ScenicflowhoursExample example);

    int deleteByPrimaryKey(String id);

    int insert(Scenicflowhours record);

    int insertSelective(Scenicflowhours record);

    List<Scenicflowhours> selectByExample(ScenicflowhoursExample example);

    Scenicflowhours selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Scenicflowhours record, @Param("example") ScenicflowhoursExample example);

    int updateByExample(@Param("record") Scenicflowhours record, @Param("example") ScenicflowhoursExample example);

    int updateByPrimaryKeySelective(Scenicflowhours record);

    int updateByPrimaryKey(Scenicflowhours record);
}