package com.techlabs.guitar;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numString;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numString = numString;
	}
	public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public int getNumString() {
		return numString;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public boolean matches(GuitarSpec otherSpec) {
		if(builder!=otherSpec.builder){
			return false;
		}
		if(model!=otherSpec.model){
			return false;
		}
		if(numString!=otherSpec.numString){
			return false;
		}
		if(type!=otherSpec.type){
			return false;
		}
		if(backWood!=otherSpec.backWood){
			return false;
		}
		if(topWood!=otherSpec.topWood){
			return false;
		}
		
		
		
		
		return true;
	}
	
	
	
	

}
