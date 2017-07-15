package DownloadUploadfiles_AutoIT_Handel;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadfiles {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		
		//driver.findElement(By.xpath("//input[contains(@id,'file-input')]")).sendKeys("C:/path/to/file.jpg");
		
		//Runtime.getRuntime().exec("C:/Users/venkateswararaon/Desktop/sample.jpg");
		
		WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
        driver.manage().window().maximize();
        
        driver.get("http://www.toolsqa.com/automation-practice-form");
        
        WebElement link = driver.findElement(By.id("photo"));
        
        Thread.sleep(5000);
        
    
        Robot robot = new Robot();
        //get the focus on the element..don't use click since it stalls the driver          
        link.sendKeys("C:\\Users\\Venkat\\Desktop\\SomeFile.txt");
        
        Thread.sleep(3000L);
       
        
        //driver.findElement(By.xpath("//*[@id='fileupload']/div/div[1]/span[1]/span")).sendKeys("C:\\Users\\Venkat\\Desktop\\SomeFile.txt");
        
       // Runtime.getRuntime().exec("D:\\AutoIT_Scripts\\uploadfile.exe");
       // Runtime.getRuntime().exec("D:\\AutoIT_Scripts\\AutoItTest.exe");
        
        
        

	  
	}

}
