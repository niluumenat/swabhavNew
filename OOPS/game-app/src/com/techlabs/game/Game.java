package com.techlabs.game;

public class Game {

	public String checkGuessNo(int inputGuess, int randomGuessNumber) {
		String result = null;

		if (inputGuess == randomGuessNumber) {
			result = "success";
		} else if (inputGuess > randomGuessNumber) {
			result = "Too High";
		} else if (inputGuess < randomGuessNumber) {
			result = "Too Low";
		}
		return result;

	}
}
