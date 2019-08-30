package com.techlabs.chapter2;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		super();
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("BarkungRecognizer: heard a '" + bark.getSound() + " ' ");
		List allowedBarks = door.getAllowedBark();
		for (Iterator i = allowedBarks.iterator(); i.hasNext();) {
			Bark allowedBark = (Bark) i.next();
			if (allowedBark.equals(bark)) {
				door.open();
				return;
			}
		}
		System.out.println("This dog is not allowed..");
	}

}
