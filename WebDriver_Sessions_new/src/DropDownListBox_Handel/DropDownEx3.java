package DropDownListBox_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownEx3 {

	
	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.apsrtconline.in");
		List<WebElement> element=driver.findElements(By.tagName("option"));
		System.out.println(element.size());
		for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getText());
			if(element.get(i).getText().equalsIgnoreCase("1"))
			{
				System.out.println(" cursor enter into if condition");
				//driver.findElement(By.xpath("//*[@id='childMale']")).click();
				//driver.findElement(By.xpath("//*[@id='adultMale']")).click();
				element.get(i+3).click();
				
			}
		}
		
	

	}

}
