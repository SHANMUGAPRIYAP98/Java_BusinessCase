package com.srm.usecase;

import java.util.Comparator;

public class SortByDnameAndGrocType implements Comparator<GroceryDetails> {

	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		if(o1.sellerName.compareTo(o2.sellerName)==0)
		{
			return o1.groceryType.compareTo(o2.groceryType);
		}
		else
		{
			return o1.sellerName.compareTo(o2.sellerName);
		}
	}

}
