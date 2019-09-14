package com.techlabs.diskitems;

public class File implements IDiskItem {
	private String name;
	private int size;
	private String extension;
	
	public File(String name, int size, String extension) {
		super();
		this.name = name;
		this.size = size;
		this.extension = extension;
	}
	

	@Override
	public void display() {
		System.out.println("   "+name +"."+extension);
	}

	private String getName() {
		return name;
	}
	private int getSize() {
		return size;
	}
	private String getExtension() {
		return extension;
	}
	
	

}
