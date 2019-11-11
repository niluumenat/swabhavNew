package com.techlabs.model;

import java.util.UUID;

public class Contact {
	private UUID id;
	private String name;
	private String emailId;
	private String phoneNo;
	public Contact(String name, String emailId, String phoneNo) {
		this.id = UUID.randomUUID(); 
		this.name = name;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}
	
	public Contact() {
		super();
	}
	
	public UUID getId() {
		return id;
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
