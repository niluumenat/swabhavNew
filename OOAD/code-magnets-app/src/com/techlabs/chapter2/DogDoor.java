package com.techlabs.chapter2;

import java.util.ArrayList;
import java.util.List;

public class DogDoor {
	
	private boolean open;
	public List<Bark> allowedBarks=new ArrayList<Bark>();

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

	public void addAllowedBark(Bark allowedBark){
		allowedBarks.add(allowedBark);
	}
	
	public List<Bark> getAllowedBark() {
		return allowedBarks;
	}

	
	
	

}
