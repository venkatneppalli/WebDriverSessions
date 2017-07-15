package Webtables_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testing {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.timeanddate.com/calendar/");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='mct1']/tbody/tr[2]/td[1]/table/tbody"));
		
		List<WebElement> list = element.findElements(By.tagName("tr"));
		
		for(int i=1;i<list.size();i++){
			
			System.out.println("print tr values:= "+list.get(i).getText());
			
		}
		
		
		
			
			
	}
}
