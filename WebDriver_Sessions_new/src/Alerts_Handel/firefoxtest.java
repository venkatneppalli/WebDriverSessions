package Alerts_Handel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxtest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.carwale.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='new-cars']/div[2]/div[1]/input")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(4000);
		
		System.out.println("message on alert box:= "+alert.getText());
		
		alert.accept();
		

	}

}
