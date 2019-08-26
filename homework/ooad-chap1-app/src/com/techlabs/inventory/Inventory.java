package com.techlabs.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.GuitarSpec;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;

public class Inventory {
	private List guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNo, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood, int numString) {
		GuitarSpec spec=new GuitarSpec(builder, model, type, backWood, topWood, numString);
		Guitar guitar=new Guitar(serialNo, price,spec);
		guitars.add(guitar);

	}
	public Guitar getGuitar(String serialNo){
		for(Iterator i=guitars.iterator();i.hasNext();){
			Guitar guitar=(Guitar) i.next();
			if(guitar.getSerialNo().equals(serialNo)){
				return guitar;
			}
		}
		return null;
		
	}
	
	public List search(GuitarSpec searchSpec){
		List matchingGuitars=new LinkedList<>();
		for(Iterator i=guitars.iterator();i.hasNext();){
			Guitar guitar=(Guitar) i.next();
			if(guitar.getSpec().matches(searchSpec)){
				matchingGuitars.add(guitar);
			}
		}
			
		return matchingGuitars;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
