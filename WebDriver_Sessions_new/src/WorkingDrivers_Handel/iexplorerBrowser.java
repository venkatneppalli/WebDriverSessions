package WorkingDrivers_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iexplorerBrowser {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.iexplorer.bin", "C:\\Program Files\\Internet Explorer\\iexplore.exe");
	
	System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
	
	WebDriver driver = new InternetExplorerDriver();
	
	driver.get("http://google.com");
	
	driver.findElement(By.name("q")).sendKeys("testing internetexplorer");

	}

}
