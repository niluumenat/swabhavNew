package com.techlabs.context;

import com.techlabs.states.StateOfTv;

public class TVContext implements StateOfTv {
	private StateOfTv stateOfLedTv;

	public StateOfTv getStateOfLedTv() {
		return stateOfLedTv;
	}

	public void setStateOfLedTv(StateOfTv stateOfLedTv) {
		this.stateOfLedTv = stateOfLedTv;

	}

	@Override
	public void doTurnOnOrOff() {
		System.out.println("Current state : " + stateOfLedTv.getClass().getName());
		stateOfLedTv.doTurnOnOrOff();
	}

}
