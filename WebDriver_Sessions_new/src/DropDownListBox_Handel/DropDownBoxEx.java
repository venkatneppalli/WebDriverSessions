package DropDownListBox_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownBoxEx {


	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.zylog.co.in/");
		driver.findElement(By.xpath("//*[@id='block-menu-secondary-links']/div/ul/li[1]/a")).click();
		//List<WebElement> element=driver.findElements(By.tagName("Option"));
		//System.out.println("    ---->>>   "+element.size());
		//driver.close();
		////*[@id="block-block-33"]/p/div/div/a

	}

}
