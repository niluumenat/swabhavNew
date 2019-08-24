package com.techlabs.checked.exceptions;

public class DemoTest {
	static void checkAge(int age) throws InvalidAgeException{
		if(age<18){
			throw new InvalidAgeException("not valid");
			}
		else{
			throw new InvalidAgeException("welcome to website");
		}
		
	}
	public static void main(String[] args){
		try {
			checkAge(27);
		} catch (InvalidAgeException a) {
			System.out.println("invalid age"+a);
			
		}
		
		
	}

}
