
package com.techlabs.property.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) throws IOException{
		FileReader file=new FileReader("Java Resources/resources/config.properties.txt");
		
		Properties p= new Properties();
		p.load(file);
		
		System.out.println(p.getProperty("UserId"));
		System.out.println(p.getProperty("Password"));
	}

}
