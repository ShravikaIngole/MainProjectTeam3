package com.selenium.utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	
			
			public static String readData(int a, int b)throws Exception{
				
				//locating the path of credentials file 
				String location = System.getProperty("user.dir") + "\\ExcelInput\\InputExcel.xlsx";
				
				//new file with location
				File file = new File(location);
				FileInputStream fileInputStream = new FileInputStream(file);
				XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				String data = sheet.getRow(a).getCell(b).getStringCellValue();
				fileInputStream.close();
				
				return data;

			}


}
