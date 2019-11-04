package com.techlabs.jdbc;

public class Contact {
	
	private String firstname;
	private String lastName;
	private String phoneNo;
	private String emailId;
	public Contact(String firstname, String lastName, String string, String emailId) {
		this.firstname = firstname;
		this.lastName = lastName;
		this.phoneNo = string;
		this.emailId = emailId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	

}
