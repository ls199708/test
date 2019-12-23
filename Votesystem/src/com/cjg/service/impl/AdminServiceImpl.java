package com.cjg.service.impl;

import java.util.List;

import com.cjg.dao.AdminDao;
import com.cjg.domain.Admin;
import com.cjg.service.AdminService;



public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao;

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public List<Admin> findAll() {
		List<Admin> list = adminDao.findAll();
		return list;
	}

	public void addAdmin(Admin admin) {
		adminDao.addAdmin(admin);
	}

	public Admin findAdmin(String name, String password) {
		return adminDao.findAdmin(name, password);
	}

	public void changepwd(Admin admin) {
		adminDao.changepwd(admin);
	}

	public void updatelogintime(Admin admin) {
		adminDao.updatelogintime(admin);
	}

	public Admin findNameById(Integer adminId) {
		return adminDao.findNameById(adminId);
	}

	public Admin findAdminByName(String name) {
		return adminDao.findAdminByName(name);
	}

}
