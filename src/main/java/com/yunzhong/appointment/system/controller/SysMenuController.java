package com.yunzhong.appointment.system.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yunzhong.appointment.config.SessionConst;
import com.yunzhong.appointment.entity.SysMenu;
import com.yunzhong.appointment.system.service.SysMenuService;

/**
 * 
 * @className SysMenuController
 * @description 对菜单进行管理与维护
 * @author 石洪刚
 * @time 2017年10月2日 下午7:32:15
 */
@Controller
@RequestMapping("sys")
public class SysMenuController {
	
	@Autowired
	private SysMenuService menuService;
	/**
	 * 
	 * @methodName showMenu
	 * @description 用于点击一级菜单进行跳转
	 * @author 石洪刚
	 * @time 2017年10月2日 下午7:32:41
	 * @param id
	 * @return
	 */
	@RequestMapping("showMenu")
	public String showMenu(String id){
		List<SysMenu> menuList = (List<SysMenu>) SecurityUtils.getSubject().getSession().getAttribute(SessionConst.SESSION_MENULIST);
		SysMenu sm = null;
		if(menuList!=null){
			for (SysMenu sysMenu : menuList) {
				if(id.equals(sysMenu.getMenuId())){
					sm = sysMenu;
					break;
				}
			}
		}
		//如果没查到，则设置要显示的菜单为个人中心
		if(sm==null){
			sm = (SysMenu) SecurityUtils.getSubject().getSession().getAttribute(SessionConst.SESSION_PERSONAL_MENU);
		}
		SecurityUtils.getSubject().getSession().setAttribute(SessionConst.SESSION_MENU, sm);
		return "redirect:"+sm.getMenuUrl();
	}
}
