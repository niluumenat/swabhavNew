package com.techlabs.game;

import com.techlabs.board.Board;
import com.techlabs.board.IBoard;
import com.techlabs.cell.Mark;
import com.techlabs.result.IResultAnalyzer;
import com.techlabs.result.Result;

public class Game {

	private Player[] players;
	private IResultAnalyzer resultAnalyzer;
	private IBoard board;
	private Result status = Result.PROGRESS;
	private Player currentPlayer;

	public Game(Player[] players, IResultAnalyzer resultAnalyzer, IBoard board) {
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

	public IResultAnalyzer getResultAnalyzer() {
		return resultAnalyzer;
	}

	public IBoard getBoard() {
		return board;
	}

	public Result getStatus() {
		return status;
	}

}
