package com.techlabs.strategy.pattern;

public class DemoStrategy {

	public static void main(String[] args) {
		Context context=new Context(new OperationAdd());
		System.out.println("Add two numbers "+ context.executeStrategy(10, 24));
		
		System.out.println("Multipy two numbers "+context.executeStrategy(2, 5));
	}

}
