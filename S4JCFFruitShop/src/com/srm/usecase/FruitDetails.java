package com.srm.usecase;

import java.io.Serializable;
import java.util.logging.Logger;

public class FruitDetails implements BaseModel,Serializable {
Logger log=Logger.getLogger(FruitDetails.class.getName());
String fruitName;
String fruitType;
String distributorName;
double fruitWeight;
String fruitCategory;
String location;
String expiryDate;
int quantity;
double cost;
double totalcost;

FruitDetails(String fruitName,String fruitType,String distributorName,double fruitWeight,String fruitCategory,
		String location,String expiryDate,int quantity,double totalcost)
{
	this.fruitName=fruitName;
	this.fruitType=fruitType;
	this.distributorName=distributorName;
	this.fruitWeight=fruitWeight;
	this.fruitCategory=fruitCategory;
	this.location=location;
	this.expiryDate=expiryDate;
	this.quantity=quantity;
	this.totalcost=totalcost;
}
public double costDetails(String fruitName)
{
switch(fruitName)
{
case "apple":cost=120;
			 totalcost=quantity*cost;
			 break;
case "pomegranate":cost=180;
totalcost=quantity*cost;
break;
case "banana":cost=50;
totalcost=quantity*cost;
break;
case "guava":cost=100;
totalcost=quantity*cost;
break;
case "grapes":cost=90;
totalcost=quantity*cost;
break;
case "strawberry":cost=200;
totalcost=quantity*cost;
break;
case "kiwi":cost=250;
totalcost=quantity*cost;
break;
case "mango":cost=105;
totalcost=quantity*cost;
break;
case "watermelon":cost=70;
totalcost=quantity*cost;
break;
case "muskmelon":cost=150;
totalcost=quantity*cost;
break;
default:log.info("Invalid Data");
}
return totalcost;
}

@Override
public String toString() {
	return "FruitDetails [fruitName=" + fruitName + ", fruitType=" + fruitType + ", distributorName=" + distributorName
			+ ", fruitWeight=" + fruitWeight + ", fruitCategory=" + fruitCategory + ", location=" + location
			+ ", expiryDate=" + expiryDate + ", quantity=" + quantity + ", totalcost=" + totalcost
			+ "]";
}

























}