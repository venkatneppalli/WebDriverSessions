package GridSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest1 {

	public WebDriver driver;
	DesiredCapabilities cap=null;

	@Test
	public void f() throws MalformedURLException, InterruptedException {

		driver.findElement(By.id("username")).sendKeys("seleniumtesting");
		driver.findElement(By.id("password")).sendKeys("password1");
		Thread.sleep(4000);
		driver.findElement(By.id("login")).click();
		
	}

	@Parameters({"browsers","url_test"})
	@BeforeMethod
	public void beforeMethod(String browsers,String url_test) throws MalformedURLException {

		System.out.println(browsers);
		
		if(browsers.equals("chrome_browser")){
			System.out.println("Opening chrome browser.....................");
			
			try{
				cap = new DesiredCapabilities().chrome();
				//cap.setBrowserName("chrome");
				driver = new RemoteWebDriver(new URL(url_test), cap);
				driver.get("http://adactin.com/HotelApp/");
				driver.manage().window().maximize();	
			}catch(Exception e){
				
				System.out.println(e.getMessage());
			}
			
	
			
		}else if(browsers.equals("ie_browser")){
			System.out.println("Opening iexplore browser.....................");
			try{
				cap = new DesiredCapabilities().internetExplorer();
				//cap.setBrowserName("iexplore");
				driver = new RemoteWebDriver(new URL(url_test), cap);
				driver.get("http://adactin.com/HotelApp/");
				driver.manage().window().maximize();	
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			
		}else if(browsers.equals("firefox_browser")){
			System.out.println("Opening firefox browser.....................");
			try{
				cap = new DesiredCapabilities().firefox();
				//cap.setBrowserName("firefox");
				driver = new RemoteWebDriver(new URL(url_test),cap);
				driver.get("http://adactin.com/HotelApp/");
				driver.manage().window().maximize();	
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			
			
		}
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

			}

	@AfterTest
	public void afterMethod() {

		driver.close();
	}

}
