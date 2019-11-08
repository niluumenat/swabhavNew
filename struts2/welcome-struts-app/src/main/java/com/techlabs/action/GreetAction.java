package com.techlabs.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.Action;

public class GreetAction implements Action {
	private String message;

	public String getMessage() {
		return message;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("hello from execute method....\n");
		this.message = calculateGreetMsg() + "from execute";
		return this.SUCCESS;
	}
	
	public String doExecute() {
		this.message = calculateGreetMsg() + "from doExecute";
		System.out.println("Hello from doExecute method....\n");
		return this.SUCCESS;
	}

	private String calculateGreetMsg() {
		SimpleDateFormat dtf = new SimpleDateFormat("HH");
		Date now = new Date();
		String formattedDate= dtf.format(now);
		int currentTime= Integer.parseInt(formattedDate);
		System.out.println(currentTime);
		if(currentTime < 12 ) {
			message = "Good Morning!!!";
		}else  if(currentTime >12 && currentTime < 17) {
			message = "Good Afternoon!!!";
		}else if(currentTime >=17 && currentTime <= 19 ) {
			message = "Good evening!!!";
		}else if(currentTime == 12) {
			message = "Good Noon!!!";
		}else if(currentTime > 19) {
			message = "Good Night!!! ";
		}
		return "Hello welcome to struts ... "+message;

	}

}
