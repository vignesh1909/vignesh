package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;

public class Task5p3 {

	public static void main(String[] args) throws IOException {
		//location
		File loc = new File("C:\\Users\\Asus\\eclipse-workspace\\MavenProjectNew\\TestData\\TestDetails1.xlsx");
		//convert the file to object
		FileInputStream streaminput = new FileInputStream(loc);
		//read the excel
		Workbook work = new XSSFWorkbook(streaminput);
		//sheet
		Sheet s = work.getSheet("Data");
		
		
	    
		//FileOutputStream newloc = new FileOutputStream("C:\\Users\\Asus\\eclipse-workspace\\MavenProjectNew\\TestData\\TestDetails2.xlsx");
		//work.write(newloc);
		
		

	}

}
