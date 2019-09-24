package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.board.Board;
import com.techlabs.cell.Mark;
import com.techlabs.game.Game;
import com.techlabs.game.Player;
import com.techlabs.result.Result;
import com.techlabs.result.ResultAnalyzer;

public class TicTacToeTest {

	public static void main(String[] args) {
		Player player[] = new Player[2];
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Board board = resultAnalyzer.getBoard();

		Game game = new Game(player, resultAnalyzer, board);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();

		player[0] = new Player(Mark.O);
		player[0].setName(name);
		System.out.println("Enter second name: ");
		String name2 = sc.next();
		player[1] = new Player(Mark.X);
		player[1].setName(name2);
		board.display();

		while (game.getStatus() == Result.PROGRESS) {
			int input = Integer.parseInt(sc.next());
			game.play(input);
			board.display();

		}

	}

}
