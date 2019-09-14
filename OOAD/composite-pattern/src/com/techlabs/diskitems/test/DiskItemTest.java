package com.techlabs.diskitems.test;

import com.techlabs.diskitems.File;
import com.techlabs.diskitems.Folder;

public class DiskItemTest {

	public static void main(String[] args) {
		Folder movies = new Folder("Movies");
		
		movies.addDiskItem(new File("abcd", 750, "avi"));
		movies.addDiskItem(new File("singham",360,"mp4"));
		
		Folder comedy = new Folder("Comedy");
		comedy.addDiskItem(new File("xyz",1000,"avi"));
		movies.addDiskItem(new File("Phir Hera Pheri",700,"avi"));
		movies.addDiskItem(comedy);
		
		Folder horror = new Folder("Horror");
		horror.addDiskItem(new File("IT",300,"mp4"));
		movies.addDiskItem(horror);

		movies.display();
		
		
		
		

	}

}
