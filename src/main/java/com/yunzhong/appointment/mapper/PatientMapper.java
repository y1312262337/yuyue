package com.yunzhong.appointment.mapper;


import org.apache.ibatis.annotations.Update;

import com.yunzhong.appointment.entity.Patient;
import com.yunzhong.appointment.entity.SysUser;

public interface PatientMapper {
    int deleteByPrimaryKey(String patientId);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(String patientId);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
    /**
     * 
     * @methodName updateUserInfo
     * @description 修改患者中的用户信息
     * @author 石洪刚
     * @time 2017年10月5日 下午7:22:37
     * @param user
     */
    @Update("UPDATE patient SET user_name = #{userName} where user_id=#{userId}")
	void updateUserInfo(SysUser user);
    /**
     * 
     * @methodName updateUserInfoNullByUserId
     * @description 设置用户信息为NULL
     * @author 石洪刚
     * @time 2017年10月5日 下午7:37:46
     * @param id
     */
    @Update("UPDATE patient SET user_name = NULL,user_id = NULL where user_id=#{id}")
	void updateUserInfoNullByUserId(String id);
    
}