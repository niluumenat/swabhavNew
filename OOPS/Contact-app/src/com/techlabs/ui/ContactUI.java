package com.techlabs.ui;

import java.util.Scanner;

import com.techlabs.contact.Contact;

public class ContactUI {
	public static void contactUi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to Add Contact\nEnter 2 to View All Contact ");
		int choice = 4;
		while (choice != 0) {
			System.out.println("Enter your Choice:");
			choice = Integer.parseInt(sc.nextLine());
			Contact contact = new Contact("Nilam", "Patel", "2647@gmail.com", "23743478");
			if (choice == 1) {
				System.out.print("First Name: ");
				contact.setFirstName(sc.nextLine());
				System.out.print("Last Name: ");
				contact.setLastNmae(sc.nextLine());
				System.out.print("Email Id: ");
				contact.setEmailId(sc.nextLine());
				System.out.print("Contact No: ");
				contact.setContactNumber(sc.nextLine());
			}
			if (choice == 2) {
				System.out.println("Name: " + contact.getFirstName() + " " + contact.getLastNmae() + "Email Id: "
						+ contact.getEmailId() + "Contact No.: " + contact.getContactNumber());
			}
		}

	}

}
