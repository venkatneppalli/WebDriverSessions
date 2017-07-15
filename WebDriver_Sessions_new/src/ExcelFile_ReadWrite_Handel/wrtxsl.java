package ExcelFile_ReadWrite_Handel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import jxl.write.WritableWorkbook;

import ExcelFile_ReadWrite_Handel.Xls_Reader;

import java.io.FileOutputStream;
import java.util.ArrayList;

//import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class wrtxsl {

	public static Xls_Reader suitxls;
	
	public static void main(String[] args) {
		
	
		
		
	System.out.println("Hello 1");
		
		suitxls =new Xls_Reader("C:\\Workspace\\WebDriver_Sessions\\src\\readwrite_xsl\\Test.xlsx");
		
		
		String str="IBM";
		
		ArrayList<String> ars = new ArrayList<String>();
		
		ars.add("IBM");
		ars.add("TCS");
		ars.add("CTS");
		ars.add("CSC");
		ars.add("INFO");
		
		
		for(int i=0;i<ars.size();i++){
			suitxls.setCellData("Sheet1", "Employees", i+2, ars.get(i));
			//suitxls.setCellData(sheetName, colName, rowNum, data);
		}
		
		
		
		

		

	}

}


/*
import org.testng.annotations.Test;




public class wrtxsl {

    private static WebDriver driver;
    static String username="abc";
    static String password="abf123";

    public static void main(String args[]) {
        try {
            driver.get("http://www.gmail.com");

            driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(username);

            driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys(password);

            FileOutputStream fos = new FileOutputStream("C:\\Users\\Venkat\\Desktop\\Userpass.xls");

            HSSFWorkbook workbook = new HSSFWorkbook();

            HSSFSheet worksheet = workbook.createSheet("POI WorkSheet");

            HSSFRow row1 = worksheet.createRow(0);
            row1.createCell(0).setCellValue(new HSSFRichTextString("username"));
            row1.createCell(1).setCellValue(new HSSFRichTextString("password"));

            workbook.write(fos);

            fos.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
    @Test
    public void f() {
    }
}


*/







