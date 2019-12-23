package com.cjg.action.validators;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SearchVoteValidate extends ActionSupport {
	
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
