package com.srm.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.logging.Logger;
class ArrayOperations {
	Logger log=Logger.getLogger(ArrayOperations.class.getName());
	void reverseArray(int[] arr) {
		log.info("Reversed Array : ");
		for (int i = arr.length - 1; i >= 0; i--) {
			log.info(arr[i] + "\t");
			log.info("\n");
		}
	}

	void intersectArrays(Integer[] arr1, Integer[] arr2) {
		HashSet<Integer> hs1 = new HashSet<>();
		hs1.addAll(Arrays.asList(arr1));
		hs1.retainAll(Arrays.asList(arr2));
		log.info("Array List 1 : " + Arrays.asList(arr1));
		log.info("Array List 2 : " + Arrays.asList(arr2));
		if (hs1.isEmpty()) {
			log.info("No Intersecting Elements present");
			log.info("\n");
		} else {
			log.info("Intersection Values :  " + hs1);
		}

	}

	void maxValue(int[] arr) {
		Arrays.sort(arr);
	}

	void reverseList(ArrayList<Integer> al) {
		Collections.reverse(al);
		log.info("Reversed List : " + al);
	}

	void sortByDescOrder(ArrayList<Integer> al) {
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0;i<al.size();i++)
		{
			log.info(al.get(i)+" ");
		}
	}
}


