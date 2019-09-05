package com.techlabs.chapter5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.management.modelmbean.ModelMBean;

public class FindInstrument {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map properties = new HashMap();
		properties.put("builder", Builder.COLLINGS);
		properties.put("backWood",Wood.CEDAR);
		
		InstrumentSpec clientSpec = new InstrumentSpec(properties);

		List matchingInstruments = inventory.search(clientSpec);
		if (!matchingInstruments.isEmpty()) {
			System.out.println("You might like these instruments: ");
			for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println(
						"We have a " + spec.getProperty("instrumentType") + " with the following properties..");
				for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String) j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println("    " + propertyName + "  :  " + spec.getProperty(propertyName));
					spec.getProperty(propertyName);
				}
				System.out.println("You can have this " + spec.getProperty("instrumentType") + "for only $"
						+ instrument.getPrice() + "--------");
			}

		} else {
			System.out.println("sorry!, we have nothing for you..");
		}

	}

	private static void initializeInventory(Inventory inventory) {
		Map properties = new HashMap<>();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.COLLINGS);
		properties.put("models", "CJ");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numOfStrings", 6);
		properties.put("topWood", Wood.ALDER);
		properties.put("backWood", Wood.CEDAR);
		inventory.addInstrument("112233", 2934.77, new InstrumentSpec(properties));

		properties.put("instumentType", InstrumentType.VIOLIN);
		properties.put("builder", Builder.COLLINGS);
		properties.put("model", "MV200");
		properties.put("type", Type.ACOUSTIC);
		properties.put("numOfStrings", 6);
		properties.put("topWood", Wood.ALDER);
		properties.put("backWood", Wood.COCOBOLO);
		inventory.addInstrument("12345", 345.65, new InstrumentSpec(properties));
	}

}
