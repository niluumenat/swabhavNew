package com.techlabs.cell;


public class Cell {
	private Mark mark;

	public Cell() {
		this.mark = mark.EMPTY;
	}

	public void markCell(Mark c) {
		if (mark != mark.EMPTY) {
			throw new CellPositionNotEmptyException("Cell position is taken");
		} else {
			mark = c;
		}
	}

	public Mark getMark() {
		return mark;
	}

}
