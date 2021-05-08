package com.deletedata_IVLlogic;

import java.io.IOException;

import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;

public class ReadExcelFile{

	public void getExcelData(int row,int column)
	{
		String filePath = "../ReadExternalFile/src/test/resources/testData/TestCodeData.xlsx";

		Workbook wb = new Workbook();
		wb.loadFromFile(filePath);
		Worksheet sheet = wb.getWorksheets().get("code");

		int rowSize = sheet.getRows().length;
		System.out.println(" row size #######  " +rowSize);
		//		String data = sheet.get(1, 1).getText();
		//		System.out.println("data---------- " +data);
		String data = sheet.get(row, column).getNumberText();
		System.out.println("data---------- " +data);


	}

	public void deleteExcelData(int row,int column) throws IOException
	{
		String filePath = "../ReadExternalFile/src/test/resources/testData/TestCodeData.xlsx";
		Workbook wb = new Workbook();
		wb.loadFromFile(filePath);

		Worksheet sheet = wb.getWorksheets().get("code");
		String data = sheet.get(row, column).getNumberText();
		sheet.removeRange(row, column);
		System.out.println("deleted - - ---- '"+data+"' ");
		//Loop through the rows
		for (int i = sheet.getLastRow(); i >= 1; i--)
		{
			//Detect if a row is blank
			if (sheet.getRows()[i-1].isBlank())
			{
				//Remove blank row
				sheet.deleteRow(i);
			}
		}

		//Loop through the columns
		for (int j = sheet.getLastColumn(); j >= 1; j--)
		{
			//Detect if a column is blank
			if (sheet.getColumns()[j-1].isBlank())
			{
				//Remove blank column
				sheet.deleteColumn(j);
			}
		}

		//Save the file
		wb.saveToFile(filePath);
		System.out.println("After deleting data it successfully saved");
	}
}

