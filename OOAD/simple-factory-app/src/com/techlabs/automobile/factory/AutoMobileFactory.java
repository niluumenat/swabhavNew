package com.techlabs.automobile.factory;

public class AutoMobileFactory {
	private static AutoMobileFactory auto;
	
	private AutoMobileFactory(){
		
	}
	
	public static AutoMobileFactory getInstance(){
		if (auto == null) {
			auto = new AutoMobileFactory();
		}
		return auto;
		
	}
	
	public IAutomobile make(AutoType type) {
		if (type == AutoType.AUDI) {
			return new Audi();
		} else if (type == AutoType.BMW) {
			return new Bmw();
		} else {
			return new Tesla();
		}
	}
	
	

}
