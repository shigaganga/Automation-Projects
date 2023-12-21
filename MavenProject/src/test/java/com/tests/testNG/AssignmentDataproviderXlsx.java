package com.tests.testNG;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class AssignmentDataproviderXlsx {
	@DataProvider(name="loginData")
	public String [][] getData() throws IOException,FileNotFoundException{
	File ExcelFile=new File( "C://Users/shiga/java-workspace/JavaBasics/UserPasswordDataprovider.xlsx");
	FileInputStream fis=new FileInputStream(ExcelFile);
	XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
	XSSFSheet mySheet = myWorkBook.getSheetAt(0);
// Get the number of rows and columns
			int numRows = mySheet.getPhysicalNumberOfRows();
			int numCols = mySheet.getRow(0).getLastCellNum();
			String[][] data= new String[numRows-1][numCols];//excluding header
			for(int i=0;i<numRows-1;i++) {
				for(int j=0;j<numCols;j++) {//mysheet.getRow(i+1).getcell(j)gives the each coloum value for i th row
			DataFormatter df=new DataFormatter();//it will convert any type of data to string type
        data[i][j] =   df.formatCellValue(mySheet.getRow(i+1).getCell(j));//storing this data in to 2 dim array
				}//first reading part,then make it 2 dim array,then integrate data array with dataprovider
				
				myWorkBook.close();
				fis.close();
				
			}
/*	for(String[] dataArray:data) {
		System.out.println(Arrays.toString(dataArray));
	}*///main method
	return data;
	}}