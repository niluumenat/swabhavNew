package com.techlabs.demo;

interface Vehicle {
	final int a = 10;
	int speed(int a);
}

interface Derived extends Vehicle {
	final int x = 2;
	int changeGear(int x);
}

class Car implements Derived {
	int gear;
	int speed;

	@Override
	public int speed(int newSpeed) {
		speed = newSpeed;
		return speed;
	}

	@Override
	public int changeGear(int newGear) {
		gear = newGear;
		return gear;
	}
}
