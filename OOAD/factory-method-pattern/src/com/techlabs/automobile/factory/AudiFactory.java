package com.techlabs.automobile.factory;

public class AudiFactory implements IAutomobileFactory {
	private static AudiFactory factory;

	private AudiFactory() {

	}

	public static AudiFactory getInstance() {
		if (factory == null) {
			factory = new AudiFactory();
		}
		return factory;

	}

	
	@Override
	public IAutomobile make() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
