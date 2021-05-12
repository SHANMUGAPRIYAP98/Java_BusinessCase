package com.srm.threads.jthreadshealthcarefile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JthreadshealthcarefileApplication {
	public static void main(String[] args) {
		SpringApplication.run(JthreadshealthcarefileApplication.class, args);
		PatientFileReaderImpl pf=new PatientFileReaderImpl();
		pf.readFileNames();
		pf.readFileContent();
		pf.writeFileContent();
		

}
}
