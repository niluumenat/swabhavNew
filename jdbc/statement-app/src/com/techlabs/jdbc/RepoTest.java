package com.techlabs.jdbc;

import java.util.List;

public class RepoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactRepository repo = new ContactRepository();

		List<Contact> contacts = repo.get();
		System.out.println(repo.get().size());
		for (Contact c : contacts) {
			System.out.println(
					c.getFirstname() + " \t" + c.getLastName() + "\t" + c.getPhoneNo() + "\t" + c.getEmailId());
		}
		
		repo.add(new Contact("Akash", "Sharma", 34563322, "ak@123"));
		
		System.out.println(repo.get().size());
	}

}
