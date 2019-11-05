package com.techlabs.model;

public class BankingMaster {
	private String name;
	private String password;
	private String balance;
	public BankingMaster(String name, String password, String balance) {
		super();
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getBalance() {
		return balance;
	}

}
