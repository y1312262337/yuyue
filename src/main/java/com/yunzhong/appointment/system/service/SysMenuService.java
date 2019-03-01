package com.yunzhong.appointment.system.service;

import java.util.List;

import com.yunzhong.appointment.entity.SysMenu;

/**
 * 
 * @className SysMenuService
 * @description 菜单模型层接口
 * @author 石洪刚
 * @time 2017年10月2日 下午7:37:23
 */
public interface SysMenuService {

	/**
	 * 
	 * @methodName listAllMenu
	 * @description 得到所有菜单信息
	 * @author 石洪刚
	 * @time 2017年10月2日 下午7:41:18
	 * @return
	 */
	List<SysMenu> listAllMenu();
	/**
	 * 
	 * @methodName removeMenu
	 * @description 根据主键删除菜单
	 * @author 石洪刚
	 * @time 2017年10月2日 下午8:19:51
	 * @param id
	 */
	void removeMenu(String id);
	/**
	 * 
	 * @methodName getMenuById
	 * @description 根据菜单主键得到菜单，包括父菜单名称
	 * @author 石洪刚
	 * @time 2017年10月2日 下午10:35:15
	 * @param id
	 * @return
	 */
	SysMenu getMenuWithParNameById(String id);
	/**
	 * 
	 * @methodName saveOrUpdateMenu
	 * @description 增加或修改菜单
	 * @author 石洪刚
	 * @time 2017年10月2日 下午10:55:37
	 * @param menu
	 */
	void saveOrUpdateMenu(SysMenu menu);

}
