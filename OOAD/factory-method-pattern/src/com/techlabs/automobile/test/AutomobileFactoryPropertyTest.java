package com.techlabs.automobile.test;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.automobile.factory.IAutomobile;
import com.techlabs.automobile.factory.IAutomobileFactory;

public class AutomobileFactoryPropertyTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
		 loadFromPropertyFile();
		
		

	}
	
	private static IAutomobileFactory loadFromPropertyFile() throws IOException, ClassNotFoundException{
		FileReader file = new FileReader("Resources/config.properties");

		Properties p = new Properties();
		p.load(file);
		
		String s= p.getProperty("currentfactory");
		Class<?> cls = Class.forName(s);
		System.out.println(cls);
		
		Method[] methods = cls.getClass().getMethods();
		
		for(Method method:methods){
			System.out.println(method.getName());
			
			
		}
		
		
		return null;
	}
}
