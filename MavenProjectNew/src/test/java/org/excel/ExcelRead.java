package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		//excel location
		File loc = new File("C:\\Users\\Asus\\eclipse-workspace\\MavenProjectNew\\TestData\\TestDetails.xlsx");
		//convert the file to object
		FileInputStream streamInput = new FileInputStream(loc);
		//read workbook
		Workbook work = new XSSFWorkbook(streamInput);
		//sheet
		Sheet s = work.getSheet("Data");
		//row
		Row r = s.getRow(3);
		//System.out.println("row value:"+r);
		//cell
		Cell c = r.getCell(0);
		System.out.println("cell value:"+c);
		// number of row
		int PhysicalNumberOfRows = s.getPhysicalNumberOfRows();
		System.out.println("PhysicalNumberOfRows:"+PhysicalNumberOfRows);
		//number of cell
		int PhysicalNumberOfCells =r.getPhysicalNumberOfCells();
		System.out.println("PhysicalNumberOfCells:"+PhysicalNumberOfCells);
		//print the specific row data
		for (int i = 0; i <PhysicalNumberOfCells ; i++) {
			Cell newCell = r.getCell(i);
			System.out.println("all Cell value:"+newCell);
			
			
		}

	}

}
