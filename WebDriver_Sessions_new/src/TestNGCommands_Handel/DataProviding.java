package TestNGCommands_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelFile_ReadWrite_Handel.Xls_Reader;

//import readwrite_xsl.Xls_Reader;

public class DataProviding {
    
    static WebDriver driver=null;
    static Xls_Reader xl=null;
    
    
    
    @Test(dataProvider="getData")
    public void doLogin(String tst,String userid,String password)
    {
        driver=new FirefoxDriver();
        driver.get("http://nowriztech.com");

        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtUserName1']")).sendKeys(userid);
        driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPassword']")).sendKeys(password);
        
    }
    
    
@DataProvider
    public static Object[][] getData()
    {
        xl=new Xls_Reader(("D:\\SeleniumJava_Programs\\WebDriver_Sessions_new\\src\\TestNGCommands_Handel\\Test.xlsx"));
        int rows=xl.getRowCount("Sheet1");
        int cols=xl.getColumnCount("Sheet1");
        
        Object[][] data=new Object[rows-1][cols];
        
        for(int row=2;row<=rows;row++)
        {
            for(int col=0;col<cols;col++)
            {
                data[row-2][col]=xl.getCellData("Sheet1", col, row);
            }
        }
        
        return data;
    }
    
}