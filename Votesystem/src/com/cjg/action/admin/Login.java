package com.cjg.action.admin;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.cjg.action.rootaction.AdminRoot;
import com.cjg.domain.Admin;
import com.cjg.domain.Count;

@SuppressWarnings("serial")
public class Login extends AdminRoot {

	@Override
	public String execute() throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession();
		if (session.getAttribute("rand") == null) {
			return ERROR;
		}
		// 获得图形校验码
		String sf = (String) session.getAttribute("rand");
		// 如果图形校验码正确，判断帐号、密码是否正确
		if (sf.equals(safecode)) {
			Admin admin = adminService.findAdmin(name, password);
			if (admin == null) {
				addActionError(getText("loginerror"));
				return ERROR;
			} else {
				// 将admin信息存入session
				session.setAttribute("admin", admin);
				Count count2 = new Count();
				// 设置单选投票个数
				count2.setSingleCount(voteService
						.findVoteCountByType(new Integer(1)));
				// 设置多选投票个数
				count2.setMultiCount(voteService
						.findVoteCountByType(new Integer(0)));
				// 设置所有投票个数
				count2.setAllCount(voteService.findVoteCount());
				session.setAttribute("count2", count2);
				// 获得当前系统时间并格式化，存入管理员登录时间
				Date date = Calendar.getInstance().getTime();
				SimpleDateFormat formatter = new SimpleDateFormat(
						"yyyy-MM-dd HH:mm:ss");
				String dateString = formatter.format(date);
				admin.setLogintime(dateString);
				// 更新管理员登录时间信息
				adminService.updatelogintime(admin);
				return SUCCESS;
			}
		} else {
			addActionError(getText("codeerror"));
			return ERROR;
		}
	}
}
