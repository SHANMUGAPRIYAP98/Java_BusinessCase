package com.srm.filehandling.s4jexceptioncaredi;

public abstract class BaseFilerReader {
    String location="D:\\Java_Maven_Project\\s4jexceptioncaredi\\Car_Manufacturer_Files";
    public abstract void readFileNames();
    public abstract void readFileContent() throws InCorrectDateOfManufacturerException, HeaderCostNotMatchingException;
    public abstract void writeFileContent();
}
