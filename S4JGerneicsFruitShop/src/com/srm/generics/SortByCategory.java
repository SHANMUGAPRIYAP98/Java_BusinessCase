package com.srm.generics;

import java.util.Comparator;

public class SortByCategory implements Comparator<Mango>{
	@Override
	public int compare(Mango o1, Mango o2) {
		
		return o1.getFruitCategory().compareTo(o2.getFruitCategory());
	}

}
