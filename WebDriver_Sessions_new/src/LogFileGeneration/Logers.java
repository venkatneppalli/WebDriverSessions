package LogFileGeneration;

//import org.apache.log4j.Logger;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.log4testng.Logger;





public class Logers {

	
	public static Logger APP_Log;
	
	
	public static void main(String[] args) {
		
		
		APP_Log= Logger.getLogger("devpinoyLogger");
		
		
		APP_Log.debug("Hello");
		System.out.println("Hello");
		
		
		APP_Log.debug("Open FF Browser");
		System.out.println("Hello2");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Hello3");
		APP_Log.debug("Open google url");
		System.out.println("Hello4");
		driver.get("http://www.google.com");
		System.out.println("Hello5");
		System.out.println("Hello Hello");
		

	}

}
