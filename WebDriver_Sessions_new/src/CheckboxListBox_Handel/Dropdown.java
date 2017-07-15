package CheckboxListBox_Handel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Dropdown {

	
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.ie.driver", "C:\\jars\\IEDriver2.28\\IEDriverServer.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\jars\\ChromeDriver\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new InternetExplorerDriver();
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("http://erail.in");
		
		driver.manage().window().maximize();
		
		
		WebElement element = driver.findElement(By.tagName("select"));
		//element.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> lst = element.findElements(By.tagName("option"));
		
		for(int i=0;i<lst.size();i++){
			
			System.out.println(lst.get(i).getText());
			if(lst.get(i).getText().equals("Yuva")==true){
				
				lst.get(i).click();
				System.out.println("clicked on Yuva");
				
			}
			
			
		}
		
	}

}
