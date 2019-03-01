package com.yunzhong.appointment.mapper;

import com.yunzhong.appointment.entity.Scheduling;

public interface SchedulingMapper {
    int deleteByPrimaryKey(String schedulingId);

    int insert(Scheduling record);

    int insertSelective(Scheduling record);

    Scheduling selectByPrimaryKey(String schedulingId);

    int updateByPrimaryKeySelective(Scheduling record);

    int updateByPrimaryKey(Scheduling record);
    
   
}