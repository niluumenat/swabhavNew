package com.techlabs.actions;

import java.util.ArrayList;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;
import com.techlabs.viewmodel.ContactDisplayViewModel;

public class ContactDisplayAction extends ActionSupport implements ModelDriven<ContactDisplayViewModel> {
	ContactService service = ContactService.getInstance();
	ContactDisplayViewModel model;
	List<Contact> contacts;

	@Override
	public String execute() throws Exception {
		System.out.println("Inside success....");
		contacts= service.getContacts();
		return "success";
	}

	@Override
	public ContactDisplayViewModel getModel() {
		System.out.println("Inside getModel....");
		model = new ContactDisplayViewModel();
		return model;	
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}
