package com.yunzhong.appointment.mapper;




import com.yunzhong.appointment.entity.Departmenttype;

public interface DepartmenttypeMapper {
    int deleteByPrimaryKey(String dplId);

    int insert(Departmenttype record);

    int insertSelective(Departmenttype record);

    Departmenttype selectByPrimaryKey(String dplId);

    int updateByPrimaryKeySelective(Departmenttype record);

    int updateByPrimaryKey(Departmenttype record);
    
}