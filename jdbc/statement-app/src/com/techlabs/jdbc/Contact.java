package com.techlabs.jdbc;

public class Contact {
	
	private String firstname;
	private String lastName;
	private int phoneNo;
	private String emailId;
	public Contact(String firstname, String lastName, int phoneNo, String emailId) {
		this.firstname = firstname;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
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
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	

}
