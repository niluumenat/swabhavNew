package com.techlabs.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.cell.Cell;
import com.techlabs.cell.CellPositionNotEmptyException;
import com.techlabs.cell.Mark;

public class CellTest {
	Cell cell = new Cell();

	@Test
	public void checkIsEmpty() {
		
		//cell.markCell(Mark.O);
		Mark mark=cell.getMark();
		assertEquals(Mark.EMPTY, mark);

	}

	@Test(expected=CellPositionNotEmptyException.class)
	public void testFilledPosition() {
		cell.markCell(Mark.X);
		cell.markCell(Mark.O);
		Mark mark=cell.getMark();
		try {
			assertEquals(Mark.O, mark);
		} catch (CellPositionNotEmptyException e) {
			System.out.println("Cell Position is filled");
		}
	}

}
