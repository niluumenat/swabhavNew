package com.techlabs.game;

import com.techlabs.board.Board;
import com.techlabs.cell.Mark;
import com.techlabs.result.Result;
import com.techlabs.result.ResultAnalyzer;

public class Game {

	private Player[] players;
	private ResultAnalyzer resultAnalyzer;
	private Board board;
	private Result status;
	private Player currentPlayer;

	public Game(Player[] players, ResultAnalyzer resultAnalyzer, Board board) {
		this.players= players;
		this.resultAnalyzer = resultAnalyzer;
		this.board = board;
		this.players[0] = players[0];
		this.players[1] = players[1];
		this.currentPlayer = this.players[0];
	}

	public void play(int position) {
		if (resultAnalyzer.getResult() != Result.WIN) {
			if (currentPlayer == players[0]) {
				board.addMark(position, currentPlayer.getMark());
				currentPlayer = players[1];
			} else {
				board.addMark(position, currentPlayer.getMark());
				currentPlayer = players[0];
			}

		}
		resultAnalyzer.isWinner();
		status = resultAnalyzer.getResult();
		if (status == Result.WIN) {
			System.out.println("Player " + currentPlayer.getName() + "Won");
		}
	}

	public void winner() {
		if (status == Result.WIN) {

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
