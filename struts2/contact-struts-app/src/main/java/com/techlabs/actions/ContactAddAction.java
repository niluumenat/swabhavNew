package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;
import com.techlabs.viemodels.ContactDisplayViewModel;

public class ContactAddAction extends ActionSupport implements ModelDriven<ContactDisplayViewModel> {
	ContactDisplayViewModel model = new ContactDisplayViewModel();
	ContactService service = ContactService.getInstance();

	@Override
	public String execute() throws Exception {
		Contact c= new Contact(model.getName(), model.getEmailId(), model.getPhoneNo());
		service.addContact(c);
		return "success";
	}
	
	public void validate() {
		System.out.println("Hello from validate method");
		if (model.getName() == null || model.getName().trim().equals("")) {
			addFieldError("name", "User name is required.");
		}
		if(model.getEmailId() == null || model.getEmailId().trim().equals("")) {
			addFieldError("email", "User emailId is required");
		}
		if(model.getPhoneNo() == null || model.getPhoneNo().trim().equals("")) {
			addFieldError("phoneNo", "Phone No is required");
		}	
	}

	@Override
	public ContactDisplayViewModel getModel() {
		return model;
	}
	
	
}
