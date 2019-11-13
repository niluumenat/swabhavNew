package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Contact;
import com.techlabs.repository.ContactRepository;
@Service
public class ContactService {
	
	private static ContactService instance;
	@Autowired
	ContactRepository repo;
	
	public List<Contact> getContacts() {
		System.out.println("hi from getcontacts of service...");
		return repo.getContacts();
	}
	
	public void addContact(Contact contact) {
		repo.addContact(contact);
	}

}
