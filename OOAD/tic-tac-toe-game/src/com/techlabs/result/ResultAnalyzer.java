package com.techlabs.result;

import com.techlabs.board.Board;
import com.techlabs.cell.Cell;
import com.techlabs.cell.Mark;

public class ResultAnalyzer implements IResultAnalyzer {
	private Board board;
	private Result result;

	public ResultAnalyzer() {
		this.board = new Board();
		this.result = result.PROGRESS;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.result.IResultAnalyzer#isWinner()
	 */
	@Override
	public void isWinner() {
		for (int i = 0; i < 9; i++) {
			Cell[] cells = board.getCells();
			if (cells[0].getMark() != Mark.EMPTY && cells[0].getMark() == cells[2].getMark()
					&& cells[0].getMark() == cells[1].getMark())
				result = result.WIN;
			if (cells[0].getMark() != Mark.EMPTY && cells[0].getMark() == cells[3].getMark()
					&& cells[0].getMark() == cells[6].getMark())
				result = result.WIN;
			if (cells[1].getMark() != Mark.EMPTY && cells[1].getMark() == cells[4].getMark()
					&& cells[1].getMark() == cells[7].getMark())
				result = result.WIN;
			if (cells[2].getMark() != Mark.EMPTY && cells[2].getMark() == cells[5].getMark()
					&& cells[2].getMark() == cells[8].getMark())
				result = result.WIN;
			if (cells[3].getMark() != Mark.EMPTY && cells[3].getMark() == cells[4].getMark()
					&& cells[3].getMark() == cells[7].getMark())
				result = result.WIN;
			if (cells[6].getMark() != Mark.EMPTY && cells[6].getMark() == cells[7].getMark()
					&& cells[6].getMark() == cells[8].getMark())
				result = result.WIN;
			if (cells[0].getMark() == cells[4].getMark() && cells[0].getMark() == cells[8].getMark()
					&& cells[0].getMark() != Mark.EMPTY)
				result = result.WIN;
			if (cells[2].getMark() == cells[4].getMark() && cells[2].getMark() == cells[6].getMark()
					&& cells[2].getMark() != Mark.EMPTY)
				result = result.WIN;

			if (board.isFull() == true )
				result = result.DRAW;

		}
	}

	/* (non-Javadoc)
	 * @see com.techlabs.result.IResultAnalyzer#getResult()
	 */
	@Override
	public Result getResult() {
		return result;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.result.IResultAnalyzer#getBoard()
	 */
	@Override
	public Board getBoard() {
		return board;
	}
	

}
