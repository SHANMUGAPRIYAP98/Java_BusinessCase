package com.srm.telecom;
public class Customer {
int id;
String custName;
String address;
String baseCntry;
String phoneNum;
int avlCredits;
boolean is4g;
double billAmt;
String description;
String vas;
boolean isActive;
public Customer(int id, String custName, String address, String baseCntry, String phoneNum, int avlCredits,
		boolean is4g, double billAmt, String description, String vas, boolean isActive) {
	super();
	this.id = id;
	this.custName = custName;
	this.address = address;
	this.baseCntry = baseCntry;
	this.phoneNum = phoneNum;
	this.avlCredits = avlCredits;
	this.is4g = is4g;
	this.billAmt = billAmt;
	this.description = description;
	this.vas = vas;
	this.isActive = isActive;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", custName=" + custName + ", address=" + address + ", baseCntry=" + baseCntry
			+ ", phoneNum=" + phoneNum + ", avlCredits=" + avlCredits + ", is4g=" + is4g + ", billAmt=" + billAmt
			+ ", description=" + description + ", vas=" + vas + ", isActive=" + isActive + "]";
}


}
