package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action {
	private String developer;
	
	public HomeAction() {
		System.out.println("Inside constructor");
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Execute invoked");
		return this.SUCCESS;
	}

	public void setDeveloper(String developer) {
		System.out.println("Setter invoked");
		this.developer = developer;
	}


	public String getDeveloper() {
		System.out.println("Getter invoked");
		return developer;
	}

	
	

}
