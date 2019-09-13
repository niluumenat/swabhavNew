package com.techlabs.game;

import com.techlabs.board.Board;
import com.techlabs.result.Result;
import com.techlabs.result.ResultAnalyzer;

public class Game {
	private Player[] players;
	private ResultAnalyzer resultAnalyzer;
	private Board board;
	private Result status = Result.PROGRESS;
	private Player currentPlayer;

	public Game(Player[] players, ResultAnalyzer resultAnalyzer, Board board) {
		this.players = players;
		this.resultAnalyzer = resultAnalyzer;
		this.board = board;
		this.players[0] = players[0];
		this.players[1] = players[1];
		this.currentPlayer = this.players[0];
	}

	public void play(int position) {
		Player p;
		if (status != Result.WIN || status != Result.DRAW) {
			if (currentPlayer == players[0]) {
				board.addMark(position, currentPlayer.getMark());
				p = players[0];
				currentPlayer = players[1];
			} else {
				board.addMark(position, currentPlayer.getMark());
				p = players[1];
				currentPlayer = players[0];

			}
			resultAnalyzer.isWinner();
			status = resultAnalyzer.getResult();
			if (status == Result.WIN) {
				System.out.println( p.getName() + " Won");
			}
			if (status == Result.DRAW) {
				System.out.println("Game Draw");
			}
		}
	}

	public Player[] getCurrentPlayer() {
		return players;
	}

	public ResultAnalyzer getResultAnalyzer() {
		return resultAnalyzer;
	}

	public Board getBoard() {
		return board;
	}

	public Result getStatus() {
		return status;
	}

}
