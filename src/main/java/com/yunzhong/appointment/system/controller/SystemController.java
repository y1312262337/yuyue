package com.yunzhong.appointment.system.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @className 系统设置控制器
 * @author 石洪刚
 * @time 2017年8月17日23:52:36
 */
@Controller
@RequestMapping("/sys")
public class SystemController {
	
	/**
	 * 
	 * @methodName sys
	 * @description 跳转系统设置页面
	 * @author 石洪刚
	 * @time 2017年10月6日 下午3:21:50
	 * @return
	 */
	@RequestMapping("/sys")
	public String sys(){
		return "system/system";
	}
}
