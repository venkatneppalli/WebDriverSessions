package Alerts_Handel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerttest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.javascripter.net/faq/confirm.htm");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Try it now'][@type='button']")).click();
		
		
		
		Alert alert = driver.switchTo().alert();
		
		String beforeclick = alert.getText();
		
		System.out.println("alert text before click:= "+beforeclick);
		
		//alert.dismiss();
		
		alert.accept();
		
		String afteraccept = alert.getText();
		
		System.out.println("alert text after dismiss:= "+afteraccept);
		
		
		

	}

}
