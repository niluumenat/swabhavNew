package com.techlabs.chapter2;

public class DogDoor {
	
	private boolean open;

	public DogDoor() {
		super();
		this.open = false;
	}

	public void open(){
		System.out.println("The dog door opens. ");
		open=true;
	}
	public void close(){
		System.out.println("The dog door closes. ");
		open=false;
	}
	
	public boolean isOpen(){
		return open;
		
	}
	
	

}
