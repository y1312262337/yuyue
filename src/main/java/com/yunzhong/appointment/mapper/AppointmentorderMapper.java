package com.yunzhong.appointment.mapper;

import com.yunzhong.appointment.entity.Appointmentorder;

public interface AppointmentorderMapper {
    int deleteByPrimaryKey(String appointmentId);

    int insert(Appointmentorder record);
    
    int insertSelective(Appointmentorder record);

    Appointmentorder selectByPrimaryKey(String appointmentId);

    int updateByPrimaryKeySelective(Appointmentorder record);

    int updateByPrimaryKey(Appointmentorder record);
	
	
	
}