package com.srm.reportcase;

import java.util.Scanner;
import java.util.logging.Logger;

public class ConsoleReport {
	static Logger log=Logger.getLogger(ConsoleReport.class.getName());
	void generateReport()
	{
		int id=0;
		String category="";
		String desc="";	
		Scanner sc=new Scanner(System.in);
		int quantity;
		float costPerItem;
		double cost;
		double totalCost=0;
		double grandTotal=0;
		double cgst;
		double sgst;
		log.info("Enter the No.of.Items : ");
     	int numItems=sc.nextInt();
		ProductDetails[] prodDetails=new ProductDetails[numItems];
		for(int i=0;i<numItems;i++)
		{
	        sc.nextLine();
			log.info("Enter the Category : ");
			category=sc.nextLine();
			log.info("Enter the Description : ");
			desc=sc.nextLine();
			log.info("Enter the Quantity :  ");
			quantity=sc.nextInt();
			log.info("Enter the Cost Per Item :  ");
			costPerItem=sc.nextFloat();
			prodDetails[i]=new ProductDetails(category, desc, quantity, costPerItem);
			cost=prodDetails[i].calcCost();
			totalCost+=cost;	
		}
		cgst=totalCost*0.06f;
		sgst=totalCost*0.06f;
		grandTotal=totalCost+cgst+sgst;
		ProductDetails pd=new ProductDetails();
		String line="===========================================================================================";
	log.info(line);
	log.entering("%50s",pd.shopName);
	log.info("\n");
	log.info(line);
	log.entering("%60s",pd.address);
	log.info("\n");
	log.info(line);
	log.entering("%5s","Customer ID :");
	System.out.printf("%5s",pd.custId);
	log.info("\n");
	System.out.printf("%5s","Date :");
	System.out.printf("%5s",pd.date);
	log.info("\n");
	log.info(line);
	String format = "|%1$-5s|%2$-15s|%3$-20s|%4$-10s|%5$-20s\n";
    System.out.format(format, "ID", "CATEGORY", "DESCRIPTION","COUNT","COST");
    log.info(line);
	for(int i=0;i<numItems;i++)
	{
		id=id+1;
		String fmt = "|%1$-5s|%2$-15s|%3$-20s|%4$-10s|%5$-20s\n";
	    System.out.format(fmt,id,prodDetails[i].category,prodDetails[i].desc,prodDetails[i].quantity,prodDetails[i].cost);
	}
	
	log.info(line);
	String fmt = "|%1$60s|%2$5s\n";
	System.out.format(fmt,"TOTAL",String.format("%.2f",totalCost));
	System.out.format(fmt,"C GST(6%)",String.format("%.2f",cgst));
	System.out.format(fmt,"S GST(6%)",String.format("%.2f",sgst));
	log.info(line);
	System.out.format(fmt,"GRAND TOTAL",String.format("%.2f",grandTotal));
	log.info(line);

}
}

