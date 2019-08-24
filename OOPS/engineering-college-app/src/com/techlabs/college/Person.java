package com.techlabs.college;

public abstract class Person {
	public String id;
	public String address;
	public String dob;

	public Person(String id, String address, String dob) {
		super();
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}
}
