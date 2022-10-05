package genaric_libary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfilehandling {
	  	
		public String getExcelData(String shettName , int rowNum , int colNum) throws Throwable {
			FileInputStream fis = new FileInputStream(Constant.excelfilepath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(shettName);
			Row row = sh.getRow(rowNum);
			wb.close();
			return row.getCell(colNum).getStringCellValue();
					
		}
		
		public Double getExcelData1(String shettName , int rowNum , int colNum) throws Throwable {
			FileInputStream fis = new FileInputStream(Constant.excelfilepath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(shettName);
			Row row = sh.getRow(rowNum);
			wb.close();
			return row.getCell(colNum).getNumericCellValue();
					
		}

	}
