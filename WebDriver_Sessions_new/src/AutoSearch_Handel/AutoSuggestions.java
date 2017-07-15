package AutoSearch_Handel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class AutoSuggestions {

	
	public static void main(String[] args) {
		
		ProfilesIni profile = new ProfilesIni();
		
		FirefoxProfile ffprofile = profile.getProfile("sample");
		
		WebDriver driver = new FirefoxDriver(ffprofile);
		
		driver.get("http://google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		
		element.sendKeys("testing");
		
		
		String xpstart="//*[@id='gsr']/table/tbody/tr/td[2]/table/tbody/tr[";
		String xpend="]/td/div/table/tbody/tr/td[1]";
			
		for(int i=1;i<5;i++){
		
			WebElement autele= driver.findElement(By.xpath(xpstart+i+xpend));
			System.out.println(autele.getText());
			
			
		}
		
		//*[@id='gsr']/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/table/tbody/tr/td[1]
		

	}

}
