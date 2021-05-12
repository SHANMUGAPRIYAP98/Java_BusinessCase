package com.srm.usecase;
public class GroceryDetails {
String groceryName;
public GroceryDetails(String groceryName, String groceryType, String sellerName, double groceryWeight,
		String groceryCategory, String expiryDate, double costPerPacket, int quantity, 
		double finalCost) {
	super();
	this.groceryName = groceryName;
	this.groceryType = groceryType;
	this.sellerName = sellerName;
	this.groceryWeight = groceryWeight;
	this.groceryCategory = groceryCategory;
	this.expiryDate = expiryDate;
	this.costPerPacket = costPerPacket;
	this.quantity = quantity;
	this.finalCost = finalCost;
}
String groceryType;
String sellerName;
double groceryWeight;
String groceryCategory;
String expiryDate;
double costPerPacket;
int quantity;
double finalCost;
@Override
public String toString() {
	return "GroceryDetails [groceryName=" + groceryName + ", groceryType=" + groceryType + ", sellerName=" + sellerName
			+ ", groceryWeight=" + groceryWeight + ", groceryCategory=" + groceryCategory + ", expiryDate=" + expiryDate
			+ ", costPerPacket=" + costPerPacket + ", quantity=" + quantity + ", finalCost=" + finalCost + "]";
}

}
