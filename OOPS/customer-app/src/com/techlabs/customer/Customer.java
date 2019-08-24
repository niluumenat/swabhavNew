package com.techlabs.customer;

public class Customer {
	private final String firstName;
	private final String lastName;
	private final int id;
	public static int count;

	static {
		count = 1001;
	}

	public Customer(String firstName, String lastName) {
		id = count;
		count = count + 1;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
