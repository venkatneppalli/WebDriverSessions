package PageObjectModel_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Test {
	
	public WebDriver driver;
	
	
	public void init(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
	}

}
