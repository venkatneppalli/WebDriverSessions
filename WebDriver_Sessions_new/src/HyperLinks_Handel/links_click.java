package HyperLinks_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links_click {
	public static void main(String args[]) throws InterruptedException,Exception
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.bbc.com");
		driver.manage().window().maximize();
		Thread.sleep(2000L);
		try
		{
			
		
		List<WebElement> element=driver.findElements(By.tagName("a"));
		for(int i=0;i<element.size();i++)
		{
			////String strWeath=driver.findElement(By.xpath("//*[@id='blq-nav-weather']/a")).getText();
			System.out.println(element.get(i).getText());
			
			//if((strWeath).equals("Weather"))
				
		//	{

			//	System.out.println(element.get(i).getText());
			//	element.get(i).click();
				
			//}
			if(element.get(i).getText().equals(driver.findElement(By.linkText("Weather")).getText()))
			{
				System.out.println("--------------------------------------------------------");
				driver.findElement(By.xpath("//*[@id='blq-nav-weather']/a")).click();
				//driver.close();
			}
		}
		}
		catch(StaleElementReferenceException sre)
		{
			System.out.println("StaleElementReferenceException is due to unavailability of an element being accessed by findelement method.");
		}
		
		
	}

}
