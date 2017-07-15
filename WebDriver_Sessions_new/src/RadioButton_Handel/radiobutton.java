package RadioButton_Handel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {

	public static void main(String[] args) {
	
		
		WebDriver driver = new FirefoxDriver();
			
		driver.get("http://www.indianrail.gov.in/dont_Know_Station_Code.html");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[17]/td[2]/input"));
		
		element.click();
		
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[17]/td[1]/input"));
		
		
		System.out.println("checked radio button:= "+element1.getAttribute("checked"));
				
		

	}

}
