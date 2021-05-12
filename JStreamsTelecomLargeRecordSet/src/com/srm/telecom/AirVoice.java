package com.srm.telecom;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class AirVoice {
	static Logger log = Logger.getLogger(AirVoice.class.getName());
	public static void main(String[] args)  {
		CustomerDetails cd=new CustomerDetails();
		int id;
		log.info("\t\t\tCOLLECTIONS and STREAMS API FUNCTIONALITY"+"\n");
		log.info("1.Query 10 Phone Records"+"\n2.Query and Fetch first 50 Phone Records , and iterate & display the results in the console"+"\n3.Find all the records where the Customer is from �Tanzania� and has Postpaid connection with\r\n"
				+ "no VAS enabled"+"\n4.Find all the records where the Customer is from �South Africa� & �Rwanda� and has Prepaid\r\n"
						+ "connection with atleast one VAS enabled"+"\n5."
								+ "Perform Sorting Operations as follows\r\n"
								+ "1. Find all phones that starts with �61*�\r\n"
								+ "2. And Customer�s base country should be �Uganda�\r\n"
								+ "3. And 4g Activated"
								+"\n6.Sort the #5, based on customer name & Phone Number"+"\n7.Query and return a matching customer based on Customer ID"+"\n8.Return a Null Object if the above operation #7 return no matching records."+"\n9.Print the content of the collection details in one single line"
								+"\n10.Sort the Collections based on Customer case cntry, and add salutations to the customer name "
								+ "if not found, and remove first 2 elements in the collection and prefix +789 to all phone"
								+ "numbers"
								+ "and after doing all the operations, iterate & print the details in the console."+"\n11.Perform Sorting Operations as follows\r\n"
										+ "4. Find all phones that starts with 98*\n"
										+ "5. And Customer�s base country should be India\n"
		
										+ "6. And convert all Customer's name to uppercase\n");
		
		
		for(int i=0;i<1;i++)
		{
		Scanner sc=new Scanner(System.in);
		log.info("Enter the Operation Number to be Performed : ");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
			   log.info("Enter the No.of.Records to be Fetched : ");
		       int rec=sc.nextInt();
			   cd.getDetails((ArrayList) cd.addDetails(), rec);  
			   break;
		case 2:log.info("Enter the No.of.Records to be Fetched : ");
	           int record=sc.nextInt();
		       cd.getDetails((ArrayList) cd.addDetails(), record);  
		       break;
		case 3:cd.searchByConTypeAndVAS((ArrayList) cd.addDetails());
		       break;
		case 4:cd.searchByConAndDescAndActive((ArrayList) cd.addDetails());
	       	   break;
		case 5:cd.findByPhoneConAndIs4g((ArrayList) cd.addDetails());
		       break;
		case 6:cd.findByPhoneConAndIs4g((ArrayList) cd.addDetails());
		       cd.sortByNameAndPhone();
		       break;
		case 7:log.info("Enter the Customer ID between 1 - 15");
		       id=sc.nextInt();
		       cd.findByCustId((ArrayList) cd.addDetails(), id);
		       break;
		case 8:cd.printDetails((ArrayList) cd.addDetails());
		       break;
		case 9:cd.sortByCon((ArrayList) cd.addDetails());
		        break;
		case 10:cd.findByPhoneConAndConvName((ArrayList) cd.addDetails());
		        break;
	    default:log.info("Operation number doesn't match");
		}
		
		}
		
		
	}
	}
