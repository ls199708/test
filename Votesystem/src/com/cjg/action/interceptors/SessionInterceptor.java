package com.cjg.action.interceptors;

import java.util.Map;



import com.cjg.domain.Admin;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class SessionInterceptor extends AbstractInterceptor {
	private static final Object LOGIN_KEY = "admin";
	public static final String LOGIN_PAGE = "loginPage";

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map session = actionInvocation.getInvocationContext().getSession();
		Admin admin = (Admin) session.get(LOGIN_KEY);
		if (admin != null) {
			return actionInvocation.invoke();
		} else {
			return LOGIN_PAGE;
		}
	}
}
