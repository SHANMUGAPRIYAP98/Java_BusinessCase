package com.srm.usecase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class SortByCostAndExpiry implements Comparator<GroceryDetails> {
	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		String s1=String.valueOf(o1.finalCost);
		String s2=String.valueOf(o2.finalCost);
		Date d1 = new Date();
		Date d2 = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
		try {
			d1=sdf.parse(o1.expiryDate);
			d2=sdf.parse(o2.expiryDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if(s1.compareTo(s2)==0)
		{
			return d1.compareTo(d2);
		}
		else
		{
			return s1.compareTo(s2);
		}
	}

}
