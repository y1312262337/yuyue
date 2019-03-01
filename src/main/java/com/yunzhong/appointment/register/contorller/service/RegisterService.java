package com.yunzhong.appointment.register.contorller.service;

import java.util.List;

import com.yunzhong.appointment.entity.City;
import com.yunzhong.appointment.entity.Patient;
import com.yunzhong.appointment.entity.Province;

public interface RegisterService {
    /**
     * 查询省下拉框
     * @return
     */
	List<Province> queryProvince();
    /**
     * 患者注册添加
     * @param pt
     * @return
     */
	int registerAddSave(Patient pt);
   
}
