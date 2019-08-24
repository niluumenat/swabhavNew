package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1 = new Player(101, "Manish", 10);
		Player p2 = new Player(102, "Sachin");
		display1(p1);
		display1(p2);

		Player elder = p1.whoIsElder(p2);
		display1(elder);
	}
	

	private static void display1(Player p) {
		System.out.println("name is:" + p.getName());
		System.out.println("Age is:" + p.getAge());
		System.out.println("id is:" + p.getId());
	}
}
