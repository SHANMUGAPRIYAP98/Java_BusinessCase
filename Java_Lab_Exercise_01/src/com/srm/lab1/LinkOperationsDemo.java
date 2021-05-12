package com.srm.lab1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

class LinkOper {
	Logger log=Logger.getLogger(LinkOper.class.getName());
	void findLength(LinkedList<Integer> l) {
		log.info("Length of the Linked List : " + l.size());
	}

	void sortLinkedList(LinkedList<Integer> l) {
		log.info("List Before Sorting : ");
		for(int i=0;i<l.size();i++)
		{
			log.info(l.get(i)+"");
		}
		log.info("\n");
		Collections.sort(l);
		log.info("List After Sorting : ");
		for(int i=0;i<l.size();i++)
		{
			log.info(l.get(i)+"\n");
		}
	}

	void findMidElement(LinkedList<Integer> list) {
		int length = list.size();

		int round = 0;
		if (length % 2 != 0) {
			round = length / 2;
			log.info("Length of the Elements : " + length);
			Collections.sort(list);
			log.info("Middle Element in the List : " + list.get(round));
		} else {
			int r1 = length / 2;
			int r2 = (length / 2) + 1;
			Collections.sort(list);
			int val1 = list.get(r1);
			int val2 = list.get(r2);
			int fval = (val1 + val2) / 2;
			log.info("Middle Element in the List : " + fval);
		}
	}
}

public class LinkOperationsDemo {
	static Logger log=Logger.getLogger(LinkOperationsDemo.class.getName());
	public static void main(String[] args) {
		LinkOper lo = new LinkOper();
		String dt="Enter the Element ";
		log.info("-----------LinkedList Operations-----------");
		log.info("1.Length of the Linked List" + "\n2.Sort the Linked List"
				+ "\n3.To find Middle Element in Linked List");
		
		try (Scanner sc = new Scanner(System.in)) {
			log.info("Enter the Operation to be Performed :  ");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				log.info("Enter the No.of.Elements : ");
				List<Integer> l = new LinkedList<>();
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
					log.info(dt+ (i + 1));
					l.add(sc.nextInt());
				}
				lo.findLength((LinkedList<Integer>) l);
				break;
			case 2:
				log.info("Enter the No.of.Elements to Add : ");
				int no = sc.nextInt();
				List<Integer> list = new LinkedList<>();
				for (int i = 0; i < no; i++) {
					log.info(dt+ (i + 1));
					list.add(sc.nextInt());
				}
				lo.sortLinkedList((LinkedList<Integer>) list);
				break;
			case 3:
				log.info("Enter the No.of.Elements to Add : ");
				int num = sc.nextInt();
				List<Integer> list1 = new LinkedList<>();
				for (int i = 0; i < num; i++) {
					log.info(dt + (i + 1));
					list1.add(sc.nextInt());
				}
				lo.findMidElement((LinkedList<Integer>) list1);
				break;
			default:
				log.info("Operation Number doesn't Match");
			}
		}
	}
}
