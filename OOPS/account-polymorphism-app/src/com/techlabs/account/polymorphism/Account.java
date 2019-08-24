package com.techlabs.account.polymorphism;

public abstract class Account {
	private int accNo;
	private String name;
	protected double balance;
	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double dBalance){
		balance=balance+dBalance;
	}
	
	abstract public void withDraw(double newBalance);

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	
}
