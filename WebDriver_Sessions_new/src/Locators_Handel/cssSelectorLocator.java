package Locators_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelectorLocator {

	public static void main(String[] args) {


		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		//driver.findElement(By.cssSelector("input[class='gbqfif']")).sendKeys("testing css");
		//driver.findElement(By.cssSelector("input[id='gbqfq']")).sendKeys("testing css");
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("testing css");
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("testing css");
	
		//driver.findElement(By.cssSelector("input#lst-ib")).sendKeys("testing css");
		driver.findElement(By.cssSelector("input.gsfi")).sendKeys("testing css");
		
	}

}
