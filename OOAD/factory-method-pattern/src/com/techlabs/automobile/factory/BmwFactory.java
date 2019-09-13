package com.techlabs.automobile.factory;

public class BmwFactory implements IAutomobileFactory {
	private static BmwFactory factory;

	private BmwFactory() {

	}

	public static BmwFactory getInstance() {
		if (factory == null) {
			factory = new BmwFactory();
		}
		return factory;

	}

	@Override
	public IAutomobile make() {
		return new Bmw();
	}

}
