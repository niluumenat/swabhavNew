package com.techlabs.board;

import com.techlabs.cell.Cell;
import com.techlabs.cell.Mark;

public class Board implements IBoard {
	private Cell[] cells;
	private boolean isFull = false;

	public Board() {
		this.cells = new Cell[9];
		initCell();
	}

	/* (non-Javadoc)
	 * @see com.techlabs.board.IBoard#initCell()
	 */
	@Override
	public void initCell() {
		for (int i = 0; i < 9; i++) {
			cells[i] = new Cell();
		}
	}

	/* (non-Javadoc)
	 * @see com.techlabs.board.IBoard#addMark(int, com.techlabs.cell.Mark)
	 */
	@Override
	public void addMark(int position, Mark mark) {
		if (position > 9 || position < 0) {
			throw new NotValidPositionException("Position is not valid");
		} else {
			cells[position].markCell(mark);
		}

	}

	/* (non-Javadoc)
	 * @see com.techlabs.board.IBoard#isFull()
	 */
	@Override
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

	/* (non-Javadoc)
	 * @see com.techlabs.board.IBoard#getCells()
	 */
	@Override
	public Cell[] getCells() {
		return cells;
	}

}
