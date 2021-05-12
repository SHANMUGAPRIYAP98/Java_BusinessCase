package com.srm.usecase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;
public class AddGroceryDetails  {
	static Logger log=Logger.getLogger(AddGroceryDetails.class.getName());
void addGroceryStock(ArrayList<GroceryDetails> al)
{
	log.info("GROCERY DETAILS");
	for(int i=0;i<al.size();i++)
	{
		log.info(al.get(i)+"\n");	
	}
}
void sortGroceryName(ArrayList<GroceryDetails> al)
{
	log.info("SORT BY GROCERY NAME");
	Collections.sort(al,new SortByGrocName());
	for(int i=0;i<al.size();i++)
	{
		log.info(al.get(i)+"\n");	
	}
}
void sortByExpiryAndGrocType(ArrayList<GroceryDetails> al)
{
	log.info("SORT BY EXPIRY DATE and GROCERY TYPE");
	Collections.sort(al,new SortByExpiry().thenComparing(new SortByGrocType()));
	for(int i=0;i<al.size();i++)
	{
		log.info(al.get(i)+"\n");
	}
}
void sortByCostAndExpiry(ArrayList<GroceryDetails> al)
{
	log.info("SORT BY COST and EXPIRY DATE");
	Collections.sort(al,new SortByCostAndExpiry());
	log.info("\n");
	for(int i=0;i<al.size();i++)
	{
		log.info(al.get(i)+"\n");
	}
}
void sortByGrocTypeAndWeight(ArrayList<GroceryDetails> al)
{
	log.info("SORT BY GROCERY TYPE and GROCERY WEIGHT");
	Collections.sort(al,new SortByGrocTypeAndWeight());
	for(int i=0;i<al.size();i++)
	{
		log.info(al.get(i)+"\n");
	}
}
void sortByDisAndGrocType(ArrayList<GroceryDetails> al)
{
	log.info("SORT BY SELLER NAME and GROCERY TYPE");
	Collections.sort(al,new SortByDnameAndGrocType());
	for(int i=0;i<al.size();i++)
	{
		log.info(al.get(i)+"\n");
	}
}
}
