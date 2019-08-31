package com.techlabs.chapter5;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTesters {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpec whatEricLikes = new GuitarSpec(Builder.FENDER, "Stratocoastor", Type.ACOUSTIC, Wood.CEDAR,
				Wood.CEDAR, 12);
		List matchingGuitar = inventory.search(whatEricLikes);
		if (!matchingGuitar.isEmpty()) {
			System.out.println("Eric you might like these guitars:");
			for (Iterator i = matchingGuitar.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				System.out.println("We have a  " + guitar.getSpec().getModel() + " " + guitar.getSpec().getType()
						+ " guitar.\n" + guitar.getSpec().getBuilder() + " " + guitar.getSpec().getBackWood()
						+ " back and side wood, " + guitar.getSpec().getTopWood() + " top. \nyou can have it only for $"
						+ guitar.getPrice()+"\n---------------");
			}
		} else {
			System.out.println("Sorry Eric, we have nothing for you");
		}

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("123", 394.2, Builder.FENDER, "Stratocoastor", Type.ACOUSTIC, Wood.CEDAR, Wood.CEDAR, 12);
		inventory.addGuitar("134", 483.5, Builder.COLLINGS, "Stratocoastor", Type.ELECTRIC, Wood.ALDER, Wood.CEDAR, 6);
		inventory.addGuitar("154", 345.32, Builder.FENDER, "Stratocoastor", Type.ACOUSTIC, Wood.CEDAR, Wood.CEDAR, 12);
	}

}
