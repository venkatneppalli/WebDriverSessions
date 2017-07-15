package Checkboxes_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checktest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.adactin.com/HotelApp/Register.php");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//*[@id='tnc_box']"));
		
		//element.click();
		
		System.out.println(element.getAttribute("checked"));
		
		
		

	}

}
