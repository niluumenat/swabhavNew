package com.techlabs.game;

import java.util.Scanner;

import com.techlabs.board.IBoard;
import com.techlabs.cell.Cell;
import com.techlabs.cell.Mark;
import com.techlabs.result.IResultAnalyzer;
import com.techlabs.result.Result;
import com.techlabs.result.ResultAnalyzer;

public class GameRunner {
	GameRunner GameRunner = null;
	Player player[] = new Player[2];
	IResultAnalyzer resultAnalyzer = new ResultAnalyzer();
	IBoard board = resultAnalyzer.getBoard();
	
	Game game = new Game(player, resultAnalyzer, board);
	
	public GameRunner start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		

		player[0] = new Player(Mark.O);
		player[0].setName(name);
		System.out.println("Enter second name: ");
		String name2 = sc.next();
		player[1] = new Player(Mark.X);
		player[1].setName(name2);
		display();
		
		while (game.getStatus() == Result.PROGRESS) {
			int input=Integer.parseInt(sc.next());
			game.play(input);
			display();
		}
		return GameRunner;
	}
	
	public void display() {
		
		Cell[] cells=board.getCells();
		
		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0)
				System.out.println();

			if (cells[i].getMark() == Mark.EMPTY) {
				System.out.print(i + " | ");
			} else {
				System.out.print(cells[i].getMark() + " | ");
			}

		}
	}
	

}
