package Robot_DialogBox_Handel;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadfile {

	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	
		WebDriver driver = new FirefoxDriver();
		
		 driver.get("http://www.tutorialspoint.com/jsp/jsp_file_uploading.htm");
		 
		 Thread.sleep(5000L);
		    
	    WebElement link =     driver.findElement(By.xpath(".//*[@id='middlecol']/div[1]/pre[2]/input[1]"));
	        
	    //Robot robot = new Robot();
	    
	    //link.sendKeys("");
	    
	    link.click();
	    
	    Process process = new ProcessBuilder("D:\\AutoIT_Scripts\\uploadfile.exe","C:\\Users\\Venkat\\Desktop\\sample","Open").start();
	    

	}

}
