package com.cjg.domain;

@SuppressWarnings("serial")
public class Admin implements java.io.Serializable {

	private Integer adminId;
	private String name;
	private String password;
	private String logintime;

	public Admin() {
	}

	public Admin(String name, String password, String logintime) {
		this.name = name;
		this.password = password;
		this.logintime = logintime;
	}
	
	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogintime() {
		return this.logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}

}