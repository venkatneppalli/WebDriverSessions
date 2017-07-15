package DownloadUploadfiles_AutoIT_Handel;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Downloading_File {

	/**
	 * @param args
	 * @throws AWTException 
	 */
	public static void main(String[] args) throws AWTException {
	    
		
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
		
		
		/*
		FirefoxProfile profile = new FirefoxProfile(); 

	    profile.setPreference("browser.download.folderList", 2);     

	    profile.setPreference("browser.download.dir","D:\\test");
	    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword,application/x-rar-compressed,application/octet-stream,application/csv,text/csv");
	    
	    WebDriver driver = new FirefoxDriver(profile);
	    driver.get("http://qtpselenium.com/test/testdownload.php");
	    driver.findElement(By.xpath("html/body/a[1]")).click();
	    driver.findElement(By.xpath("html/body/a[2]")).click();
	    driver.findElement(By.xpath("html/body/a[3]")).click();
*/
		
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.apple.com/itunes/affiliates/download/?id=310633997");
		driver.findElement(By.xpath("//*[@id='hero']/div[1]/div[2]/a/img")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("C:\\");
		
		
		
		//driver.findElement(By.xpath("//*[@id='hero']/div[1]/div[2]/a/img")).sendKeys("C:\\download_files");
		
	    
	   
	}
	

}
