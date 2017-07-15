package TestNGCommands_Handel;

import org.testng.annotations.Test;

public class methodtests {
	
	
	
	
	@Test
	public void firstmethod(){
		System.out.println("firstmethod");
	}

	
	@Test(dependsOnMethods="firstmethod")
	public void thirdmethod(){
		System.out.println("secondmethod");
	}
	
	
	@Test(dependsOnMethods="thirdmethod")
	public void secondmethod(){
		System.out.println("thirdmethod");
	}
	
	
	@Test(dependsOnMethods="secondmethod")
	public void fourthmethod(){
		System.out.println("fourthmethod");
	}
	
	
	
	
}
