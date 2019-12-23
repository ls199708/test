package com.cjg.action.rootaction;



import com.cjg.service.AdminService;
import com.cjg.service.VoteService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AdminRoot extends ActionSupport {
	/**
	 * @param name 管理员用户名
	 * @param password 管理员密码 
	 * @param newpwd1 新密码1
	 * @param newpwd2 新密码2
	 * @param safecode 图形码
	 */
	protected AdminService adminService;
	protected VoteService voteService;
	protected String name;
	protected String password;
	protected String newpwd1;
	protected String newpwd2;
	protected String safecode;

	public String getSafecode() {
		return safecode;
	}

	public void setSafecode(String safecode) {
		this.safecode = safecode;
	}

	public String getNewpwd1() {
		return newpwd1;
	}

	public void setNewpwd1(String newpwd1) {
		this.newpwd1 = newpwd1;
	}

	public String getNewpwd2() {
		return newpwd2;
	}

	public void setNewpwd2(String newpwd2) {
		this.newpwd2 = newpwd2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	public VoteService getVoteService() {
		return voteService;
	}

	public void setVoteService(VoteService voteService) {
		this.voteService = voteService;
	}

}
