package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Contact;

@Repository
public class ContactRepository {
	List<Contact> contacts= new ArrayList<Contact>();
	
	Contact c1 = new Contact( "Nilam", "nilam14@gmail.com", "98394394");
	Contact c2 = new Contact( "Heta", "heta123@gmail.com", "9435667454");
	Contact c3 = new Contact( "Komal", "koms@gmail.com", "765443334");
	Contact c4 = new Contact( "Madhavi", "madhvi@gmail.com", "98776554");
	
	public ContactRepository() {
		contacts.add(c1);
		contacts.add(c2);
		contacts.add(c3);
		contacts.add(c4);
		System.out.println("Repo created ...");
		
	}
	public List<Contact> getContacts() {
		System.out.println("hi from getcontacts");
		return contacts;
	}
	
	public void addContact(Contact contact) {
		contacts.add(contact);
	}

	
	
}
