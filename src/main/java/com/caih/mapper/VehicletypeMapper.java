package com.caih.mapper;

import com.caih.po.Vehicletype;
import com.caih.po.VehicletypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VehicletypeMapper {
    int countByExample(VehicletypeExample example);

    int deleteByExample(VehicletypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Vehicletype record);

    int insertSelective(Vehicletype record);

    List<Vehicletype> selectByExample(VehicletypeExample example);

    Vehicletype selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Vehicletype record, @Param("example") VehicletypeExample example);

    int updateByExample(@Param("record") Vehicletype record, @Param("example") VehicletypeExample example);

    int updateByPrimaryKeySelective(Vehicletype record);

    int updateByPrimaryKey(Vehicletype record);
}