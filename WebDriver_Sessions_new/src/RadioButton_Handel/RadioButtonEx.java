package RadioButton_Handel;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonEx {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.indianrail.gov.in");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[2]/a")).click();
		//driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/table[1]/tbody/tr[18]/td[2]/input")).click();
		//System.out.println("-----------------------------------------------");
		List<WebElement> element=driver.findElements(By.tagName("input"));
		System.out.println(element.size());
		int j=0;
		for(int i=0;i<element.size();i++)
		{
			
			//System.out.println(element.get(i).getAttribute("type"));
			if(element.get(i).getAttribute("type").equalsIgnoreCase("radio"))
			{
				//System.out.println("entering into if condition");
				System.out.println(element.get(i).getTagName());
				j++;
			}
		
		}
		
		System.out.println("the number of radio buttons are  :"+j);

	}

}
