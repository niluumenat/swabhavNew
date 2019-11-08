package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class WishAction implements Action {
	private String userName;
	private String message ;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String doExecute() {
		System.out.println(this.userName);
		if(this.userName != "") {
			this.message = "Struts wishes Hello to "+ this.userName;
			return SUCCESS;
		}
		return ERROR;
		
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

}
