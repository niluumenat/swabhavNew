package com.techlabs.inheritance;

public class Boy implements IManner, IEmotion {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("boy is crying");
	}

	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		System.out.println("Boy is laughing");
	}

	@Override
	public void wish() {
		// TODO Auto-generated method stub
		System.out.println("Boy is wishing");
	}

	@Override
	public void depart() {
		// TODO Auto-generated method stub
		System.out.println("Boy's depart");
	}

	
}
