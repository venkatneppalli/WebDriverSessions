package WorkingDrivers_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunitdriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("testing html unit");
		
		List<WebElement> element = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<element.size();i++){
			
			System.out.println(element.get(i).getText());
		}
		
		driver.get("http://gmail.com");
		
		

	}

}
