package com.srm.telecom;

import java.util.Comparator;

public class SortByBaseCon implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.baseCntry.compareTo(o2.baseCntry);
	}

}
