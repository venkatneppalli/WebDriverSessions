package Alerts_Handel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertokcancel {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.javascripter.net/faq/confirm.htm");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/p[1]/table/tbody/tr/td[1]/form/input")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(4000);
		
		alert.dismiss();
		
		System.out.println(alert.getText());
		
		

	}

}
