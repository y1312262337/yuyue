package com.yunzhong.appointment.system.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunzhong.appointment.entity.SysMenu;
import com.yunzhong.appointment.mapper.SysMenuMapper;
import com.yunzhong.appointment.system.service.SysMenuService;

/**
 * 
 * @className SysMenuServiceImpl
 * @description 菜单模型层实现类
 * @author 石洪刚
 * @time 2017年10月2日 下午7:38:02
 */
@Service
public class SysMenuServiceImpl implements SysMenuService{

	@Autowired
	private SysMenuMapper menuMapper;
	@Override
	public List<SysMenu> listAllMenu() {
		//得到所有一级菜单
		List<SysMenu> topList = menuMapper.listTopMenu();
		List<SysMenu> rvList = new ArrayList<SysMenu>();
		for (SysMenu sysMenu : topList) {
			SysMenu rv = this.recursiveMenuByTopMenu(sysMenu);
			rvList.add(rv);
		}
		return rvList;
	}
	/**
	 * 
	 * @methodName recursiveMenuByTopMenu
	 * @description 递归得到一个菜单下的所有子菜单
	 * @author 石洪刚
	 * @time 2017年10月2日 下午7:47:28
	 * @param menu
	 * @return
	 */
	private SysMenu recursiveMenuByTopMenu(SysMenu menu) {
		List<SysMenu> childMenus = menuMapper.listMenuByPar(menu);
		for (SysMenu sysMenu : childMenus) {
			SysMenu m = recursiveMenuByTopMenu(sysMenu);
			menu.getChildrenMenuList().add(m);
		}
		return menu;
	}
	
	@Override
	public void removeMenu(String id) {
		SysMenu m = menuMapper.selectByPrimaryKey(id);
		SysMenu menu = this.recursiveMenuByTopMenu(m);
		//把所有菜单按顺序放在list中
		List<SysMenu> rmList = new ArrayList<SysMenu>();
		List<SysMenu> list = menu.getChildrenMenuList();
		while(list.size()>0){
			rmList.addAll(list);
			List<SysMenu> temList = new ArrayList<SysMenu>();
			for (int j = 0; j < list.size(); j++) {
				SysMenu temAdds = list.get(j);
				temList.addAll(temAdds.getChildrenMenuList());
			}
			list = temList;
		}
		//删除所有子集菜单
		for (int j = rmList.size()-1; j >= 0; j--) {
			menuMapper.deleteByPrimaryKey(rmList.get(j).getMenuId());
		}
		//删除菜单
		menuMapper.deleteByPrimaryKey(id);
	}
	@Override
	public SysMenu getMenuWithParNameById(String id) {
		return menuMapper.getMenuWithParNameById(id);
	}
	@Override
	public void saveOrUpdateMenu(SysMenu menu) {
		if("".equals(menu.getMenuId())){
			menu.setMenuId(UUID.randomUUID().toString());
			menu.setMenuState("A");
			menuMapper.insertSelective(menu);
		}else{
			menuMapper.updateByPrimaryKeySelective(menu);
		}
	}

}
