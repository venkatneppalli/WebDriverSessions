package Alerts_Handel;

//import static com.selenium.test.DriverScript.OR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import com.selenium.test.Constants;

public class alertie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.ie.dirver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("http://in.rediff.com");
		
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='btn_login']")).click();
		
		
		Alert javascriptAlert = driver.switchTo().alert();
		System.out.println(javascriptAlert.getText()); // text on alert box
		javascriptAlert.accept();
		//javascriptAlert.dismiss();
		
	
	}

}


