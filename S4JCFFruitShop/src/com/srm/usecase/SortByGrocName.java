package com.srm.usecase;

import java.util.Comparator;

public class SortByGrocName implements Comparator<GroceryDetails> {

	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		return o1.groceryName.compareTo(o2.groceryName);
	}

	

}
