package DownloadUploadfiles_AutoIT_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class downloadjars {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("https://www.transferbigfiles.com/");
	        Thread.sleep(5000L);
		
	        driver.findElement(By.xpath("//*[@id='file-input']")).click();
	        
		  //driver.findElement(By.xpath("//*[@id='file-input']")).sendKeys("C:\\Users\\Venkat\\Desktop\\sample.jpg");

		
		

	}

}
