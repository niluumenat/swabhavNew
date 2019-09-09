package com.techlabs.board;

import com.techlabs.cell.Cell;
import com.techlabs.cell.Mark;

public interface IBoard {

	void initCell();

	void addMark(int position, Mark mark);

	boolean isFull();

	Cell[] getCells();

}