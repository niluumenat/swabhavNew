package com.techlabs.board;

import com.techlabs.cell.Cell;
import com.techlabs.cell.Mark;

public class Board  {
	private Cell[] cells;
	private boolean isFull = false;

	public Board() {
		this.cells = new Cell[9];
		initCell();
	}

	public void initCell() {
		for (int i = 0; i < 9; i++) {
			cells[i] = new Cell();
		}
	}


	public void addMark(int position, Mark mark) {
		if (position > 9 || position < 0) {
			throw new NotValidPositionException("Position is not valid");
		} else {
			cells[position].markCell(mark);
		}

	}

	
	public boolean isFull() {

		for (int i = 0; i < 9; i++) {
			if (cells[i].getMark() != Mark.EMPTY) {
				isFull = true;
			} else {
				isFull = false;
				break;
			}
		}

		return isFull;

	}

	public void display() {
		Cell[] cells = getCells();

		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0)
				System.out.println();

			if (cells[i].getMark() == Mark.EMPTY) {
				System.out.print(i + " | ");
			} else {
				System.out.print(cells[i].getMark() + " | ");
			}

		}
	}


	public Cell[] getCells() {
		return cells;
	}

}
