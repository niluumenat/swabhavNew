package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.InSufficientFundsException;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(3000, "kohli");
		display(acc);
		Account acc1 = new Account(2037, "helee", 0);
		acc1.deposit(1000);
		display(acc1);
		try {
			acc1.withDraw(3000);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void display(Account acc1) {
		System.out.println("Account number is:" + acc1.getAccNo() + " Account holders's name:" + acc1.getName()
				+ " Account balance is:" + acc1.getAccBalance());

	}

}
