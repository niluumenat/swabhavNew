package com.techlabs.game;

import java.util.Scanner;

public class GameRunner {
	Game game = new Game();

	public void startGame() {
		boolean isSuccess = false;
		while (isSuccess != true) {
			int input = getUserInput();
			int result = game.checkUserGuess(input);
			displayHint(result);
			if (result == 0) {
				isSuccess = true;
			}
		}
	}

	private int getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 1 to 100:");
		int userInput = sc.nextInt();
		return userInput;
	}

	private void displayHint(int result) {
		if (result == 1) {
			System.out.println("too high");
		} else if (result == -1) {
			System.out.println("too low");
		} else if (result == 0) {
			System.out.println("success");

		}
	}

}
