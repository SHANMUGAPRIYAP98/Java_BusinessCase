package com.srm.threads.jthreadshealthcarefile;

public abstract class BaseFileReader {
   public static final String LOCATION="D:\\Java_Maven_Project\\jthreadshealthcarefile\\Patient_Files";
   abstract void readFileNames();
   abstract void readFileContent();
   abstract void writeFileContent();
}
