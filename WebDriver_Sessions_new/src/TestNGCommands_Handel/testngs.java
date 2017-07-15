package TestNGCommands_Handel;

import org.junit.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.Ignore;

public class testngs {
	
	@BeforeSuite
	public void beforesuite(){
		
		System.out.println("Before suite");
		
	}
	
	
	@BeforeClass
	public void beforclass(){
		
		System.out.println("BeforeClass testclass");
	}
	
	@AfterClass
	public void afterclass(){
		
		System.out.println("AfterClass class");
	}
	
	@BeforeTest(alwaysRun=false)
	public void openconnection(){
		
		System.out.println("Before Test open connection");
	}
	
	@AfterTest
	public void closeconnection(){
		
		System.out.println("After Test close connection");
	}
	
	@BeforeMethod
	public void openBrowser(){
		
		System.out.println("Before Method open browser");
	}
	
	@AfterMethod
	public void closeBrowser(){
		
		System.out.println("After Method close Browser");
		
	}
	@Test(enabled = false)
	public void login(){
		
		System.out.println("Test login");
	}
	
	@Test
	public void register(){
		
		System.out.println("Test register");
		
	}
	

}
