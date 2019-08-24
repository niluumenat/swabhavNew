package com.techlabs.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.account.Account;

public class AccountSerialization {
	public static void serialization(Account acc) throws IOException {
		FileOutputStream fs = new FileOutputStream("resource\\read.file");
		ObjectOutputStream output = new ObjectOutputStream(fs);
		output.writeObject(acc);

		output.flush();
		output.close();
		System.out.println("success");
	}

	public static void deserialization(Account acc) throws IOException, Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("resource\\read.file"));
		Account acc1 = (Account) in.readObject();
		display(acc1);
		in.close();
	}
	
	public static void main(String args[]) throws Exception{
		
		
		Account acc = new Account(101, "xyz", 3000);
		display(acc);
		acc.deposit(600);
		serialization(acc);
		display(acc);
		deserialization(acc);
		
		Account acc1=new Account(101, "XYZ", 3000, "Saving");
		serialization(acc1);
		display(acc1);
		deserialization(acc1);
		
	}
	
	private static void display(Account acc1) {
		System.out.println("Account number is:" + acc1.getAccNo() + " Account holders's name:" + acc1.getName()
				+ " Account balance is:" + acc1.getAccBalance()+ "Account description is" + acc1.getDescription());

	}

}
