package com.techlabs.game.test;

import java.util.Scanner;

import com.techlabs.game.Game;

public class NumberGameTest {
	public void playGame() {

		Game g = new Game();

		int randomGuessNum = (int) (Math.random() * 101) + 1;

		boolean isSuccess = false;

		while (isSuccess != true) {

			int inputGuess = Integer.parseInt(getUserInput());

			String d = g.checkGuessNo(inputGuess, randomGuessNum);
			System.out.println(d);
			if (d == "success") {
				isSuccess = true;
			}
		}

	}

	@SuppressWarnings("resource")
	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number between 1 to 100");
		String userguess = sc.nextLine();
		return userguess;
	}

}
