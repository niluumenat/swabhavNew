package com.techlabs.account.polymorphism;

public class SavingAccount extends Account {

	public SavingAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withDraw(double amount) {
		if (balance - amount > 500) {
			balance = balance - amount;
		}
	}

}
