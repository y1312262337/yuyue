package com.yunzhong.appointment.mapper;



import com.yunzhong.appointment.entity.Illnessposition;

public interface IllnesspositionMapper {
    int deleteByPrimaryKey(String illtpId);

    int insert(Illnessposition record);

    int insertSelective(Illnessposition record);

    Illnessposition selectByPrimaryKey(String illtpId);

    int updateByPrimaryKeySelective(Illnessposition record);

    int updateByPrimaryKey(Illnessposition record);
    
}