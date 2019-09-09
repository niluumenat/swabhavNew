package com.techlabs.result;

import com.techlabs.board.Board;

public interface IResultAnalyzer {

	void isWinner();

	Result getResult();

	Board getBoard();

}