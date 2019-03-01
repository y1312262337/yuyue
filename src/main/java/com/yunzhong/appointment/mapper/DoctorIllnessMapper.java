package com.yunzhong.appointment.mapper;


import com.yunzhong.appointment.entity.DoctorIllness;

public interface DoctorIllnessMapper {
    int deleteByPrimaryKey(String docillId);

    int insert(DoctorIllness record);

    int insertSelective(DoctorIllness record);

    DoctorIllness selectByPrimaryKey(String docillId);

    int updateByPrimaryKeySelective(DoctorIllness record);

    int updateByPrimaryKey(DoctorIllness record);
    
}