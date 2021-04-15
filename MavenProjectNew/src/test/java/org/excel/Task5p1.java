package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task5p1 {

	public static void main(String[] args) throws IOException {
		//file location
		File loc = new File("C:\\Users\\Asus\\eclipse-workspace\\MavenProjectNew\\TestData\\TestDetails.xlsx");
		//convet the file to object
		FileInputStream streamInput = new FileInputStream(loc);
		//read the excel
		Workbook work =new XSSFWorkbook(streamInput);
		
		//find the  sheet
		Sheet s = work.getSheet("Data");
		//find the number of row
		Row r =s.getRow(0);
		int TotalnoRow= s.getPhysicalNumberOfRows();
			System.out.println("TotalNumberOfRows:"+TotalnoRow);
			
		//System.out.println("TotalNumberOfRows:"+PhysicalNumberOfRows);
		Cell c = r.getCell(0);
		int totalnocell= r.getPhysicalNumberOfCells();
		System.out.println("TotalNumberOfCells:"+totalnocell);
		
		
		
		
	

	}

}
