package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.board.Board;
import com.techlabs.cell.Mark;
import com.techlabs.game.Game;
import com.techlabs.game.GameRunner;
import com.techlabs.game.Player;
import com.techlabs.result.Result;
import com.techlabs.result.ResultAnalyzer;

public class TicTacToeTest {

	public static void main(String[] args) {
		System.out.println("Let's play");
		GameRunner runner = new GameRunner().start();

	}

}
