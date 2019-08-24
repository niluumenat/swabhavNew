package com.techlabs.account;

import java.io.Serializable;

public class Account implements Serializable{
	private final int accNo;
	private final String name;
	private double accBalance;

	public Account(int accNo, String name, double accBalance) {
		this.accNo = accNo;
		this.name = name;
		this.accBalance = accBalance;
	}

	public Account(int accNo, String name) {
		this(accNo, name, 500);
	}

	public void deposit(double amount) {
		accBalance = accBalance + amount;
	}

	public void withDraw(double amount) {
		if (accBalance - amount > 500) {

			accBalance = accBalance - amount;
		}

	}

	public double getAccBalance() {
		return accBalance;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

}
