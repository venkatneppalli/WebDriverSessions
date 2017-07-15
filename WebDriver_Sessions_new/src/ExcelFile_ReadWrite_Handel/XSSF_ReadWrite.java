package ExcelFile_ReadWrite_Handel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSF_ReadWrite {

	public static void main(String[] args) throws IOException {
		// ReadFile();
		// GetColCount();
		 WriteFile();
		// GetRowCount();
		//Sheet2_GetData();
		//Sheet2_getrowcount();
	}

	public static void ReadFile() throws IOException {

		// File src=new
		// File("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\ReadWrite_ExcelFile\\Test.xlsx");
		FileInputStream fis = new FileInputStream(
				"D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\ReadWrite_ExcelFile\\Test.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());

	}

	public static void GetRowCount() throws IOException {

		FileInputStream fis = new FileInputStream(
				"D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\ReadWrite_ExcelFile\\Test.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		System.out.println("Total Number of Columns:= " + sheet.getRow(0).getLastCellNum());

		String sheetName = "Sheet1";
		int index = workbook.getSheetIndex(sheetName);
		if (index == -1)
			// return 0;
			System.out.println("return zero rows");
		else {
			sheet = workbook.getSheetAt(index);
			int number = sheet.getLastRowNum() + 1;
			System.out.println("return total numberof rows:= " + number);
		}

	}

	public static void WriteFile() throws IOException {

		File src = new File("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\ReadWrite_ExcelFile\\Test.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		sheet.getRow(3).createCell(0).setCellValue("NEW CREATED CELL");

		FileOutputStream fos = new FileOutputStream(src);

		workbook.write(fos);

		fos.close();

	}

	public static void GetColCount() throws IOException {

		File src = new File("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\ReadWrite_ExcelFile\\Test.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(0);

		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println("column count:= "+sheet.getRow(0).getLastCellNum());


	}

	public static void Sheet2_GetData() throws IOException {

		File src = new File("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\ReadWrite_ExcelFile\\Test.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheetAt(1);

		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());

		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println("column count:= "+sheet.getRow(0).getLastCellNum());

	}

	public static void Sheet2_getrowcount() throws IOException{
		
		File src = new File("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\ReadWrite_ExcelFile\\Test.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(1);
		
		
		Iterator itr = sheet.iterator();
		
		int i=0;
		
		while(itr.hasNext()){
			
			itr.next();
			
			System.out.println(sheet.getRow(i).getCell(0).getStringCellValue());
			
			i++;
		}
		
		System.out.println(i);
		
		
		
		
	}
	
}
