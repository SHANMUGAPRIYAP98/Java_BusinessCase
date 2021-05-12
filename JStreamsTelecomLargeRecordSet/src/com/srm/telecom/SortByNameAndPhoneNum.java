package com.srm.telecom;

import java.util.Comparator;

public class SortByNameAndPhoneNum implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.custName.compareTo(o2.custName)==0)
		{
			return o1.phoneNum.compareTo(o2.phoneNum);
		}
		else
		{
			return o1.custName.compareTo(o2.custName);
		}
	}

}
