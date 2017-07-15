package CheckboxListBox_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class apsrtctest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.apsrtconline.in/oprs-web/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement box1=driver.findElement(By.xpath("//*[@id='serviceClassId']"));
				
		List<WebElement> box2 = box1.findElements(By.tagName("option"));
		
		
		System.out.println("Print list count:= "+box2.size());
		
		
		for(int i=0;i<box2.size();i++){
			
			System.out.println("Print values in list:= "+box2.get(i).getText());
			
		}
		

	}

}
