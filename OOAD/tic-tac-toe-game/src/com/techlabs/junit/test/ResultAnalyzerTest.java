package com.techlabs.junit.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.techlabs.board.Board;
import com.techlabs.cell.Mark;
import com.techlabs.result.Result;
import com.techlabs.result.ResultAnalyzer;

public class ResultAnalyzerTest {
	ResultAnalyzer resultAnalyzer = new ResultAnalyzer();
	Board board = resultAnalyzer.getBoard();

	@Test
	public void checkResultWhenMarkIsEmpty() {
		board.addMark(0, Mark.O);
		board.addMark(1, Mark.O);
		board.addMark(2, Mark.X);
		board.addMark(3, Mark.X);
		board.addMark(4, Mark.EMPTY);
		board.addMark(5, Mark.O);
		board.addMark(6, Mark.O);
		board.addMark(7, Mark.X);
		board.addMark(8, Mark.X);

		resultAnalyzer.isWinner();
		assertEquals(Result.PROGRESS, resultAnalyzer.getResult());

	}
	@Test
	public void checkRow(){
		board.addMark(0, Mark.O);
		board.addMark(1, Mark.X);
		board.addMark(2, Mark.O);
		
		resultAnalyzer.isWinner();
		assertEquals(resultAnalyzer.getResult(), Result.PROGRESS);
	}
	@Test
	public void checkDiagonal(){
		board.addMark(0, Mark.O);
		board.addMark(4, Mark.O);
		board.addMark(8, Mark.O);
		resultAnalyzer.isWinner();
		
		assertEquals(resultAnalyzer.getResult(), Result.WIN);	
	}
	
	@Test
	public void checkVerticle(){
		board.addMark(1, Mark.EMPTY);
		board.addMark(4, Mark.O);
		board.addMark(7, Mark.O);
		resultAnalyzer.isWinner();
		
		assertEquals(resultAnalyzer.getResult(), Result.PROGRESS);
	}
	@Test
	public void checkDrawCase(){
		board.addMark(0, Mark.O);
		board.addMark(1, Mark.O);
		board.addMark(2, Mark.X);
		board.addMark(3, Mark.X);
		board.addMark(4, Mark.O);
		board.addMark(5, Mark.O);
		board.addMark(6, Mark.O);
		board.addMark(7, Mark.X);
		board.addMark(8, Mark.X);

		resultAnalyzer.isWinner();
		assertEquals(Result.DRAW, resultAnalyzer.getResult());
	}
	
	

}
