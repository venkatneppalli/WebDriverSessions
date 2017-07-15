package Iframes_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iframes {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.ie.driver", "C:\\Eclipse-Workspace\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://192.168.1.125:8081/hrm/Compass");  
		driver.findElement(By.id("9001-1")).sendKeys("sdasariraju@sphata.com");
		driver.findElement(By.id("9001-2")).sendKeys("sriram");
		driver.findElement(By.id("ext-gen55")).click();
		Thread.sleep(1000);
		
		
		//CLICK ON TIME SHEET LINKS
		driver.findElement(By.xpath("//ul[@id='ext-gen45']/div/li[2]/div/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@id='ext-gen48']/li[1]/div/a/span")).click();

		
		
		
		
		List<WebElement> lst = driver.findElements(By.tagName("iframe"));
		
		System.out.println(lst.size());
		
		for(int i=0;i<lst.size();i++){
			
			System.out.println("ifram names ="+lst.get(i).getAttribute("id"));
		}

		

	}

}
