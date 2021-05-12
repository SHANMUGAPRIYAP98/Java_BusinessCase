package com.srm.generics;
import java.util.Map;
import java.util.logging.Logger;

public class MangoVariety {
    Logger log=Logger.getLogger(MangoVariety.class.getName());
	public Map<Integer,? extends Mango> addMangoVarierty(Map<Integer,? extends Mango> hm)
	{
		return hm;
	}
	public void getDetails(Map<Integer,? extends Mango> hm)
	{
		log.info(hm+"\n");
		
	}
	
	
	
	
}
