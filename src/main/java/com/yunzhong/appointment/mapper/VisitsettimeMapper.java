package com.yunzhong.appointment.mapper;



import com.yunzhong.appointment.entity.Visitsettime;

public interface VisitsettimeMapper {
    int deleteByPrimaryKey(String visitstId);

    int insert(Visitsettime record);

    int insertSelective(Visitsettime record);

    Visitsettime selectByPrimaryKey(String visitstId);

    int updateByPrimaryKeySelective(Visitsettime record);

    int updateByPrimaryKey(Visitsettime record);
    
}