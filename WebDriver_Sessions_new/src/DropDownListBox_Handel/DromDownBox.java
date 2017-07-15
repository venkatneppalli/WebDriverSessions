package DropDownListBox_Handel;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DromDownBox {
	public static void main(String args[])
	{

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.erail.in");
		
		List<WebElement> element=driver.findElements(By.tagName("option"));
		
		int k=element.size();
	//	List<WebElement> j=driver.findElements(By.tagName("option"));
		
		System.out.println("the size of drop down box is   :"+k);
		for(int i=1;i<k;i++)
		{
			
		
		String str=element.get(i).getText();
		System.out.println("**   "+str);

		if(element.get(i).getText().equalsIgnoreCase("Yuva"))
		{
			System.out.println("entering into if condition");
			element.get(i+2).click();
		}
		
		//String[] str1=str.split("\n");
				
		}
		//System.out.println("________________  "+str);
		
		
	/**	for(int i=1;i<=element.size();i++){
			
			
			String strGet=driver.findElement(By.xpath("//*[@id='cmbQuota']")).getText();
			System.out.println(strGet);
			if(strGet.equals("Yuva")){
				
				element.get(i).click();
			}
			
		}**/
		//driver.findElement(By.xpath("//*[@id='cmbQuota']/option[7]")).click();
		
		//driver.close();
		
	
		
	}

}
