package CountElements_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		List<WebElement> element = driver.findElements(By.tagName("input"));
		
		System.out.println("element count:= "+element.size());
		
		for(int i=1;i<element.size();i++){
			
			
			System.out.println("element text:= "+element.get(i).getAttribute("type"));
			
			if(element.get(i).getAttribute("type").equals("text") && element.get(i).getAttribute("name").equals("q")){
				
				element.get(i).sendKeys("testing");
				//System.out.println("text name:= "+element.get(i).getAttribute("name"));
			}
			
			
			//Images
			
		}
		
		
		//WebElement element1 = driver.findElement(By.xpath("//*[@id='gbqfq']"));
		//System.out.println("test:= "+element1.getAttribute("name"));
		
		
	}

}
