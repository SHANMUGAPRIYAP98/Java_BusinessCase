package com.srm.lab2;

import java.util.Scanner;
import java.util.logging.Logger;

class Multiplication extends Thread
{
	Logger log=Logger.getLogger(Multiplication.class.getName());
	@Override
	public void run()
	{
		Thread.currentThread().setName("Multiplication Thread");
		log.info("Current Thread : "+Thread.currentThread());	
		log.info("Thread Name : "+Thread.currentThread().getName());
		log.info("Thread Id : "+Thread.currentThread().getId());
		for(int i=1,j=2;i<=10;i++)
		{
			log.info(j+"*"+i+"="+(i*j));
		}
	}
}

class BioDetails implements Runnable
{
	Logger log=Logger.getLogger(BioDetails.class.getName());
    String name;
    int age;
    String address;
    String email;
    String phoneNo;
    String bloodGroup;
	public BioDetails(String name, int age, String address, String email, String phoneNo, String bloodGroup) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phoneNo = phoneNo;
		this.bloodGroup = bloodGroup;
	}
	@Override
	public void run() {
		log.info("Current Thread Running : "+Thread.currentThread()+" ");
		Thread.currentThread().setName("BioDetails Thread");
		log.info("Thread Name : "+Thread.currentThread().getName());
		log.info("Thread Id : "+Thread.currentThread().getId());
	}
}

public class ThreadDemo {
	static Logger log=Logger.getLogger(ThreadDemo.class.getName());
	public static void main(String[] args) {
    log.info("Thread Implementation to get ID");
    log.info("1.Thread Class"+"\n2.Runnable Interface");
    try (Scanner sc = new Scanner(System.in)) {
		log.info("Enter the Choice : ");
		int op=sc.nextInt();
		if(op==1)
		{
			Multiplication m=new Multiplication();
			m.start();
		}
		else
		{
		BioDetails bio=new BioDetails("diyashri",6,"kodungaiyur","diya2806@gmail.com","9102341234","b-ve");
		Thread t=new Thread(bio);
		t.start();
		}
	}
	}

}
