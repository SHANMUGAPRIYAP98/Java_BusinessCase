package com.srm.filehandling.s4jexceptioncaredi;

public class InCorrectDateOfManufacturerException extends Exception{

    public InCorrectDateOfManufacturerException(String date) {
        super(date);
    }

}
