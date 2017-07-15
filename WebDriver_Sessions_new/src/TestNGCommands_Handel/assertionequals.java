package TestNGCommands_Handel;

import org.testng.Assert;
import org.testng.annotations.Test;



public class assertionequals {
	
	@Test
	public void googleTitle(){
		
		System.out.println("Assertion Before");
		String expect_tit="google";
		String actual_tit="google";
		
		Assert.assertEquals(expect_tit,actual_tit);
		
		
	}

}
