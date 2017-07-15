package DynamicObj_RegExp_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Xpath_pattern_StartsWith {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		//driver.findElement(By.xpath("//*[@id='gbqfq']")).sendKeys("starwith");
		driver.findElement(By.xpath("//*[starts-with(@id,'lst-')]")).sendKeys("testing starts with expression");
		
		

	}

}
