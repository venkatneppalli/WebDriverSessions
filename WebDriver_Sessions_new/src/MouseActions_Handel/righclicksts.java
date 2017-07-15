package MouseActions_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class righclicksts {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://medialize.github.io/jQuery-contextMenu/demo/input.html");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id='container']/div"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(ele).perform();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//*[contains(text(),'Save link as...')]")).click();

		WebElement list = driver.findElement(By.tagName("select"));
		
		List<WebElement> elements = list.findElements(By.tagName("option"));
		
		
		for(int i=0;i<elements.size();i++){
			
			System.out.println("Print values:= "+elements.get(i).getText());
			
			if(elements.get(i).getText().equals("three")){
				
				elements.get(i).click();
			}
			
		}
		
		//select[@name='context-menu-input-select']
		
		//two
		
	}

}
