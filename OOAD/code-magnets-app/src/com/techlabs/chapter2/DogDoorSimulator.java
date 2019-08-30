package com.techlabs.chapter2;

public class DogDoorSimulator {

	public static void main(String[] args) throws InterruptedException {
		DogDoor door=new DogDoor();
		door.addAllowedBark(new Bark("Woof"));
		door.addAllowedBark(new Bark("roowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		Remote remote=new Remote(door);
		BarkRecognizer recognizer =new BarkRecognizer(door);
		
		System.out.println("Fido starts barking..  ");
		recognizer.recognize(new Bark("woof"));
		System.out.println("\nFido has gone outside");
		
		
		
			Thread.currentThread().sleep(10000);
			System.out.println("\nFido is all done....");
			System.out.println("...but he's stuck outside!");
			Bark smallDogBark=new Bark("yip");
			System.out.println("A small dog starts barking...");
			recognizer.recognize(smallDogBark);
			
			Thread.currentThread().sleep(5000);
			System.out.println("Fido starts barking");
			recognizer.recognize(new Bark("Woof"));
			
			System.out.println("\nFido is back inside");
				
		
		
		
	}

}
