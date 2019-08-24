package com.techlabs.contact;

public class Contact {
	private String firstName;
	private String lastNmae;
	private String emailId;
	private String contactNumber;
	public Contact(String firstName, String lastNmae, String emailId, String contactNumber) {
		this.firstName = firstName;
		this.lastNmae = lastNmae;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public String setFirstName(String firstName) {
		return this.firstName = firstName;
	}
	public String getLastNmae() {
		return lastNmae;
	}
	public String setLastNmae(String lastNmae) {
		return this.lastNmae = lastNmae;
	}
	public String getEmailId() {
		return emailId;
	}
	public String setEmailId(String emailId) {
		return this.emailId = emailId;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String setContactNumber(String contactNumber) {
		return this.contactNumber = contactNumber;
	}
	
	
	
	
	
	
	

}
