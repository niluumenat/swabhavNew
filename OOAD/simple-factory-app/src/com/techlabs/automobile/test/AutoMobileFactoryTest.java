package com.techlabs.automobile.test;

import com.techlabs.automobile.factory.AutoMobileFactory;
import com.techlabs.automobile.factory.AutoType;
import com.techlabs.automobile.factory.IAutomobile;

public class AutoMobileFactoryTest {

	public static void main(String[] args) {
		AutoMobileFactory factory = AutoMobileFactory.getInstance();
		IAutomobile auto = factory.make(AutoType.AUDI);
		
		System.out.println(auto.getClass().toString());
		
		auto.start();
		auto.stop();
	}

}
