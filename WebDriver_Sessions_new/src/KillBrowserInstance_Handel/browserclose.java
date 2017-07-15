package KillBrowserInstance_Handel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserclose {

	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		
		Process p = Runtime.getRuntime().exec("tasklist");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		
		while ((line = in.readLine()) != null) {
				if(line.contains("firefox")) {						
					Runtime.getRuntime().exec("taskkill /IM firefox.exe /f");
					break;
			}

		}
		
	}

}
