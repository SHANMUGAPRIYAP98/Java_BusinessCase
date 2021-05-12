package com.srm.lab2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

class MapOperations
{
	Logger log=Logger.getLogger(MapOperations.class.getName());
	HashMap<Integer, String> sortData(HashMap<Integer, String> hm)
	{
		if(hm.isEmpty())
		{
			log.info("HashMap has no Elements");
		}
		else
		{
			log.info("Sorted Values By Key : ");
		for(int i=1;i<=hm.size();i++)
		{
			log.info(hm.get(i));
		}
		}
		return hm;
	}
	void removeValueByKey(HashMap<Integer, String> hm,int key)
	{
		if(hm.isEmpty())
		{
			log.info("HashMap has no Elements");
		}
		else
		{
			log.info("Elements After Removing");
			log.info("Value to be Removed : ");
			log.info(hm.get(key)+" Removed ");
			for(int i=1;i<=hm.size();i++)
			{
				hm.remove(key);
				log.info(hm.get(i));
			}
		}
	}
	void getSetElements(HashSet<Object> hs)
	{
		log.info("Elements are : ");
		log.info(hs+"");
	}
}
public class MapAndSetOper {
	static Logger log=Logger.getLogger(MapAndSetOper.class.getName());
public static void main(String[] args)
{
  
	MapOperations mapOper=new MapOperations();
	log.info("Enter the Operation Number to be Performed : ");
	try (Scanner sc = new Scanner(System.in)) {
		int op=sc.nextInt();
		switch(op)
		{
		case 1:log.info("Enter the Number of Key & Values : ");
		       int size=sc.nextInt();
		       Map<Integer, String> m=new HashMap<>();
		       for(int i=0;i<size;i++)
		       {
		    	   log.info("Enter Key"+(i+1)+"\t"+"Enter Value"+(i+1));
		    	   m.put(sc.nextInt(), sc.next());
		       }
		       mapOper.sortData((HashMap<Integer, String>)m);
		       break;
		case 2:log.info("Enter the Number of Key & Values : ");
			    int num=sc.nextInt();
			    Map<Integer, String> m1=new HashMap<>();
			    for(int i=0;i<num;i++)
			    {
			 	   log.info("Enter Key"+(i+1)+"\t"+"Enter Value"+(i+1));
			 	   m1.put(sc.nextInt(), sc.next());
			    }
			    log.info("Enter the Key to be Removed : ");
			    int key=sc.nextInt();
			    mapOper.removeValueByKey((HashMap<Integer, String>) m1,key);
			    break;
		case 3:log.info("Enter the No.of.Set Elements : ");
		       int no=sc.nextInt();
		       Set<Object> s=new HashSet<>();
		       for(int i=0;i<no;i++)
		       {
		    	   log.info("Enter the Element "+(i+1));
		    	   s.add(sc.next());   
		       }
		       mapOper.getSetElements((HashSet<Object>) s);
		       break;
		       default : log.info("Invalid Option");
		       
		}
	}
}
}
