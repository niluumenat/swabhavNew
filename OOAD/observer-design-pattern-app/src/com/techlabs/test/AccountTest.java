package com.techlabs.test;

import com.techlabs.publisher.Account;
import com.techlabs.subscriber.EmailListeners;
import com.techlabs.subscriber.SmsListeners;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account("101", "Nilam", 5000);
		acc1.registerSubscriber(new SmsListeners());
		acc1.registerSubscriber(new EmailListeners());
		
		acc1.deposit(100);
		acc1.withdraw(300);
		
		
	}

}
