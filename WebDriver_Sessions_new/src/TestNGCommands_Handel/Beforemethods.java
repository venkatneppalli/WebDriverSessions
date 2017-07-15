package TestNGCommands_Handel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforemethods {

	//The annotated method will be run before each test method
	
	@BeforeMethod
	public void sum(){
		
		System.out.println("sum method");
		
	}
	
	@Test
	public void tests(){
		
		System.out.println("tests method");
		
	}
	
	@Test
	public void last(){
		
		System.out.println("last method");
		
	}
	
	@Test
	public void first(){
		
		System.out.println("first method");
		
	}
	
	
	
}
