package com.techlabs.strategy.pattern;

public class Context {
	public IStrategy strategy;

	public Context(IStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int executeStrategy(int a,int b){
		return strategy.doOperation(a, b);
		
	}
}
