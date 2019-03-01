package com.yunzhong.appointment.register.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yunzhong.appointment.entity.City;
import com.yunzhong.appointment.entity.Patient;
import com.yunzhong.appointment.entity.Province;
import com.yunzhong.appointment.register.contorller.service.RegisterService;
import com.yunzhong.appointment.register.contorller.service.impl.RegisterServiceImpl;
import com.yunzhong.appointment.util.ResultJson;
/**
 * 注册控制器
 * @author 于占峰
 * 2019年2月27日16:54:16
 */
@Controller
@RequestMapping("register")
public class RegisterController {
	/**
	 * 模型层接口
	 */
     @Autowired
     private RegisterService service;
     
     /**
      * 注册跳转页面
      */
     @RequestMapping("add")
     public String add(ModelMap mp) {
    	 //查询省下拉框
    	 List<Province> proList = service.queryProvince();  //省
    	 System.err.println(proList);
    	 mp.put("proList", proList);
    	 return"register/register";
     }
     /**
      * 注册添加
      */
     @RequestMapping("addSave")
     @ResponseBody
     public ResultJson addSave(Patient pt) {
    	 ResultJson r = new ResultJson();
    	 int tiao = service.registerAddSave(pt);
    	 if (tiao>0) {
			r.setSuccess(true);
		} else {
            r.setSuccess(false);
		}
    	 return r;
     }
}
