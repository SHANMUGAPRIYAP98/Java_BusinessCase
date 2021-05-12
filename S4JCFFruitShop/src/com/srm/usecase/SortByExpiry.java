package com.srm.usecase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class SortByExpiry implements Comparator<GroceryDetails>{
	@Override
	public int compare(GroceryDetails o1, GroceryDetails o2) {
		Date d1 = new Date();
		Date d2 = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");
		try {
			d1=sdf.parse(o1.expiryDate);
			d2=sdf.parse(o2.expiryDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d1.compareTo(d2);
	
	}
	

}
