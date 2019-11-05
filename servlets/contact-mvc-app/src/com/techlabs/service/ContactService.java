package com.techlabs.service;

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
		System.out.println(repo.get());
		return repo.get();
	}
	
	public void addContact(Contact contact) {
		repo.add(contact);
	}
	
	public void deleteContact(String id){
		repo.delete(id);
	}
	
	public List<Contact> getByName(String id){
		System.out.println(repo.getByName(id));
		return repo.getByName(id);
	}
	
	public void editContact(String id, Contact contact){
		repo.edit(id, contact);
	}


}
