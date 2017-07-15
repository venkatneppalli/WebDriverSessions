package ObjCoordinates_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class findwebobjectcorodinates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.dirver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		//driver.findElement(By.xpath("//*[@id='gbqfq']")).sendKeys("starwith");
		WebElement element = driver.findElement(By.xpath("//*[@id='gbqfq']"));
		
		System.out.println(element.getLocation());
		
		
		
		
		
		
		

	}

}
