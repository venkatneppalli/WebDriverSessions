package AutoSearch_Handel;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlesearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		//WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		//ele.sendKeys("camera");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("camera");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement table = driver.findElement(By.xpath("//*[contains(@class,'gssb_m')]"));
		List<WebElement> lstrow = table.findElements(By.tagName("tr"));
		System.out.println(lstrow.size());
		
		
int i=0;
while(i<lstrow.size()){
	
	System.out.println(lstrow.get(i).getText());
	if(lstrow.get(i).getText().equals("testingken")){
	
		lstrow.get(i).click();
		System.out.println("Clicked on testingken");
		break;
		
	}
	
	i=i+2;
	
}



	
	

		

	}

	

}
