package com.techlabs.crudable.arraylist;

public class CrudClass {
	public final String id;
	public final String name;
	public final String marks;
	public CrudClass(String id, String name, String marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString(){
		return id+" "+name+" "+marks;
		
	}
	/*public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}*/
	
	
	
	

}
