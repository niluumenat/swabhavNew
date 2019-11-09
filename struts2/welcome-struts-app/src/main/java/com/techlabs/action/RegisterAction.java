package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.viewmodels.RegisterViewModel;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterViewModel> {

	RegisterViewModel model = new RegisterViewModel();

	@Override
	public RegisterViewModel getModel() {
		System.out.println("Hello from getModel...");
		return model;
	}

	@Override
	public String execute() {
		System.out.println("Hello from execute...");
		return "success";
	}

	@Override
	public void validate() {
		System.out.println("Hello from validate method");
		if (model.getName() == null || model.getName().trim().equals("")) {
			addFieldError("name", "User name is required.");
		}
		if(model.getEmail() == null || model.getEmail().trim().equals("")) {
			addFieldError("email", "User Password is required");
		}
		if(model.getPhoneNo() == null || model.getPhoneNo().trim().equals("")) {
			addFieldError("phoneNo", "User Password is required");
		}
		
		

	}

}
