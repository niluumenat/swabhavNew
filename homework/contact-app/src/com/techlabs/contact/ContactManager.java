package com.techlabs.contact;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ContactManager {
	public ArrayList<Contact> list = new ArrayList<>();
	public Contact contact;

	public ContactManager() {
		super();
		try {
			this.list = retrieve();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.contact = contact;
	}

	public void exportContacts() {
		String COMMA_DELIMETER = ",";
		String NEW_LINESEPERATOR = "\n";
		String FILE_HEADER = "name,email,contact";

		File file = new File("resources/contact_export.csv");
		if (!file.exists()) {

		}
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.append(FILE_HEADER);
			for (Contact contact : list) {
				fileWriter.append(NEW_LINESEPERATOR);
				fileWriter.append(contact.getName());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(contact.getEmail());
				fileWriter.append(COMMA_DELIMETER);
				fileWriter.append(contact.getPhoneNo());

			}
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void store(ArrayList<Contact> c) throws IOException {
		ArrayList<Contact> contacts = c;
		try {
			FileOutputStream fs = new FileOutputStream("resources/contact.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(contacts);
			os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private ArrayList<Contact> retrieve() throws IOException, ClassNotFoundException {
		try {
			File f = new File("resources/contact.txt");
			if (!f.exists()) {
				f.createNewFile();
				list = new ArrayList<>();
			}	
			FileInputStream file = new FileInputStream(f);
			ObjectInputStream os = new ObjectInputStream(file);
			list = (ArrayList<Contact>) os.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public List<Contact> getContacts() throws ClassNotFoundException, IOException {
		File file = new File("resources/contact.txt");
		if (file.length() == 0) {
			ArrayList<Contact> contact = retrieve();
			list.addAll(contact);
		}
		return list;
	}

	public void addContacts(Contact c) throws IOException {
		list.add(c);
		store(list);
	}

}
