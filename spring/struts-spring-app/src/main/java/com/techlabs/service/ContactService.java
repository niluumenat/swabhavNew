package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactService {
	List<Contact> contacts= new ArrayList<Contact>();
	private static ContactService instance;
	Contact c1 = new Contact( "Nilam", "nilam14@gmail.com", "98394394");
	Contact c2 = new Contact( "Heta", "heta123@gmail.com", "9435667454");
	Contact c3 = new Contact( "Komal", "koms@gmail.com", "765443334");
	Contact c4 = new Contact( "Madhavi", "madhvi@gmail.com", "98776554");
	
	public static ContactService getInstance() {
		if (instance == null) {
			instance = new ContactService();
		}
		return instance;
	}
	
	private ContactService() {
		contacts.add(c1);
		contacts.add(c2);
		contacts.add(c3);
		contacts.add(c4);
		System.out.println("Service created");
	}
	
	public List<Contact> getContacts() {
		System.out.println("hi from getcontacts");
		return contacts;
	}
	
	public void addContact(Contact contact) {
		contacts.add(contact);
	}

}
