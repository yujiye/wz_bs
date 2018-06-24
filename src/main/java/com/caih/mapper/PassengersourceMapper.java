package com.caih.mapper;

import com.caih.po.Passengersource;
import com.caih.po.PassengersourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PassengersourceMapper {
    int countByExample(PassengersourceExample example);

    int deleteByExample(PassengersourceExample example);

    int deleteByPrimaryKey(String id);

    int insert(Passengersource record);

    int insertSelective(Passengersource record);

    List<Passengersource> selectByExample(PassengersourceExample example);

    Passengersource selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Passengersource record, @Param("example") PassengersourceExample example);

    int updateByExample(@Param("record") Passengersource record, @Param("example") PassengersourceExample example);

    int updateByPrimaryKeySelective(Passengersource record);

    int updateByPrimaryKey(Passengersource record);
}