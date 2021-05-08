package com.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.spire.xls.DeleteOption;
import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;

public class ReadTestData {

	public static void main(String[] args) throws IOException {


		String filePath = "../ReadExternalFile/src/test/resources/testData/TestCodeData.xlsx";
		Workbook wb = new Workbook();
		wb.loadFromFile(filePath);

		Worksheet sheet = wb.getWorksheets().get("code");
		//		String data = sheet.get(1, 1).getText();
		//		System.out.println("data---------- " +data);
		String data = sheet.get(2, 1).getNumberText();
		System.out.println("data---------- " +data);
		
	





	}

}



