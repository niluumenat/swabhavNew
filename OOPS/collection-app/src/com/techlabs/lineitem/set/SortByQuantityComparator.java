package com.techlabs.lineitem.set;

import java.util.Comparator;

import com.techlabs.lineitem.LineItem;

public class SortByQuantityComparator implements Comparator<LineItem> {

	@Override
	public int compare(LineItem o1, LineItem o2) {
		int quantity1=o1.getQuantity();
		int quantity2=o2.getQuantity();
		int result=0;
		if(quantity1==quantity2){
			result=0;
		}else if(quantity1>=quantity2){
			result=1;
		}else if(quantity1<=quantity2){
			result=-1;
		}
		return result;
		
		
		
	}

}
