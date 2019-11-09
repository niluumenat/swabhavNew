package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class SessionAction implements SessionAware, Action {
	private Map<String, Object> session;
	

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	private int counter;
	private int old;
	private int newCounter;


	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String execute() {
		if (session.get("counter") == null) {
			int number = 0;
			session.put("counter", number);
		} else {
			old = (int) session.get("counter");
			System.out.println("Old value: " + old);
			session.put("counter", old + 1);
			newCounter = (int) session.get("counter");
			System.out.print("New " + session.get("counter"));
		}
		System.out.println(session.getClass()); 
		return SUCCESS;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public int getNewCounter() {
		return newCounter;
	}

	public void setNewCounter(int newCounter) {
		this.newCounter = newCounter;
	}

}
