package com.techlabs.lineitem.set;

import java.util.Comparator;

import com.techlabs.lineitem.LineItem;

public class SortByCostComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem o1, LineItem o2) {
		return o1.getCost().compareTo(o2.getCost());
		
	}

}
