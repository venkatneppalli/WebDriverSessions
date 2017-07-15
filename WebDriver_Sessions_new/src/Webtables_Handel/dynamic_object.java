package Webtables_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamic_object {

	
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		
		//*[@id='gbqfsa']
		
		WebElement ele = driver.findElement(By.xpath("//*[text()='Google Search']"));
		
		System.out.println("lable text:= "+ele.getText());
		
		//*[text()='Google Search']
		
		
		
		//*[@id="txttxtUsername"]
		

		//*[contain(@id,'_txtUserName')]
		
		//*[@id='ctl00_ctl39_txtPassword']
		
		
		//*[@id="language-select"]/li[1]/a
		
	}

}
