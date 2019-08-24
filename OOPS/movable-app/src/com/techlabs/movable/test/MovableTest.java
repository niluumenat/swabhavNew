package com.techlabs.movable.test;

import com.techlabs.movable.Bike;
import com.techlabs.movable.Car;
import com.techlabs.movable.IMovable;
import com.techlabs.movable.Truck;

public class MovableTest {

	public static void main(String[] args) {
		Truck truck = new Truck();
		Car car=new Car();
		Bike bike=new Bike();
		IMovable[] moves = new IMovable[3];
		moves[0]=truck;
		moves[1]=car;
		moves[2]=bike;
		startRace(moves);
	}

	private static void startRace(IMovable[] movable) {
		for(IMovable movable2:movable){
			movable2.move();
		}
		
	}

}
