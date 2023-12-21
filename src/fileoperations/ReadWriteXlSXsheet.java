package fileoperations;
// maven-- pom.xml--- dependancy
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	

public class ReadWriteXlSXsheet {

	public static void readSingledatafromxlsxfile()throws IOException {
		System.out.println(System.getProperty("user.dir"));
			
		FileInputStream fi=new FileInputStream(new File(System.getProperty("user.dir")+"/Resources/book1.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet= workbook.getSheet("Sheet3");
		XSSFRow row= sheet.getRow(0);
		XSSFCell cell= row.getCell(0);
		if(cell.getCellType()== CellType.NUMERIC)			System.out.println(cell.getNumericCellValue());
	else if(cell.getCellType()== CellType.STRING)
			System.out.println(cell.getStringCellValue());
	fi.close();

	}
	
	/*public static void readAlldatafromxlsxfile()throws IOException {
		FileInputStream fi=new FileInputStream(new File(System.getProperty("user.dir")+"/Resources/book1.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		//int totalsheet=workbook.getNumberOfSheets();
		//for(int k=0;k<totalsheet;k++) {
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		int totalRows=sheet.getLastRowNum()+1;
		//int totalCol=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<totalRows;i++) {
			int totalcell=sheet.getRow(i).getLastCellNum();
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<totalcell;j++) {
				XSSFCell cell= row.getCell(j);
				if(cell.getCellType()== CellType.NUMERIC)
					System.out.print(cell.getNumericCellValue()+ " ");
				else if(cell.getCellType()== CellType.STRING)
					System.out.print(cell.getStringCellValue()+" ");
			}
			System.out.println();
		}
		System.out.println("**********************");
		
		
		fi.close();
		
		

	}
	
	public static void readAlldatafromxlsxfileA()throws IOException {
		FileInputStream fi=new FileInputStream(new File(System.getProperty("user.dir")+"/Resources/book1.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		//int totalsheet=workbook.getNumberOfSheets();
		//for(int k=0;k<totalsheet;k++) {
		//workbook.sheetIterator();
		XSSFSheet sheet= workbook.getSheet("Sheet1");
	
	
		Iterator<Row> rowit=sheet.rowIterator();
		while(rowit.hasNext()) {
			Row row=rowit.next();
			Iterator<Cell> cellit= row.cellIterator();
			while(cellit.hasNext()) {
				Cell cell=cellit.next();
				if(cell.getCellType()== CellType.NUMERIC)
					System.out.print(cell.getNumericCellValue()+ " ");
				else if(cell.getCellType()== CellType.STRING)
					System.out.print(cell.getStringCellValue()+" ");
			
			}
		}
		
		fi.close();
		
		

	}*/
	
	
	public static void main(String[] args) throws IOException  {
	
		//readAlldatafromxlsxfileA();
		readSingledatafromxlsxfile();
	}}

	
