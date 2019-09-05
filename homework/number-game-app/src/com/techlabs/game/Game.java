package com.techlabs.game;

public class Game {
	private int randomNo;

	public Game() {
		this.randomNo = generateRandomNo();
	}

	public int generateRandomNo() {
		int randomNo = (int) ((Math.random() * 101) + 1);
		return randomNo;
	}

	public int checkUserGuess(int userGuess) { 
		int result = -1;
		if (userGuess == randomNo) {
			result = 0;
		} else if (userGuess > randomNo) {
			result = 1;
		} else if (userGuess < randomNo) {
			result = -1;
		}
		return result;

	}

}
