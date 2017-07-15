package TestNGCommands_Handel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class priority {

	//The priority for this test method. Lower priorities will be scheduled first.
	
	@BeforeMethod
	public void sum(){
		
		System.out.println("sum method");
		
	}
	
	@Test(priority=3)
	public void tests(){
		
		System.out.println("tests method");
		
	}
	
	@Test(priority=2)
	public void last(){
		
		System.out.println("last method");
		
	}
	
	@Test(priority=1)
	public void first(){
		
		System.out.println("first method");
		
	}
	
	
}
