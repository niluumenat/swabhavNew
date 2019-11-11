package com.techlabs.concrete;

import com.techlabs.states.StateOfTv;

public class TVOnState implements StateOfTv {

	@Override
	public void doTurnOnOrOff() {
		System.out.println("TV is turned ON");
	}

}
