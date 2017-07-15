package GetCoordinates_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class pagecoordinates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		
		WebElement element = driver.findElement(By.xpath("//*[@id='addlang']/a[2]"));
		
		System.out.println("Get Coordication of element: "+element.getLocation());
		
		System.out.println("Get Size of the element: "+element.getSize());
		
		
		

	}

}
