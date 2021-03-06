package com.srm.threads.jthreadshealthcarefile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class PatientFileReaderImpl extends BaseFileReader {
	Logger log=Logger.getLogger(PatientFileReaderImpl.class.getName());
    String loc = LOCATION;
    List<String> files = new ArrayList<>();
    List<String> errorList = new ArrayList<>();
    List<String> successList = new ArrayList<>();
    File[] f = new File(loc).listFiles();
    String[] header;

    @Override
    public void readFileNames() {
        for (File file : f) {
            if (file != null) {
                files.add(file.getName());
            }
        }
        if (files.isEmpty()) {
            log.info("File doesn't Exists");
        } else {
            for (int i = 0; i < files.size(); i++) {
                log.info(files.get(i));
            }
        }
    }
    String readpath="";
    @Override
    void readFileContent() {
        log.info("Files Available Are : ");
		if (files.isEmpty()) {
		    log.info("No Files Available to Read");
		} else {
		    log.info("\n");
		    for (int i = 0; i < files.size(); i++) {
		        log.info((i + 1) + " : " + files.get(i)+"\n");
		    }
		}
		log.info("Enter the Operation File Number to Read : ");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		 readpath= loc + "\\" + files.get(op - 1);
		log.info(readpath);
		String data="";
		String[] split = {};
		String nline = "";
		try(BufferedReader br = new BufferedReader(new FileReader(readpath))){
		    if((data=br.readLine())==null)
		    {
		        log.info("No Content Available in the File to Read");
		    }
		    else
		    {
		    while ((data = br.readLine()) != null) {
		        log.info(data);
		        split = data.split("##");
		        nline = "";
		        for (int i = 0; i < split.length; i++) {
		            nline = nline + split[i] + "\t";
		        }
		       
		        if (split.length == 9 && split[0].length() <= 5 && split[1].length() == 22
		        &&split[2].length()<=10&&split[3].length()<=10&&split[4].length()<=10&&split[5].length()<=10
		        &&split[6].length()<=10&&split[7].length()<=5&&split[8].length()<=3 && (Float.parseFloat(split[5])>5.00 && Integer.parseInt(split[8])<45) || (Float.parseFloat(split[5])>8.2 && Integer.parseInt(split[8])>=45 ) ){
		            successList.add(nline);
		        } else {
		            errorList.add(nline);
		        }

		    }
		  
		}
		    log.info(split[0].length()+" "+split[1].length()+" "+split[2].length()
		    +" "+split[3].length()+" "+split[4].length()+" "+split[5].length()+" "+split[6].length()+" "+split[7].length());
		   
		    log.info("Success List");
		    for(int i=0;i<successList.size();i++)
		    {
		    	log.info(successList.get(i)+"\n");
		    }
		    log.info("Error List");
		    for(int i=0;i<errorList.size();i++)
		    {
		    	log.info(errorList.get(i)+"\n");
		    }
		} catch (IOException e) {

		}
    }

    @Override
    void writeFileContent() {
        String newPath = readpath.replace("txt", "csv");
        log.info(newPath);
        try (FileWriter fwriter = new FileWriter(newPath)){
            fwriter.append("ID"+"\t");
            fwriter.append("Patient Ref Number" + "\t");
            fwriter.append("Lipid profile" + "\t");
            fwriter.append("LCD Level" + "\t");
            fwriter.append("PCS Level" + "\t");
            fwriter.append("OPD Level" + "\t");
            fwriter.append("SGT Level" + "\t");
            fwriter.append("CHL Ratio" + "\t");
            fwriter.append("age"+"\t");
            fwriter.append("\n");
            for (int i = 0; i < successList.size(); i++) {
                fwriter.append(successList.get(i) + "\n");
            }
            fwriter.flush();
            fwriter.close();

        } catch (IOException e) {

        }
    }
}
