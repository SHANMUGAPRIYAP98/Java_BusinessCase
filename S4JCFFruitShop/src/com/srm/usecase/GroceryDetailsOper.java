package com.srm.usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class GroceryDetailsOper {
	static Logger log=Logger.getLogger(GroceryDetailsOper.class.getName());
	public static void main(String[] args) {	
		String groceryName;
		String groceryType;
		String sellerName;
		double groceryWeight;
		String groceryCategory;
		String expiryDate;
		double costPerPacket;
		int quantity;
		log.info("Enter the No.of.Grocery Items to Add : ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		List<GroceryDetails> l=new ArrayList<>();
		AddGroceryDetails agd=new AddGroceryDetails();
		for(int i=0;i<size;i++)
		{
			sc.nextLine();
			log.info("Enter the Grocery Name : ");
			groceryName=sc.nextLine();
			log.info("Enter the Grocery Type : ");
			groceryType=sc.nextLine();
			log.info("Enter the Seller Name : ");
			sellerName=sc.nextLine();
			log.info("Enter the Grocery Weight : ");
			groceryWeight=sc.nextDouble();
			sc.nextLine();
			log.info("Enter the Grocery Category : ");
			groceryCategory=sc.nextLine();
			log.info("Enter the Expiry Date : ");
			expiryDate=sc.nextLine();
			log.info("Enter the Cost Per Packet : ");
			costPerPacket=sc.nextDouble();
			log.info("Enter the Quantity : ");
			quantity=sc.nextInt();
			l.add(new GroceryDetails(groceryName, groceryType, sellerName, groceryWeight, groceryCategory, expiryDate, costPerPacket, quantity, costPerPacket*quantity));
		}
		agd.addGroceryStock((ArrayList) l);
		log.info("\n");
	    agd.sortGroceryName((ArrayList) l);
	    log.info("\n");
	    agd.sortByExpiryAndGrocType((ArrayList) l);
	    log.info("\n");
	    agd.sortByCostAndExpiry((ArrayList)l);
	    log.info("\n");
		agd.sortByGrocTypeAndWeight((ArrayList) l);
		log.info("\n");
		agd.sortByDisAndGrocType((ArrayList) l);
		
	
}
}  
	


