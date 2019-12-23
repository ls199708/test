package com.cjg.action.admin;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.AdminRoot;
import com.cjg.domain.Admin;

@SuppressWarnings("serial")
public class ChangePwd extends AdminRoot {
	private static final String PWDERROR = "pwderror";

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		// 从session获得当前登录管理员信息
		Admin admin = (Admin) session.getAttribute("admin");
		// 判断旧密码是否正确
		if (admin.getPassword().equals(password)) {
			admin.setPassword(newpwd1);
			// 更新管理员密码信息
			adminService.changepwd(admin);
			return SUCCESS;
		} else
			addActionError(getText("oldpswerror"));
		return PWDERROR;
	}

}
