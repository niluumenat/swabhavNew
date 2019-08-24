package com.techlabs.account;

public class Account {
	private final int accNo;
	private final String name;
	private double accBalance;
	private String description;
	public Account account;

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		String result = " no: " + getAccNo() + "name: " + getName() + " balance :" + getAccBalance() + "\n"
				+ super.toString();
		return result;

	}

	@Override
	public boolean equals(Object obj) {
		boolean equal = false;
		Account acc = (Account) obj;
		if (accNo == acc.getAccNo()) {
			equal = true;
		}
		return equal;
	}

	public Account(int accNo, String name, double accBalance, String description) {
		this.accNo = accNo;
		this.name = name;
		this.accBalance = accBalance;
		this.description = description;
	}

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

	public void withDraw(double amount) throws InSufficientFundsException {
		if (accBalance - amount > 500) {
			accBalance = accBalance - amount;
		} else {
			throw new InSufficientFundsException(this, amount);
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
