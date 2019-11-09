package com.techlabs.action;

import java.util.Map;

import org.apache.commons.lang3.Validate;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private SessionMap<String, Object> session;
	private String userName, userPassword;

	@Override
	public String execute() throws Exception {
		System.out.println(session.get("name"));
		if (userName.equals(userPassword)) {
			System.out.println("Hello from execute IF condition");
			session.put("login", "true");
			session.put("name", userName);
			return "success";
		} else {
			System.out.println("Hello from else condition");
			return "login";
		}
	}

	public void validate() {
		System.out.println("Hello from validate method");
		if (userName == null || userName.trim().equals("")) {
			addFieldError("userName", "User name is required.");
		}
		if(userPassword == null || userPassword.trim().equals("")) {
			addFieldError("userPassword", "User Password is required");
		}
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Map<String, Object> getSession() {
		return session;
	}

}
