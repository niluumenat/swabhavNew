package com.techlabs.cell;

import java.util.Arrays;

public class Cell {
	private Mark cell;

	public Cell() {
		super();
		this.cell = cell.Empty;
	}

	public Mark markCell(Mark c) {
		if (cell != cell.Empty) {
			System.out.println("cell is not empty");
		}else{
			cell=c;
		}
		return cell;

	}

}
