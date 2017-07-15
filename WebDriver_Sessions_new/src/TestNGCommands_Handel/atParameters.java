package TestNGCommands_Handel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class atParameters {

	@Test
	@Parameters(value="number")
	public void parameterIntTest(int number) {
	   System.out.println("Parameterized Number is : " + number);
	}
	
	
	
}
