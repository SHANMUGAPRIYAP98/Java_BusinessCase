package com.srm.reportcase;

import java.util.Calendar;
public class ProductDetails implements BaseModel {
	int max=50000;
	int min=10000;
	int id;
	String category;
	String desc;
	int custId=(int)(Math.random()*(max-min+1)+min);
	String shopName="DIYASHRI E-MART";
	String address="No.123 Muthamizh Nagar Kodungaiyur";
	Calendar c=Calendar.getInstance();
	int day=c.get(Calendar.DATE);
	int mon=c.get(Calendar.MONTH)+1;
	int year=c.get(Calendar.YEAR);
	String date=day+"-"+mon+"-"+year;
	int quantity;
	float costPerItem;
	double cost;
	double totalCost;
	double grandTotal;
	public ProductDetails(String category,String desc,int quantity, float costPerItem) {
		super();
		this.category=category;
		this.desc=desc;
		this.quantity = quantity;
		this.costPerItem = costPerItem;
	}
	public ProductDetails()
	{
		
	}
	double calcCost()
	{
		cost=costPerItem*quantity;
		return cost;
		
	}
}
