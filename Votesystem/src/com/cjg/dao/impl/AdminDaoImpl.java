package com.cjg.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.cjg.dao.AdminDao;
import com.cjg.domain.Admin;



public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	@SuppressWarnings("unchecked")
	public List<Admin> findAll() {
		return (List<Admin>) getHibernateTemplate().find("from Admin");
	}

	public void addAdmin(Admin admin) {
		getHibernateTemplate().save(admin);
	}

	@SuppressWarnings("unchecked")
	public Admin findAdmin(String name, String password) {
		String[] param = new String[] { name, password };
		String sql = "from Admin as admin where admin.name=? and admin.password=?";
		List<Admin> list = getHibernateTemplate().find(sql, param);
		if (list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}

	public void changepwd(Admin admin) {
		getHibernateTemplate().update("password", admin);
	}

	public void updatelogintime(Admin admin) {
		getHibernateTemplate().update("logintime", admin);
	}

	@SuppressWarnings("unchecked")
	public Admin findNameById(Integer adminId) {
		String sql = "from Admin as admin where admin.adminId=?";
		List<Admin> list = getHibernateTemplate().find(sql, adminId);
		return list.get(0);
	}

	@SuppressWarnings("unchecked")
	public Admin findAdminByName(String name) {
		String sql = "from Admin as admin where admin.name=?";
		List<Admin> list = getHibernateTemplate().find(sql, name);
		if (list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}
}
