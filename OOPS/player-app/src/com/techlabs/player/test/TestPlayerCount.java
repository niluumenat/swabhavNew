package com.techlabs.player.test;

import com.techlabs.player.Player;

public class TestPlayerCount {
	public static void main(String[] args){
		
		Player p1=new Player(0, "abs");
		System.out.println(p1.getPlayerCount());
		Player p2=new Player(101,"xyz");
		System.out.println(p1.getPlayerCount());
		Player p3=new Player(201,"des");
		System.out.println(p1.getPlayerCount());
		System.out.println("Head Count: "+Player.headCount());
	}

}
