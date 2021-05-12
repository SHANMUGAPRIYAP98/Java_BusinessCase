package com.srm.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
public class ArrayOperationDemo {
    static Logger log = Logger.getLogger(ArrayOperationDemo.class.getName());
	public static void main(String[] args) {
		ArrayOperations arrOp = new ArrayOperations();
		Scanner sc = new Scanner(System.in);
		log.info("Enter the No.of.Array Operations to be Performed : ");
		int num = sc.nextInt();
		String prompt1="Enter the Element ";
		log.info("Array Operations");
		log.info("-----------------");
		for (int k = 1; k <= num; k++) {
			log.info("Enter the Operation Number : ");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				log.info("Enter the size of the Array : ");
				int n = sc.nextInt();
				int[] arr = new int[n];
				for (int i = 0; i < arr.length; i++) {
					log.info("Enter Element " + (i + 1));
					arr[i] = sc.nextInt();
				}
				arrOp.reverseArray(arr);
				break;
			case 2:
				log.info("Enter the No.of.Elements in the First Array : ");
				int n1 = sc.nextInt();
				Integer[] arr1 = new Integer[n1];
				for (int i = 0; i < n1; i++) {
					log.info( prompt1+ (i + 1));
					arr1[i] = sc.nextInt();
				}
				log.info("Enter the No.of.Elements in the Second Array : ");
				int n2 = sc.nextInt();
				Integer[] arr2 = new Integer[n2];
				for (int i = 0; i < n2; i++) {
					log.info(prompt1 + (i + 1));
					arr2[i] = sc.nextInt();
				}
				arrOp.intersectArrays(arr1, arr2);
				break;
			case 3:
				log.info("Enter the No.of.Elements in the Array : ");
				int n3 = sc.nextInt();
				int[] arr3 = new int[n3];
				for (int i = 0; i < n3; i++) {
					log.info(prompt1 + (i + 1));
					arr3[i] = sc.nextInt();
				}
				arrOp.maxValue(arr3);
				log.info("Sorted Values : ");
				for (int i = 0; i < arr3.length; i++) {
					log.info(arr3[i] + "\t");
				}
				log.info("\n");
				log.info("Maximum Value : " + arr3[arr3.length - 1]);
				break;
			case 4:
				List<Integer> al = new ArrayList<>();
				log.info("Enter the Size : ");
				int size = sc.nextInt();
				for (int i = 0; i < size; i++) {
					al.add(sc.nextInt());
				}
				log.info("Array Elements : " + al);
				arrOp.reverseList((ArrayList<Integer>) al);
				break;
			case 5:
				log.info("Enter the No.of.Elements to be Added : ");
				int s = sc.nextInt();
				List<Integer> list = new ArrayList<>();
				for (int i = 0; i < s; i++) {
					log.info("Enter the ArrayList Element" + (i + 1));
					list.add(sc.nextInt());
				}
				arrOp.sortByDescOrder((ArrayList) list);
				break;
			default:
				log.info("Invalid Operation");
			}
		}


	}

}
