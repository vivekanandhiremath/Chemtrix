package com.chemtrix.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {

	public void writeExcel(String Sheetname, String cellvalue) throws Exception {
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\sanity.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet(Sheetname);
		int totalronum = s.getLastRowNum();
		System.out.println(totalronum);
		s.createRow(totalronum + 1).createCell(0).setCellValue(cellvalue);
		FileOutputStream fos = new FileOutputStream(new File(path));
		wb.write(fos);
		wb.close();
		fos.close();
	}

	public void writeExcelTospecifiedCell(String Sheetname, String cellvalue, int row, int col) throws Exception {
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\sanity.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet(Sheetname);

		s.getRow(row).createCell(col).setCellValue(cellvalue);
		FileOutputStream fos = new FileOutputStream(new File(path));
		wb.write(fos);
		wb.close();
		fos.close();
	}

//	@Test
//	public void test() throws Exception {
//		writeExcelspecified("ECharter", "vivek", 0, 0);
//	}
//
//	@Test
//	public void test1() throws Exception {
//		writeExcel("ECharter", "vivek");
//
//	}

}
