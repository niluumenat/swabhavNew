package com.techlabs.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.cell.Cell;
import com.techlabs.cell.Mark;

public class CellTest {
	Cell cell=new Cell();
	
	@Test
	public void checkIsEmpty(){
		Mark cell1=cell.markCell(Mark.O);
		assertEquals(cell1, cell);
	}
	
	
	

}
