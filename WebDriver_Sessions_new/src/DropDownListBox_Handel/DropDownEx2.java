package DropDownListBox_Handel;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class DropDownEx2 
{
	public static void main(String args[])throws Exception
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ttdsevaonline.com/");
		Thread.sleep(3000L);
		List<WebElement>  element=driver.findElements(By.tagName("a"));
		System.out.println("element.size()    "+element.size());
		//System.out.println(driver.getPageSource());
		for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getText());
			if(element.get(i).getText().equalsIgnoreCase("availability"))
			{
			//	Alert alert=driver.switchTo().alert();
			//	driver.findElement(By.xpath("//*[@id='txtEmailID']")).sendKeys("12345678@gmail.com");
			//	driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("12345678");
			//	driver.findElement(By.xpath("//*[@id='imgBtnSubmit']")).click();
				
				
				
				driver.findElement(By.xpath("//*[@id='form1']/div[3]/table[2]/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td[7]/table/tbody/tr[2]/td/a")).click();
				//List<WebElement> element1=driver.findElements(By.tagName("select"));
				//System.out.println("-------------------------------------------------");
				//System.out.println(element1.size());
			}
			
		}
		
		
		
	}
}



























/**public class DropDownEx2
{
	public static void main(String[] args) {
String str="I " +
		"am" +
		" srinivas" +
		" ," +
		" i" +
		" have" +
		" completed" +
		" my" +
		" MCA";
System.out.println("   "+str);
String[] str1=str.split(" ");
int k=str1.length;
System.out.println("the lenth of the string is :"+k);
for(int i=0;i<k;i++)
{
String str2=str1[i];

System.out.println(">>>>>>>"+str2);
}


	}

}
**/