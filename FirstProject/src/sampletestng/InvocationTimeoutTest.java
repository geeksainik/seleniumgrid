package sampletestng;

import org.testng.annotations.Test;

public class InvocationTimeoutTest {
	
	@Test(invocationTimeOut=2)
	public void countcheck()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}

}
