package com.techlabs.viewmodel;

import java.util.UUID;

public class ContactDisplayViewModel {
	private UUID id;
	private String name;
	private String emailId;
	private String phoneNo;
	
	
	
	public ContactDisplayViewModel(){
		System.out.println("Inside constructor of contactDisplayViewModel...");
	}
	
	public ContactDisplayViewModel(UUID id, String name, String emailId, String phoneNo) {
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}


	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	
}
