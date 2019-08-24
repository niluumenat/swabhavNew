package com.techlabs.crud.test;

import com.techlabs.crud.AddressDB;
import com.techlabs.crud.CustomerDB;
import com.techlabs.crud.ICrudable;
import com.techlabs.crud.InvoiceDB;

public class TestCrud {
	public static void main(String[] args){
		CustomerDB customer=new CustomerDB();
		doDBOperations(customer);
		
		InvoiceDB invoice=new InvoiceDB();
		doDBOperations(invoice);
		
		AddressDB address =new AddressDB();
		doDBOperations(address);
		
	}

	private static void doDBOperations(ICrudable x) {
		System.out.println("Doing class DB Operations: ");
		x.create();
		x.read();
		x.update();
		x.remove();
		
		
		
	}

}
