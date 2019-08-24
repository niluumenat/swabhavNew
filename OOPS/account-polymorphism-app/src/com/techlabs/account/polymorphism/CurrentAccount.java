package com.techlabs.account.polymorphism;

public class CurrentAccount extends Account {

	private final int BALANCE = -5000;

	public CurrentAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withDraw(double amount) {
		if (balance - amount >= BALANCE) {
			balance = balance - amount;
		}

	}

}
