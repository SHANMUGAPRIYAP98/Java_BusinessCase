package com.srm.lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

class FileOperations
{
	Logger log=Logger.getLogger(FileOperations.class.getName());
	void readFile()
	{
		Scanner sc=new Scanner(System.in);
		log.info("Enter the Path of the File : ");
		String path=sc.nextLine();
		File f=new File(path);
		try
		{
			Scanner sc1=new Scanner(f);
			while(sc1.hasNextLine())
			{
				String data=sc1.nextLine();
				log.info(data);
			}
			sc1.close();
		}
		catch(FileNotFoundException e)
		{
			log.info("File not found");
		}
	}
	void readFileUsingBuffer()
	{
		Scanner sc=new Scanner(System.in);
		log.info("Enter the Path of the File : ");
		String path=sc.nextLine();
		try
		{
		BufferedReader br=new BufferedReader(new FileReader(path));
		try {
			String readData=br.readLine();
			while(readData!=null)
			{
				log.info(readData);
				readData=br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}catch(Exception e)
	{
		log.info(e.toString());
	}
    finally {
			log.info("Finally Block");
		}
	}
}
public class FileOperationsDemo {

	public static void main(String[] args) {
		FileOperations file=new FileOperations();
		file.readFile();
		file.readFileUsingBuffer();

	}

}
