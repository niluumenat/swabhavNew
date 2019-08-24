package com.techlabs.player;

public class Player {
	private final String name;
	private final int age;
	private final int id;
	public static int playerCount;

	static {
		playerCount = 0;
		System.out.println("Inside Static Block: " + playerCount);
	}

	public Player(int id, String name, int age) {
		playerCount = playerCount + 1;
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public Player(int id, String name) {
		this(id, name, 18);
	}
	
	public static int headCount() {
		return playerCount;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	public Player whoIsElder(Player p) {

		if (p.age > this.age) {
			return p;
		}
		return this;
	}

}
