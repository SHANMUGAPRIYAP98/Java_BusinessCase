package com.srm.usecase;

import java.util.Comparator;

public class SortByGrocTypeAndWeight implements Comparator<GroceryDetails>{

	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
	if(o1.groceryType.compareTo(o2.groceryType)==0)
	{
		return String.valueOf(o1.groceryWeight).compareTo(String.valueOf(o2.groceryWeight));
	}
	else
	{
		return o1.groceryType.compareTo(o2.groceryType);
	}
	}

}
