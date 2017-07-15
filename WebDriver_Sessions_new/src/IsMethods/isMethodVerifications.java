package IsMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class isMethodVerifications {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		

	}
	
	
	public static void isDisplay_Button(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.indianrail.gov.in");
		
		
		

	}

}
