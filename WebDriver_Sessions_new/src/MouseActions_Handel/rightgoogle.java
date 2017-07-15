package MouseActions_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightgoogle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='gbqfsa']"));
		Actions act = new Actions(driver);
		
		act.contextClick(ele).click().perform();

	}

}
