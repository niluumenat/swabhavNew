package com.techlabs.chapter2;

public class DogDoorSimulator {

	public static void main(String[] args) throws InterruptedException {
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		System.out.println("  ");
		remote.pressButton();
		System.out.println("\nFido has gone outside");
		
		System.out.println("\nFido is all done....");
		
			Thread.currentThread().sleep(10000);
			System.out.println("...but he's stuck outside!");
			System.out.println("Fido scratches at the door");
			System.out.println("....so tod grabs the remote control");
			remote.pressButton();
			System.out.println("\nFido is back inside");
				
		
		
		
	}

}
