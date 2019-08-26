package com.techlabs.chapter2;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		System.out.println("Fido barks to go out");
		remote.pressButton();
		System.out.println("\nFido has gone out");
		remote.pressButton();
		System.out.println("\nFido is all done");
		remote.pressButton();
		System.out.println("\nFido is back inside");
		remote.pressButton();
		
		
	}

}
