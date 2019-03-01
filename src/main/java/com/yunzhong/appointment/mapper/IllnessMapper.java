package com.yunzhong.appointment.mapper;



import com.yunzhong.appointment.entity.Illness;

public interface IllnessMapper {
    int deleteByPrimaryKey(String illId);

    int insert(Illness record);

    int insertSelective(Illness record);

    Illness selectByPrimaryKey(String illId);

    int updateByPrimaryKeySelective(Illness record);

    int updateByPrimaryKey(Illness record);
    
}