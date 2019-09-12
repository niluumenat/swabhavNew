package com.techlabs.contactUI;

import java.io.IOException;
import java.util.Scanner;

import com.techlabs.contact.Contact;
import com.techlabs.contact.ContactManager;

public class ContactUI {
	private final int ADD = 1;
	private final int VIEW = 2;
	private final int EXPORT = 3;
	private final int EXIT = 4;

	public Contact contact;
	ContactManager manager = new ContactManager();
	Scanner sc = new Scanner(System.in);

	public void contactUI() throws IOException, ClassNotFoundException {
		int choice = 8;
		while (choice != 6) {
			System.out.println("1. Add Contact ");
			System.out.println("2. view All contact ");
			System.out.println("3. Export ");
			System.out.println("4. Exit ");
			System.out.println("Choose: ");
			choice = sc.nextInt();
			switch (choice) {
			case ADD: {
				addContact();
				break;
			}
			case VIEW: {
				viewContacts();
				break;
			}
			case EXPORT: {
				exportContacts();
				break;
			}
			case EXIT: {
				System.exit(0);
			}
			default:
				System.out.println("Error");
			}
		}
	}

	public void exportContacts() {
		manager.exportContacts();
	}

	public void viewContacts() throws ClassNotFoundException, IOException {
		for (Contact cc : manager.getContacts()) {
			System.out.println(cc.getName() + " " + cc.getEmail() + " " + cc.getPhoneNo());
		}

	}

	public void addContact() throws IOException {
		System.out.print("name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Contact: ");
		String no = sc.next();

		Contact c3 = new Contact(name, email, no);
		manager.addContacts(c3);

	}

}
