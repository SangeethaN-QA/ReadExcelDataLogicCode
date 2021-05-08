package com.read;

import com.spire.xls.Workbook;
import com.spire.xls.Worksheet;

public class DeleteRowExcelLogic {

	public static void main(String[] args) {

		String filePath = "../ReadExternalFile/src/test/resources/testData/TestCodeData.xlsx";
		Workbook wb = new Workbook();
		wb.loadFromFile(filePath);

		Worksheet sheet = wb.getWorksheets().get(0);

		String data = sheet.get(2, 1).getNumberText();
		sheet.removeRange(2, 1);
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
	}
}



