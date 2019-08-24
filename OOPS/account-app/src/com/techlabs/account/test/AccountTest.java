package com.techlabs.account.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) throws IOException, Exception {
		Account acc = new Account(3000, "kohli");
		display(acc);
		Account acc1 = new Account(2037, "helee", 500);
		acc1.deposit(1000);
		display(acc1);
		try {
			acc1.withDraw(3000);
		} catch (RuntimeException runtimeException) {
			display(acc1);
		}

		FileOutputStream fs = new FileOutputStream("resource/read.file");
		ObjectOutputStream output = new ObjectOutputStream(fs);
		output.writeObject(acc1);

		output.flush();
		output.close();
		System.out.println("success");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("resource/read.file"));
		Account acc3 = (Account) in.readObject();
		display(acc3);
		in.close();
	}

	private static void display(Account acc1) {
		System.out.println("Account number is:" + acc1.getAccNo() + " Account holders's name:" + acc1.getName()
				+ " Account balance is:" + acc1.getAccBalance());

	}

}
