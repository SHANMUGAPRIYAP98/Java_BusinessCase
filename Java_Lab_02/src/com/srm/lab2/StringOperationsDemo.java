package com.srm.lab2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

class StringOperations {
	Logger log=Logger.getLogger(StringOperations.class.getName());
	int result;
	String val;
	int count = 0;
	char ch1;

	String concatWithPlus(String s1, String s2) {
		return s1 + s2;
	}

	String concatMeth(String s1, String s2) {
		return s1.concat(s2);
	}

	String removeSpace(String s1) {
		val = s1.replaceAll("\\s", "");
		return val;
	}

	void charOccurence(String s1) {
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch1 = ch[i];

		}
	}

	void findVowelsCount(String s1) {
		val = s1.toLowerCase();
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch1 = ch[i];
			if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
				count++;
			}
		}
		if (count == 0) {
			log.info("No Vowels Present");
		}
		log.info("Total Number of Vowels : " + count);
	}

	void removeChar(String s1, char ch) {
		int loc = s1.indexOf(ch);
		StringBuilder sb = new StringBuilder(s1);
		log.info(sb.deleteCharAt(loc)+"");
	}

	int countWords(String s1) {
		if (s1.isEmpty()) {
			return 0;
		} else {
			String[] counts = s1.split("\\s+");
			return counts.length;
		}
	}

	String convertIntToString(int value) {
		val = String.valueOf(value);
		return val;
	}

	void findUniqChar(String val) {
		char[] ch = val.toCharArray();
		boolean flag = true;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					flag = false;
				}
			}
		}
		if (!flag) {
			log.info(val + " doesn't contains Unique Characters");
		} else {
			log.info(val + " contains Unique Characters");
		}
	}

	void countChar(String val) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = val.length() - 1; i >= 0; i--) {
			if (hm.containsKey(val.charAt(i))) {
				count = hm.get(val.charAt(i));
				hm.put(val.charAt(i), ++count);
			} else {
				hm.put(val.charAt(i), 1);
			}
		}
		log.info(hm+"\n");
	}

	void minMaxDataType() {
		log.info("Minimum Value of Integer : " + Integer.MIN_VALUE);
		log.info("Maximum Value of Integer : " + Integer.MAX_VALUE);
		log.info("Minimum Value of Float : " + Float.MIN_VALUE);
		log.info("Maximum Value of Float : " + Float.MAX_VALUE);
		log.info("Minimum Value of Double : " + Double.MIN_VALUE);
		log.info("Maximum Value of Double : " + Double.MAX_VALUE);
		log.info("Minimum Value of Byte : " + Byte.MIN_VALUE);
		log.info("Maximum Value of Byte : " + Byte.MAX_VALUE);
		log.info("Minimum Value of Long : " + Long.MIN_VALUE);
		log.info("Maximum Value of Long : " + Long.MAX_VALUE);
		log.info("Minimum Value of Short : " + Short.MIN_VALUE);
		log.info("Maximum Value of Short : " + Short.MAX_VALUE);
	}
	void convertLowerToUpper(String val)
	{
		StringBuilder str=new StringBuilder();
		char[] ch=val.toCharArray();
		for(int i=0;i<val.length();i++)
		{
			int ascii=(int)ch[i];
			char c=(char) (ascii-32);
			str=str.append(c);
		}
		log.info(str+" ");
	}
	void convertUpperToLower(String val)
	{
		StringBuilder str=new StringBuilder();
		char[] ch=val.toCharArray();
		for(int i=0;i<val.length();i++)
		{
			int ascii=(int)ch[i];
			char c=(char) (ascii+32);
			str=str.append(c);
		}
		log.info(str+" ");
	}
}

public class StringOperationsDemo {
    static Logger log=Logger.getLogger(StringOperationsDemo.class.getName());
	public static void main(String[] args) {
		StringOperations so = new StringOperations();
		String s1;
		String s2;
		String prompt="Enter the String  : ";
		Scanner sc = new Scanner(System.in);
		log.info("Enter the Number of Operations to be Performed : ");
		int n = sc.nextInt();
		log.info("String Operations" + "\n" + "==================");
		for (int i = 1; i <= n; i++) {
			log.info("Enter the Operation to be Performed : ");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				log.info("Ënter the String 1 : ");
				s1 = sc.next();
				log.info("Ënter the String 2 : ");
				s2 = sc.next();
				log.info("Concatenated with + :  " + so.concatWithPlus(s1, s2));
				log.info("Concatenated with concat() :  " + so.concatMeth(s1, s2));
				break;
			case 2:
				log.info("Enter the String 1 : ");
				Scanner sc1 = new Scanner(System.in);
				s1 = sc1.nextLine();
				log.info("Before Whitespace Removal : " + s1);
				log.info("After Whitespace Removal : " + so.removeSpace(s1));
				break;
			case 3:
				log.info(prompt);
				Scanner sc2 = new Scanner(System.in);
				String str = sc2.nextLine();
				so.charOccurence(str);
				break;
			case 4:
				log.info(prompt);
				Scanner sc3 = new Scanner(System.in);
				String str1 = sc3.nextLine();
				so.findVowelsCount(str1);
				break;
			case 5:
				log.info(prompt);
				Scanner sc4 = new Scanner(System.in);
				String str2 = sc4.nextLine();
				log.info("Enter the Character to be Removed  : ");
				char ch = sc4.next().charAt(0);
				so.removeChar(str2, ch);
				break;
			case 6:
				log.info(prompt);
				Scanner sc5 = new Scanner(System.in);
				String str3 = sc5.nextLine();
				log.info("Number of Words in the String : " + so.countWords(str3));
				break;
			case 7:
				log.info("Enter the Integer  : ");
				Scanner sc6 = new Scanner(System.in);
				int val = sc6.nextInt();
				log.info("Converted Signed Integer to String : " + so.convertIntToString(val));
				break;
			case 8:
				sc.nextLine();
				log.info(prompt);
				String value = sc.nextLine();
				so.findUniqChar(value);
				break;
			case 9:
				sc.nextLine();
				log.info(prompt);
				String data = sc.nextLine();
				so.countChar(data);
				break;
			case 10:
				sc.nextLine();
				so.minMaxDataType();
				break;
			case 11:
				sc.nextLine();
				log.info(prompt);
				String s = sc.nextLine();
				so.convertLowerToUpper(s);
				break;
			case 12:
				sc.nextLine();
				log.info(prompt);
				String a1 = sc.nextLine();
				so.convertUpperToLower(a1);
				break;

			default:
				log.info("Invalid Operation");
			}
		}

	}

}
