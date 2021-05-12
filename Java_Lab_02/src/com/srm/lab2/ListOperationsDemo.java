package com.srm.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

class ListOperations
{
	Logger log=Logger.getLogger(ListOperations.class.getName());
	void linkedListToArrayList(LinkedList<Integer> l)
	{
		log.info(l.getClass().getTypeName());
		List<Integer> al=new  ArrayList<>();
		al.addAll(l);
		for(int i=0;i<al.size();i++)
		{
			log.info(al.get(i)+" ");
		}
		log.info(al.getClass().getTypeName());
	}
	void arrayListToStringArr(ArrayList<String> al)
	{
		String[] arr=new String[al.size()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= al.get(i);
		}
		log.info("String Arrays are : ");
		for(int i=0;i<arr.length;i++)
		{
			log.info(arr[i]+"\t");
			
		}
		log.info("\n");
	}
	void convertArrToArrayList(int[] arr)
	{
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			l.add(arr[i]);
		}
		log.info("ArrayList Elements are : ");
	    for(int i=0;i<l.size();i++)
	    {
	    	log.info(l.get(i)+"\t");
	    }
	}
	void sortDescArrayList(ArrayList<Integer> al)
	{
		Collections.sort(al);
		Collections.reverse(al);
		for(int i=0;i<al.size();i++)
		{
			log.info(al.get(i)+" ");
		}
	}
}


public class ListOperationsDemo {
	static Logger log=Logger.getLogger(ListOperationsDemo.class.getName());
	public static void main(String[] args) {
		ListOperations listOper=new ListOperations();
		List<Integer> l=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		log.info("Enter the Size : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			l.add(sc.nextInt());
		}
		listOper.linkedListToArrayList((LinkedList) l);
		log.info("Enter the Size : ");
		int num=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<num;i++)
		{
			list.add(sc.nextInt());
		}
		listOper.arrayListToStringArr((ArrayList) list);
		log.info("Enter the Size of the Array : ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			log.info("Enter the Element "+(i+1));
			arr[i]=sc.nextInt();
		}
		listOper.convertArrToArrayList(arr);
		log.info("Enter the Size of the Array : ");
		int limit=sc.nextInt();
		List<Integer> li=new ArrayList<>();
		for(int i=0;i<limit;i++)
		{
			li.add(sc.nextInt());
		}
		listOper.sortDescArrayList((ArrayList<Integer>)li);
	}

}
