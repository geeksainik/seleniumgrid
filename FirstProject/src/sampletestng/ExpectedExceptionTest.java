package sampletestng;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

	@Test(expectedExceptions=NumberFormatException.class)
	public void expectioncheck()
	{
		String s="100A";
		System.out.println(Integer.parseInt(s));
		
	}
	
}
