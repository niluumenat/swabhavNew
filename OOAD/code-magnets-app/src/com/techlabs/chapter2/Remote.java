package com.techlabs.chapter2;

public class Remote {
	private DogDoor door;

	public Remote(DogDoor door) {
		super();
		this.door = door;
	}
	
	public void pressButton(){
		System.out.println("Pressing the remote control button... ");
		if(door.isOpen()){
			door.close();
		}
		else{
			door.open();
		}
	}

}
	
