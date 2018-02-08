package sampletestng;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=5)
	public void countcheck()
	{
		System.out.println("This is to check InvocationCount Keyword");
	}
}
