package com.chemtrix.qa.utils;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Dummy {
	public static void main(String[] args) throws InvalidFormatException, IOException {
//	GetTheDataForSpecificModules getdata=new GetTheDataForSpecificModules();
		String heading = GetTheDataForSpecificModules.readDataForSalesOrder(
				"C:\\Users\\Admin\\git\\Chemtrix\\src\\test\\resources\\Excel\\ChemtrixData.xlsx", "SalesOrder", 0,
				"SalesOrderId");
		System.out.println(heading);
	}
}
