package com.deletedata_IVLlogic;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadExcelMethodsClass {
	
	ReadExcelFile readFile = new ReadExcelFile();
	
  @BeforeTest
  public void Test_A() throws IOException {
	  System.out.println("a get data");
	  readFile.getExcelData(1, 1);
	  System.out.println("a delete data");
	  readFile.deleteExcelData(1, 1);
  }
  
  @Test
  public void Test_B() throws IOException {
	  System.out.println("b get data");
	  readFile.getExcelData(1, 1);
	  System.out.println("b delete data");
	  readFile.deleteExcelData(1, 1);
  }
  
  @AfterTest
  public void Test_C() throws IOException {
	  System.out.println("c get data");
	  readFile.getExcelData(1, 1);
	  System.out.println("delete data");
	  readFile.deleteExcelData(1, 1);
  }
}
