package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.board.Board;
import com.techlabs.cell.Mark;
import com.techlabs.game.Game;
import com.techlabs.game.Player;
import com.techlabs.result.ResultAnalyzer;

public class TicTacToeTest {

	public static void main(String[] args) {
		Player player[] =new Player[2];
		player[0] = new Player(Mark.O, "Heta");
		player[1]= new Player(Mark.X, "nilu");
		ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
		Board board = resultAnalyzer.getBoard();
		
		Game game = new Game(player, resultAnalyzer, board);
		Scanner sc =new Scanner(System.in);

		game.play(4);
		game.play(5);
		game.play(7);
		game.play(1);
		game.play(6);
		game.play(8);
		game.play(2);
		game.play(0);
		//System.out.println("Player"+ player.getName() +game.getStatus());
	}

}
