package TestNGCommands_Handel;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeSuites {
	
	@BeforeSuite
	public void firstmethod(){
		
		System.out.println("firstmethod");
		
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

	@Test
	public void secondmethod5(){
		
		System.out.println("secondmethod5");
		
	}

	
}
