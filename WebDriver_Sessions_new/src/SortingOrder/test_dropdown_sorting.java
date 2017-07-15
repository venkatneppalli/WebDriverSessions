package SortingOrder;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_dropdown_sorting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//*[@id='cmbQuota']"));
		
		List<WebElement> list = element.findElements(By.tagName("option"));
		
		
		
		for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i).getText());
				
			
		}
		

	}

}
