package Iframes_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountingFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://timesofindia.indiatimes.com/");
		Thread.sleep(3000L);
		List<WebElement> element=driver.findElements(By.tagName("iframe"));
		System.out.println(element.size());
		for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getLocation());
		}
		

	}

}
