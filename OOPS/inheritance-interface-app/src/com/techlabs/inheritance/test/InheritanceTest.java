package com.techlabs.inheritance.test;

import com.techlabs.inheritance.Boy;
import com.techlabs.inheritance.IEmotion;
import com.techlabs.inheritance.IManner;
import com.techlabs.inheritance.Man;

public class InheritanceTest {
	public static void main(String[] args){
		atTheParty(new Man());
		atTheParty(new Boy());
		
		atTheMovies(new Boy());
		//atTheMovies(new Man());
		

	}

	private static void atTheParty(IManner obj) {
		System.out.println("At the Party: ");
		obj.wish();
		obj.depart();
	}

	private static void atTheMovies(IEmotion obj) {
		System.out.println("At the Movies: ");
		obj.cry();
		obj.laugh();
	}

}
