package com.srm.usecase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

public class FruitsDetailsOper {
	static Logger log=Logger.getLogger(FruitsDetailsOper.class.getName());
	public static void main(String[] args) {
		String fruitName;
		String fruitType;
		String distributorName;
		double fruitWeight;
		String fruitCategory;
		String location;
		String expiryDate;
		int quantity;
		double totalcost=0;
		Scanner sc=new Scanner(System.in);
		log.info("Enter the Number of Fruits Details to Add : ");
		int num=sc.nextInt();
		List<FruitDetails> list=new ArrayList<>();
		Map<Integer,FruitDetails> m=new HashMap<>();
		List<FruitDetails> l=new ArrayList<>();
		AddFruitDetails afd=new AddFruitDetails();
		for(int i=0;i<num;i++)
		{
			sc.nextLine();
			log.info("Enter the Fruit Name : ");
			fruitName=sc.nextLine();
			log.info("Enter the Fruit Type : ");
			fruitType=sc.nextLine();
			log.info("Enter the Distributor Name : ");
			distributorName=sc.nextLine();
			log.info("Enter the Fruit Weight : ");
			fruitWeight=sc.nextDouble();
			sc.nextLine();
			log.info("Enter the Fruit Category : ");
			fruitCategory=sc.nextLine();
			log.info("Enter the Location : ");
			location=sc.nextLine();
			log.info("Enter the Expiry Date : ");
			expiryDate=sc.nextLine();
			log.info("Enter the Quantity : ");
			quantity=sc.nextInt();	
			FruitDetails fd=new FruitDetails(fruitName, fruitType, distributorName, fruitWeight, fruitCategory, location, expiryDate, quantity, totalcost);
			totalcost=fd.costDetails(fruitName);
			m.put(i, fd);
			list.add(fd);
			l.add(fd);
		}
        afd.addFruits((HashMap) m);
		log.info("Enter the Distributor Name : ");
		Scanner sc1=new Scanner(System.in);
		distributorName=sc1.nextLine();
		afd.findByDistName((ArrayList)list,distributorName);
		log.info("Enter the Expiry  Date : ");
		expiryDate=sc1.nextLine();
		afd.findByExpiry((ArrayList<FruitDetails>) l, expiryDate);
	}

}
