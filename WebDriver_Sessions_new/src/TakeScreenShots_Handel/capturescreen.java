package TakeScreenShots_Handel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class capturescreen {

	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.ie.driver", "C:\\Eclipse-Workspace\\IEDriverServer.exe");
		
		//WebDriver driver = new InternetExplorerDriver();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://timesofindia.indiatimes.com/");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File("D:\\test\\screen.jpg"));

	    

	}

}
