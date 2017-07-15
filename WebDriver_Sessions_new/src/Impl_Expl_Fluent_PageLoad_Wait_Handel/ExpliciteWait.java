package Impl_Expl_Fluent_PageLoad_Wait_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			
		System.setProperty("webdriver.ie.driver", "C:\\Eclipse-Workspace\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		
		driver.get("http://www.google.com");
		
		//WebElement myDynamicElement = (new WebDriverWait(driver, 10))
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		//WebElement element = driver.findElement(By.xpath("//*[@id='gbqfq']"));
		
		WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gbqfq']")));
				
		
		element2.sendKeys("send");
		

	}

}
