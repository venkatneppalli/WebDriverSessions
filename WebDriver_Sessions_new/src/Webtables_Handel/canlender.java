package Webtables_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class canlender {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://timeanddate.com/calendar/");
		
		WebElement ele =driver.findElement(By.xpath("//*[@id='mct1']/tbody/tr[2]/td[1]"));
		
		List<WebElement> trow = ele.findElements(By.tagName("tr"));
		
		System.out.println("row size: "+trow.size());
		
		for(int irow=1;irow<trow.size();irow++){
			
			System.out.println("irows: "+trow.get(irow).getText());
		}
		
		List<WebElement> tcol = ele.findElements(By.tagName("td"));
		
		
		System.out.println("column size: "+tcol.size());
		
		for(int icol=1;icol<trow.size();icol++){
			
			System.out.println("icol: "+tcol.get(icol).getText());
			
		}
		
		
		
		

	}

}
