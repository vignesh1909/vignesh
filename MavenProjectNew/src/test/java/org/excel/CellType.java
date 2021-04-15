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

public class CellType {

	public static void main(String[] args) throws IOException {
		//location
		File loc = new File("C:\\Users\\Asus\\eclipse-workspace\\MavenProjectNew\\TestData\\TestDetails.xlsx");
		//convert the file to object
		FileInputStream streamInput = new FileInputStream(loc);
		//read the excel
		Workbook work = new XSSFWorkbook(streamInput);
		//sheet
		Sheet sheet = work.getSheet("Data");
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
		int type = cell.getCellType();
		 
		if (type==0) {//date
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format= new SimpleDateFormat("DD-MMM-YYYY");
				String date = format.format(dateCellValue);
				System.out.println("Date Value:"+date);
				
			} else {
				double d = cell.getNumericCellValue();
				System.out.println("Salary Value:"+d);
				long l = (long)d;
				System.out.println("long Value:"+l);

		}
		
		}
		if (type==1) {
			String stringValue = cell.getStringCellValue();
			System.out.println("String Data:"+stringValue);
			
		}
		
		
		}
	}

}
}





