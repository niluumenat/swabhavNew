package com.techlabs.strategy;

public class Context {
	public Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int executeStrategy(int a,int b){
		return strategy.doOperation(a, b);
		
	}
}
