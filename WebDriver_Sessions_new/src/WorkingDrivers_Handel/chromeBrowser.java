package WorkingDrivers_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.beans.property.SetProperty;

public class chromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("testing chrome browser");
		
	}

}
