package com.techlabs.automobile.test;

import com.techlabs.automobile.factory.BmwFactory;
import com.techlabs.automobile.factory.IAutomobile;
import com.techlabs.automobile.factory.IAutomobileFactory;
import com.techlabs.automobile.factory.TeslaFactory;

public class AutomobileFactoryTest {

	public static void main(String[] args) {
		IAutomobileFactory factory = TeslaFactory.getInstance();
		IAutomobileFactory factory2 = BmwFactory.getInstance();
		IAutomobile auto = factory.make();
		factory2.make().start();
		factory2.make().stop();
		
		System.out.println(factory.getClass().toString());
		auto.start();
		auto.stop();
		
		
			
			
	}

}
