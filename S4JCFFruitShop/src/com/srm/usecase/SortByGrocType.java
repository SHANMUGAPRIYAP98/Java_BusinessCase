package com.srm.usecase;

import java.util.Comparator;

public class SortByGrocType implements Comparator<GroceryDetails> {

	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		return o1.groceryType.compareTo(o2.groceryType);
	}

}
