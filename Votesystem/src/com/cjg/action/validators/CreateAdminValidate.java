package com.cjg.action.validators;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class CreateAdminValidate extends ActionSupport {
	private String name;
	private String newpwd1;
	private String newpwd2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
