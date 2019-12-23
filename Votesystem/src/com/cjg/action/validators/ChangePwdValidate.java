package com.cjg.action.validators;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ChangePwdValidate extends ActionSupport {
	private String password;
	private String newpwd1;
	private String newpwd2;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
