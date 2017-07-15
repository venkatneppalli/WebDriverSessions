package DownloadUploadfiles_AutoIT_Handel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.jacob.com.LibraryLoader;

public class testnotepad {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws AWTException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		
		
		
		WebDriver driver = new FirefoxDriver();
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
        driver.manage().window().maximize();
        
        
        
        driver.get("http://www.tutorialspoint.com/jsp/jsp_file_uploading.htm");
        Thread.sleep(5000L);
	
    
    
        
        Thread.sleep(5000L);
        
        WebElement link =     driver.findElement(By.xpath(".//*[@id='middlecol']/div[1]/pre[2]/input[1]"));
        
        //WebElement link = driver.findElement(By.xpath("//*[@id='fileupload']/div/div[1]/span[1]/span"));
		  
        
		//Process process = new ProcessBuilder("D:\\AutoIT_Scripts\\testnotepad.exe","","Open").start();

		//Runtime.getRuntime().exec("D:\\AutoIT_Scripts\\testnotepad.exe");
		
        Robot robot = new Robot();
        //get the focus on the element..don't use click since it stalls the driver          
        link.sendKeys("C:\\Users\\Venkat\\Desktop\\SomeFile.txt");
        
        Thread.sleep(3000L);
        //simulate pressing enter            
       // robot.keyPress(KeyEvent.VK_ENTER);
        
        Thread.sleep(3000L);
        //System.out.println("clcking Enter key");
        //robot.keyRelease(KeyEvent.VK_ENTER);
        //wait for the modal dialog to open            
        Thread.sleep(3000L);
                    
               
        
        
        
	}

}
