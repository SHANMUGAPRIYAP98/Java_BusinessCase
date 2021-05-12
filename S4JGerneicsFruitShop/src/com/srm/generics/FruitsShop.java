package com.srm.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;
public class FruitsShop {
	static Logger log=Logger.getLogger(FruitsShop.class.getName());
	public static void main(String[] args) {
		String fruitName="";
		String fruitType="";
		String distributorName="";
		double fruitWeight=0;
		String fruitCategory="";
		String location="";
		String expiryDate="";
		int quantity=0;
		double cost=0;
		Scanner sc=new Scanner(System.in);
		log.info("Enter the Number of Fruits Details to Add : ");
		int num=sc.nextInt();
		HashMap<Integer,Alphonso> hm1=new HashMap<>();
		HashMap<Integer,Kesar> hm2=new HashMap<>();
		HashMap<Integer,Mulgoba> hm3=new HashMap<>();
		Map map=new HashMap<>();
		MangoVariety mv=new MangoVariety();
		for(int i=1;i<=num;i++)
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
			log.info("Enter the Cost : ");
			cost=sc.nextDouble();	
			if(i==1)
			{
				hm1.put(i,new Alphonso(fruitName, fruitType, distributorName, fruitWeight, fruitCategory, location, expiryDate, quantity, cost,cost*quantity));
				map.put(1,hm1);
			}
			else if(i==2)
			{
				hm2.put(i,new Kesar(fruitName, fruitType, distributorName, fruitWeight, fruitCategory, location, expiryDate, quantity, cost,cost*quantity));
				map.put(2,hm2);
			}
			else
			{
				hm3.put(i,new Mulgoba(fruitName, fruitType, distributorName, fruitWeight, fruitCategory, location, expiryDate, quantity, cost,cost*quantity));
				map.put(3,hm3);
			}
		}	
		mv.addMangoVarierty(hm1);
		mv.addMangoVarierty(hm2);
		mv.addMangoVarierty(hm3);
        mv.getDetails(map);
		
}
}
