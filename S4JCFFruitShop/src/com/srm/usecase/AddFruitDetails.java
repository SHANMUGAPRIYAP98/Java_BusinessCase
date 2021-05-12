package com.srm.usecase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Logger;

public class AddFruitDetails {
Logger log=Logger.getLogger(AddFruitDetails.class.getName());
void addFruits(HashMap<Integer,FruitDetails> hm)
{
	for(int i=0;i<hm.size();i++)
	{
		log.info(hm.get(i)+"\n");
	}
	
}
void findByDistName(ArrayList<FruitDetails> al,String distName)
{
	 Iterator<FruitDetails> iterator = al.iterator();
	    while (iterator.hasNext()) {
	        FruitDetails fd = iterator.next();
	        if(fd.distributorName.equals(distName))
	        {
	        	log.fine(" "+fd);
	        }
	    }    
}
void findByExpiry(ArrayList<FruitDetails> al,String expiry)
{
	for(FruitDetails fd:al)
	{
		if(fd.expiryDate.equals(expiry))
		{
			log.info(fd+"\n");
		}
	}	
}
}
