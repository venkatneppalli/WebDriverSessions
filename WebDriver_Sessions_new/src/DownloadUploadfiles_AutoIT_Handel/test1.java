package DownloadUploadfiles_AutoIT_Handel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriverServer.exe");
		
		WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
        driver.manage().window().maximize();
        
        driver.get("http://www.tutorialspoint.com/jsp/jsp_file_uploading.htm");
        Thread.sleep(5000L);
	
        driver.findElement(By.xpath(".//*[@id='middlecol']/div[1]/pre[2]/input[1]")).click();
        
        Thread.sleep(1000);
        
       // Runtime.getRuntime().exec("D:\\AutoIT_Scripts\\uploadfile.exe");
        //Runtime.getRuntime().exec("D:\\AutoIT_Scripts\\uploadfile.exe");

		Process process = new ProcessBuilder("C:\\Workspace\\WebDriver_Sessions\\src\\DownloadUploadfiles\\uploadfile.exe","","Open").start();
		
		


	}

}
