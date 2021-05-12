package com.srm.filehandling.s4jexceptioncaredi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S4jexceptioncarediApplication {

	public static void main(String[] args) throws InCorrectDateOfManufacturerException, HeaderCostNotMatchingException {
		SpringApplication.run(S4jexceptioncarediApplication.class, args);
		CarFileHandler cfh=new CarFileHandler();
		cfh.readFileNames();
		cfh.readFileContent();
		cfh.writeFileContent();
	}

}
