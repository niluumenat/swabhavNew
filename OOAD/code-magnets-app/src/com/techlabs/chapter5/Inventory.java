package com.techlabs.chapter5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
		private List inventory;
		
		public Inventory() {
			inventory = new LinkedList<>();
		}

		public void addInstrument(String serialNo, double price,InstrumentSpec spec) {
			Instrument instrument=null;
			

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
