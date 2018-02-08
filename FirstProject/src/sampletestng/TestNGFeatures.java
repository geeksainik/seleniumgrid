package sampletestng;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	/*
     This is to show the dependencies between the test cases if a test case is depend on another test case and that is failed then it will ignored*/
	
     
	@Test(priority=2,groups="logintest")
	public void logintest()
	{
		System.out.println("Thisislogin");
		//int x= 9/0;
		//System.out.println(x);
	
	}
	
	@Test(dependsOnMethods="logintest",priority=3,groups="logintest")
	public void homepageTest()
	
	{
		
	System.out.println("This is homepage");
	
	}
	
	@Test(priority=1)
	
	public void settingpage()
	{
		System.out.println("This is setting page");
	}
	
	

}
