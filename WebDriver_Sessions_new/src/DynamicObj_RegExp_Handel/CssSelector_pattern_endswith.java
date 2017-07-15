package DynamicObj_RegExp_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_pattern_endswith {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.cssSelector("input[id$='-ib']")).sendKeys("testing cssselector pattern");
		
	}

}
