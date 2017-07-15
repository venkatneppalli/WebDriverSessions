package CountElements_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("tst");
		

	}

}
