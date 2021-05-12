package com.srm.telecom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
public class CustomerDetails {
	static Logger log = Logger.getLogger(CustomerDetails.class.getName());
	 
	boolean flag=true;
	String phone="9840512345";
	String baseCon1="Tanzania";
	String baseCon2="Uganda";
	String baseCon3="India";
	String baseCon4="South Africa";
	String addr="UAP Nakawa Business Park";
	String vas1="Docomo";
	String desc1="Prepaid";
	String desc2="Postpaid";
	Customer c1 = new Customer(1, "Kaviya", " E-1, Vivek Indl Estate, Walbhat Road, Goregaon( East)", baseCon3,phone, 299, true, 500, desc1, "Airtel", false);
	Customer c2 = new Customer(2, "Diyashri", "Liangmahe S Rd", baseCon1, phone, 299, true, 500, desc2, "BSNL",true);
	Customer c3 = new Customer(3, "Harsha", "2417 Loop St", baseCon4, phone, 299, true, 500,desc1, "Vodafone", true);
	Customer c4 = new Customer(4, "Akshayaa", addr, baseCon2, "6189234567", 299, true, 500,desc1,vas1, false);
	Customer c5 = new Customer(5, "Premila", "Zanzibar", baseCon1, phone, 299, true, 500, desc1,"Aircel", false);
	Customer c6 = new Customer(6, "Kavitha", "Plot 47 Bukoto Crescent, Naguru", baseCon2, phone, 299, true, 500,desc1, "Jio", false);
	Customer c7 = new Customer(7, "Rani", "Liangmahe S Rd",baseCon1, phone, 299, true, 500, desc2,"Idea", false);
	Customer c8 = new Customer(8, "Priya", "2471 Church St", baseCon4, phone, 299, true, 500, desc2,"Reliance", false);
	Customer c9 = new Customer(9, "Nagma", " N 14 A, Part 2, Lajpat Nagar", "Rwanda", phone, 299, true, 500,desc1, "Vodafone", true);
	Customer c10 = new Customer(10, "Sandhya", "Karma Stambha Complex, L B S Marg, Opp Mtnl Office, Tagore Nagar",baseCon3, "9805123451", 299, true, 500, desc1, "Airtel", false);
	Customer c11 = new Customer(11, "Kavitha", addr, baseCon2, "6289234567", 299, true, 500,desc1, vas1, false);
	Customer c12 = new Customer(12, "Rekha", addr, baseCon2, "6178899123", 299, false, 500,desc1, vas1, false);
	Customer c13 = new Customer(13, "Lakshmi", addr, baseCon2, "6189012345", 299, true, 500,desc1, vas1, false);
	Customer c14 = new Customer(14, "Krishni", addr, baseCon2, "6189012347", 299, true, 500,desc1, vas1, false);
	List<Customer> list = new ArrayList<>();
	List<Customer> addDetails() {
		List<Customer> l = new ArrayList<>();
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		l.add(c5);
		l.add(c6);
		l.add(c7);
		l.add(c8);
		l.add(c9);
		l.add(c10);
		l.add(c11);
		l.add(c12);
		l.add(c13);
		l.add(c14);
		return l;
	}

	void getDetails(ArrayList<Customer> al, int record) {
		for (int i = 0; i < record; i++) {
			log.info(al.get(i)+"\n");
		}
		
	}

	void searchByConTypeAndVAS(ArrayList<Customer> al) {
		List<Customer> l=al.stream().filter(cust -> cust.baseCntry.equals("Tanzania") && cust.description.equals(desc2)
				&& cust.isActive == !flag).map(cust -> cust).collect(Collectors.toList());
		for(int i=0;i<l.size();i++)
		{
			log.info(l.get(i)+"\n");
		}
	}

	void searchByConAndDescAndActive(ArrayList<Customer> al) {
		List<Customer> l=al.stream()
				.filter(cust -> (cust.baseCntry.equals(baseCon4) || cust.baseCntry.equals("Rwanda"))
						&& cust.description.equals(desc1) && cust.isActive == flag)
				.map(cust -> cust).collect(Collectors.toList());
		for(int i=0;i<l.size();i++)
		{
			log.info(l.get(i)+"\n");
		}
	}

	void findByCustId(ArrayList<Customer> al, int id) {
		List<Customer> l = al.stream().filter(c -> c.id == id).map(cust -> cust).collect(Collectors.toList());
		
		for(int i=0;i<l.size();i++)
		{
			if (!l.isEmpty()) {log.info(l.get(i)+"\n");
			} else {
				log.info("No Records Found"+"\n");
			}
		}
		
	}

	void findByPhoneConAndIs4g(ArrayList<Customer> al) {
		list = al.stream()
				.filter(cust -> cust.phoneNum.startsWith("61") && cust.baseCntry.equals("Uganda") && cust.is4g == flag)
				.map(cust -> cust).collect(Collectors.toList());
		for(int i=0;i<list.size();i++)
		{
			log.info(list.get(i)+"\n");
		}

	}

	void sortByNameAndPhone() {
		Collections.sort(list, new SortByNameAndPhoneNum());
		for(int i=0;i<list.size();i++)
		{
			log.info(list.get(i)+"\n");
		}
	}

	void printDetails(ArrayList<?> al) {
		for(int i=0;i<al.size();i++)
		{
			log.info(al.get(i)+"\n");
		}
	}

	void sortByCon(ArrayList<Customer> al) {
		Collections.sort(al, new SortByBaseCon());
		List<Customer> l=al.stream().filter(c -> !c.custName.startsWith("Ms")).map((Customer c)->{
			c.custName="Ms "+c.custName;
					return c;})
				.collect(Collectors.toList());
		for(int i=0;i<l.size();i++)
		{
			log.info(al.get(i)+"\n");
		}
		
		}
	void findByPhoneConAndConvName(ArrayList<Customer> al) {
		List<Customer> l = al.stream().filter(c -> c.phoneNum.startsWith("98") && c.baseCntry.equals("India")).collect(Collectors.toList());
		List<Customer> l1=l.stream().map((Customer cust)->{
			cust.custName=cust.custName.toUpperCase();
			return cust;
		}).sorted((cust1,cust2)->cust1.phoneNum.compareTo(cust2.phoneNum)).collect(Collectors.toList());
		for(int i=0;i<l1.size();i++)
		{
			log.info(l1.get(i)+"\n");
		}
		
	}
}
