package fileoperations;
// maven-- pom.xml--- dependancy
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	

public class ReadWriteXlSXsheetShaju {

	public static void readSingledatafromxlsxfile()throws IOException {
		File myFile = new File("C://Users/shiga/java-workspace/JavaBasics/Shaju.xlsx");

		 FileInputStream fis = new FileInputStream(myFile);

		 // Finds the workbook instance for XLSX file
		 XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);

		 // Return first sheet from the XLSX workbook 
		XSSFSheet mySheet = myWorkBook.getSheetAt(0); 
		
		// Get iterator to all the rows in current sheet 
		Iterator<Row> rowIterator = mySheet.iterator(); 

		// Traversing over each row of XLSX file

		 while (rowIterator.hasNext()) { Row row = rowIterator.next();

		 // For each row, iterate through each columns
		 Iterator<Cell> cellIterator = row.cellIterator();
		 while (cellIterator.hasNext())
		 {
		Cell cell = cellIterator.next(); 
		switch (cell.getCellType())
		{ 
		case STRING:
			System.out.print(cell.getStringCellValue() + "\t"); break;
		case NUMERIC: 
			System.out.print(cell.getNumericCellValue() + "\t"); break;
		case BOOLEAN:
			System.out.print(cell.getBooleanCellValue() + "\t"); break; 
		default : 
			} 
		} System.out.println("");
		}



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

	
