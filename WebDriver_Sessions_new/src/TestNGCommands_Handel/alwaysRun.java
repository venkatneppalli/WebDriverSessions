package TestNGCommands_Handel;

import org.testng.annotations.Test;

public class alwaysRun {
	
	//If set to true, this test method will always be run even if it depends on a method that failed.
	
	@Test(enabled=false)
	public void firstmethod(){
		
		System.out.println("firstmethod");
		
	}

	@Test(alwaysRun=true)
	public void secondmethod(){
		
		System.out.println("seconfmethod");
				
	}
	
}
