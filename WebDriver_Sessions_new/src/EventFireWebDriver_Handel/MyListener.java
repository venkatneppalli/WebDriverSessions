package EventFireWebDriver_Handel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class MyListener extends AbstractWebDriverEventListener{

	
	
	public void afterNavigateBack(WebDriver web_driver){
		
		System.out.println("Hello");
		
	}
	
}
