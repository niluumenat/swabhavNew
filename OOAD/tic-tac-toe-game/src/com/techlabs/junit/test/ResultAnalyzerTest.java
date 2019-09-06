package com.techlabs.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.board.Board;
import com.techlabs.cell.Mark;
import com.techlabs.result.Result;
import com.techlabs.result.ResultAnalyzer;

public class ResultAnalyzerTest {
	ResultAnalyzer resultAnalyzer=new ResultAnalyzer();
	Board board =new Board();
	
	@Test
	public void checkResult() {
		board.addMark(0, Mark.O);
		board.addMark(1, Mark.O);
		board.addMark(2, Mark.X);
		board.addMark(3, Mark.X);
		board.addMark(4, Mark.O);
		board.addMark(5, Mark.O);
		board.addMark(6, Mark.O);
		board.addMark(7, Mark.X);
		board.addMark(8, Mark.X);
		
		board.getCells();
		resultAnalyzer.isWinner();
		
		assertEquals(Result.DRAW, resultAnalyzer.getResult());
		board.display();
		System.out.println(resultAnalyzer.getResult());
		
	}


	


	

}
