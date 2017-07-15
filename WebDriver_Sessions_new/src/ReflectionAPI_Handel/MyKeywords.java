package ReflectionAPI_Handel;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyKeywords {
	
	public static WebDriver driver;
	
	public static ExtentReports report;
	public static ExtentTest logger;
	
	public static String strResultsPath = "C:\\myreports";		
	public static Calendar cal = Calendar.getInstance();
	public static String strResultsFolder = "Run_" + cal.get(Calendar.DATE) + "_" + (cal.get(Calendar.MONTH) + 1) + "_" + cal.get(Calendar.YEAR) + "_" + cal.get(Calendar.HOUR_OF_DAY) + "_" + cal.get(Calendar.MINUTE) + "_" + cal.get(Calendar.SECOND);
	public static String strExtentResultsPath = strResultsPath + "\\" + strResultsFolder + "\\auto_results.html";
	
	public String openBrowser(String objectname,String data){
		
		try{
			report = new ExtentReports(strExtentResultsPath);
			logger=report.startTest("OpenBrowserTest");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkateswararao.n\\Desktop\\Browser_Drivers\\chromedriver_win32\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    	logger.log(LogStatus.PASS, "Chrome Browser Launched");
		}catch(Exception e){
			
			logger.log(LogStatus.FAIL, e.getMessage()+"Chrome Browser NOT Launched");
	    }
		
    	 return "Pass";	 
	}
	
	public String navigateURL(String objectname,String data){
	
		try{
			logger=report.startTest("Navigate URL");	
	   	 	driver.get("http://google.com");
	   	 	logger.log(LogStatus.PASS, "Navigated to google website");	
		}catch(Exception e){
			logger.log(LogStatus.FAIL, e.getMessage()+"Failed to Navigate to google website");
		}
	 
   	 return "Pass";
   	 
	}
	
	public String writeInput(String objectname,String data){
		
		try{
			logger=report.startTest("Write Input Text");	
	   	 	driver.findElement(By.name("q")).sendKeys("Testing");
	   	 	logger.log(LogStatus.PASS, "Write input in search text");	
		}catch(Exception e){
			logger.log(LogStatus.FAIL, e.getMessage()+"Not able to Write input in search text");
		}
		
   	 return "Pass";
   	 
	}
	
	public String clickButton(String objectname,String data){
		
		try{
			logger=report.startTest("Write Input Text");	
	   	 	driver.findElement(By.name("q")).sendKeys("Testing");
	   	 	logger.log(LogStatus.PASS, "Write input in search text");	
		}catch(Exception e){
			logger.log(LogStatus.FAIL, e.getMessage()+"Not able to Write input in search text");
		}
		
   	 return "Pass";
   	 
	}
	
	public static void report_test(){
		
		report.endTest(logger);
		report.flush();
		   
		  driver.get(strExtentResultsPath);
	}
	
	
	
}
