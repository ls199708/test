package com.cjg.action.admin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.cjg.action.rootaction.AdminRoot;
import com.cjg.domain.Admin;

@SuppressWarnings("serial")
public class Createadmin extends AdminRoot {
	private static final String CREATEADMINERROR = "createAdminError";

	@Override
	public String execute() throws Exception {
		// 通过用户名查找管理员信息
		Admin a = adminService.findAdminByName(name);
		// 如果不为空，说明已经存在
		if (a != null) {
			addActionError(getText("adminexist"));
			return CREATEADMINERROR;
		} else {
			Date date = Calendar.getInstance().getTime();
			SimpleDateFormat formatter = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			String dateString = formatter.format(date);
			Admin admin = new Admin();
			admin.setName(name);
			admin.setPassword(newpwd1);
			admin.setLogintime(dateString);
			adminService.addAdmin(admin);
			return SUCCESS;
		}
	}
}
