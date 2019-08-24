package com.techlabs.account.polymorphism.test;

import com.techlabs.account.polymorphism.Account;
import com.techlabs.account.polymorphism.CurrentAccount;
import com.techlabs.account.polymorphism.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		System.out.println("Details of Saving Account:");
		SavingAccount saving = new SavingAccount(101, "Hetu", 5000);
		printAccStatement(saving);
		saving.deposit(400);
		printAccStatement(saving);
		saving.withDraw(6000);
		printAccStatement(saving);

		System.out.println("Details of Current Account:");
		CurrentAccount current = new CurrentAccount(202, "nilam", 2000);
		printAccStatement(current);
		current.deposit(300);
		printAccStatement(current);
		current.withDraw(5000);
		printAccStatement(current);
		current.withDraw(2700);
		printAccStatement(current);

	}

	public static void printAccStatement(Account acc) {
		System.out.println("Account No: " + acc.getAccNo() + " Account Name: " + acc.getName() + " Account Balance: "
				+ acc.getBalance());

	}

}
