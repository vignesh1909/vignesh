package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReplaceExcel {

	public static void main(String[] args) throws IOException {
		//file location
		File loc = new File("C:\\Users\\Asus\\eclipse-workspace\\MavenProjectNew\\TestData\\TestDetails.xlsx");
		//convert the file to object
		FileInputStream streamInput = new FileInputStream(loc);
		//read the excel
		Workbook work = new XSSFWorkbook(streamInput);
		//Sheet 
		Sheet s = work.getSheet("Data");
		//row
		Row r=s.getRow(0);
		//cell
		Cell c = r.getCell(1);
		System.out.println("Get the cell Value:"+ c);
		String replace = c.getStringCellValue();
		
		if (replace.equals("MECH")) {
			c.setCellValue("Mechanical");
			System.out.println("Updated cell value:"+c);
			
		}
		FileOutputStream newloc = new FileOutputStream("C:\\Users\\Asus\\eclipse-workspace\\MavenProjectNew\\TestData\\TestDetails1.xlsx");
		work.write(newloc);

	}

}
