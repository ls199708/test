package com.cjg.action.validators;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class NewvoteValidate extends ActionSupport {
	private String title;
	private Integer contextcount;

	public Integer getContextcount() {
		return contextcount;
	}

	public void setContextcount(Integer contextcount) {
		this.contextcount = contextcount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
