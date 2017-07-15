package Webtables_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathsbreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://timeanddate.com/calendar/");
		
		
		String xpstart="//*[@id='mct1']/tbody/tr[2]/td[1]/table/tbody/tr[5]/td[";
		String xpend="]";
		
		
		
		int i=5;		
				
		WebElement ele =driver.findElement(By.xpath(xpstart+i+xpend));
		
		System.out.println(ele.getText());
		
		
		
		
		
		
		

	}

}
