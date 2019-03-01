package com.yunzhong.appointment.mapper;



import com.yunzhong.appointment.entity.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(String dpId);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(String dpId);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
   
}