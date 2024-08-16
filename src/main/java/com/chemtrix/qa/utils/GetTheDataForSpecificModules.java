package com.chemtrix.qa.utils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class GetTheDataForSpecificModules {
//public static  int rowNumber=0;

	public static String readDataForSalesOrder(String ExcelFilePath, String SheetName, int rowNumber,
			String HeadingOfTheColumn) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(ExcelFilePath, SheetName);

		String heading = testData.get(rowNumber).get(HeadingOfTheColumn);
		return heading;
	}

}