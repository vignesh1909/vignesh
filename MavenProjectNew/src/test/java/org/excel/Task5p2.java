package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task5p2 {

	public static void main(String[] args) throws IOException {
		//file location
		File loc = new File("C:\\Users\\Asus\\eclipse-workspace\\MavenProjectNew\\TestData\\TestDetails.xlsx");
		//convert the file to object
		FileInputStream streamInput = new FileInputStream(loc);
		//read excel
		Workbook work = new XSSFWorkbook(streamInput);
		//Sheet
		Sheet s = work.getSheet("Data");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row =s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell=row.getCell(j);
				System.out.println("Cell value :"+cell);
				
			}
			}
		
		

	}

}
