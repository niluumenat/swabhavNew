package com.techlabs.test;

import com.techlabs.concrete.TVOffState;
import com.techlabs.concrete.TVOnState;
import com.techlabs.context.TVContext;
import com.techlabs.states.StateOfTv;

public class TVRemote {

	public static void main(String[] args) {
		TVContext context = new TVContext();
		StateOfTv ledTvOnState = new TVOnState();
		StateOfTv ledTvOffState = new TVOffState();

		context.setStateOfLedTv(ledTvOnState);
		context.doTurnOnOrOff();

		context.setStateOfLedTv(ledTvOffState);
		context.doTurnOnOrOff();
	}
}
