package TestNGCommands_Handel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTests {
	
	@BeforeTest
	public void firstmethod(){
		
		System.out.println("BeforeTest");
		
	}

	@Test
	public void secondmethod1(){
		
		System.out.println("secondmethod1");
		
	}
	
	@Test
	public void secondmethod2(){
		
		System.out.println("secondmethod2");
		
	}

	@Test
	public void secondmethod3(){
		
		System.out.println("secondmethod3");
		
	}

	@Test
	public void secondmethod4(){
	
	System.out.println("secondmethod4");
	
		
	}
	@BeforeMethod
	public void beforemethods(){
		
		System.out.println("beforemethods");
		
	}
	
}
