package DynamicObj_RegExp_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_pattern_Contains {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//*[text()="text1"]
		//*[contains(text(),"text1")]
		//*[starts-with(text(),"text1")]

		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("//*[contains(@name,'q')]")).sendKeys("testing contains expression");
		
	}

}
