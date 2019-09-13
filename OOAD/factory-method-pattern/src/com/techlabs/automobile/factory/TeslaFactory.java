package com.techlabs.automobile.factory;

public class TeslaFactory implements IAutomobileFactory {
	private static TeslaFactory factory;

	private TeslaFactory() {

	}

	public static TeslaFactory getInstance() {
		if (factory == null) {
			factory = new TeslaFactory();
		}
		return factory;

	}
	
	@Override
	public IAutomobile make() {
		// TODO Auto-generated method stub
		return new Tesla();
	}

}
