package com.chemtrix.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class SalesquotationNoReader {

	public Properties intializeProperties() {

		Properties prop = new Properties();
		File proFile = new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\config\\salesquotno.properties");

		try {
			FileInputStream fis = new FileInputStream(proFile);
			prop.load(fis);
		} catch (Throwable e) {
			e.printStackTrace();
		}

		return prop;

	}

}