package HighlightElementInApplication;

//import org.apache.xmlbeans.impl.xb.xsdschema.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class highlightele {

	highlightele h = new highlightele();
	
			
public void clicks(){
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://google.com");
	
	WebElement clickele = driver.findElement(By.xpath("//*[@id='gbqfsa']"));
	
	//h.highlightElement(driver, clickele);
	
	clickele.click();
	
	
	
}
public void highlightElement(WebDriver driver, WebElement element) { 
	
	for (int i = 0; i < 2; i++) { 
		JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: yellow; border: 2px solid yellow;"); js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, ""); 
	}
	
	} 
	
}