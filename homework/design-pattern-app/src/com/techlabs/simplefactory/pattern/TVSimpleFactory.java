package com.techlabs.simplefactory.pattern;

public class TVSimpleFactory {
	

	public static ITV getTV(TVMode mode) {
		if (mode.equals(TVMode.LED)) {
			return new ITV() {

				@Override
				public void createTv() {
					// TODO Auto-generated method stub
					System.out.println("LED TV");
				}

			};
		}
		return null;

	}
	
	public static void main(String[] args) {
		TVSimpleFactory.getTV(TVMode.LED).createTv();
	}

}
