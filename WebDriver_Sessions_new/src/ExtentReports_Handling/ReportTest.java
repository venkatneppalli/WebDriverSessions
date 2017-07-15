package ExtentReports_Handling;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportTest extends ExtentReportManager {

	public WebDriver driver;

	public ExtentTest logger;
	public static ExtentReports extent=ExtentReportManager.getInstance();;
	

	@Test
	public void login_test() {

		//logger=ExtentReportManager.getInstance();
		
		//Date d = new Date();

		//String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".html";

		//extent = new ExtentReports("D:\\testrport\\" + fileName);

		//extent = ExtentManager.Instance();
	
		logger = extent.startTest("LoginTest");

		logger.log(LogStatus.INFO, "Opening Chrome Browser............");

		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		logger.log(LogStatus.INFO, "Opened Chrome Browser");

		driver.get("http://adactin.com/HotelApp/");
		
		driver.manage().window().maximize();

		logger.log(LogStatus.INFO, "Launching Adactin HotelAPP");

		driver.findElement(By.id("username")).sendKeys("seleniumtesting");

		logger.log(LogStatus.PASS, "Entered username");

		driver.findElement(By.id("password")).sendKeys("password1");

		logger.log(LogStatus.PASS, "Entered password");

		extent.endTest(logger);
		extent.flush();

	}

	@AfterTest
	public void close_browser() {

		// String fpath="D:\\testrport\\report.html";

	}

}
