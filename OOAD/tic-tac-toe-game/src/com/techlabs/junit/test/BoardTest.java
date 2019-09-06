package com.techlabs.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.board.Board;
import com.techlabs.board.NotValidPositionException;
import com.techlabs.cell.Mark;

public class BoardTest {
	Board board = new Board();

	@Test
	public void checkCellPosition() {
		board.addMark(0, Mark.O);
		assertEquals(Mark.O, board.getCells()[0].getMark());
		board.addMark(3, Mark.O);
		assertEquals(Mark.O,board.getCells()[3].getMark() );
		board.addMark(6, Mark.O);
		assertEquals(Mark.O, board.getCells()[6].getMark());
		board.addMark(1, Mark.X);
		board.addMark(2, Mark.X);
		board.addMark(4, Mark.O);
		board.addMark(5, Mark.X);
		board.addMark(7, Mark.O);
		board.addMark(8, Mark.X);
		System.out.println(board.isFull());
		board.display();
		

	}
	@Test(expected=NotValidPositionException.class)
	public void checkValidPosition(){
		board.addMark(10, Mark.O);
		assertEquals(Mark.X, board.getCells()[10].getMark());
	}

}
