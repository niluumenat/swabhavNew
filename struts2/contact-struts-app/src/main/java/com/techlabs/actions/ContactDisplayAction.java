package com.techlabs.actions;

import java.util.List;
import java.util.UUID;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Contact;
import com.techlabs.service.ContactService;

public class ContactDisplayAction implements Action {
	ContactService service = ContactService.getInstance();
	private UUID id;
	private String name;

	@Override
	public String execute() throws Exception {
		List<Contact> contacts=service.getContacts();
		for(Contact c:contacts) {
			System.out.println(c.getName() + c.getId());
		}
		
		return "success";
	}
	
	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
