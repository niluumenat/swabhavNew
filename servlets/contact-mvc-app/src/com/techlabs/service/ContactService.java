package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;

public class ContactService {
	private static ContactService instance;
	ContactRepository repo = new ContactRepository();
	
	public static ContactService getInstance() {
		if (instance == null) {
			instance = new ContactService();
		}
		return instance;
	}
	
	private ContactService() {
		System.out.println("Service created");
		
	}
	
	public List<Contact> get() {
		return repo.get();
	}
	
	public void addStudents(Contact contact) {
		repo.add(contact);

	}



}
