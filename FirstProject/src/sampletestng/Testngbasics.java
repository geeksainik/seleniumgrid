package sampletestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngbasics {
	
	@BeforeSuite
	public void suite()
	{
		System.out.println("This is @Beforesuite");
		
	}
	@BeforeTest
	public void test()
	{
		System.out.println("This is @BeforeTest");
	}
	@BeforeClass
	public void classtest()
	{
		System.out.println("This is @BeforeClass");
	}
	@BeforeMethod
	public void method()
	{
		System.out.println("This is @BeforeMethod");
	}
	@Test
	public void testsample()
	{
		System.out.println("This is @Test");
		
	}
	@AfterMethod
	public void methodsample()
	{
		System.out.println("This is @AfterMethod");
	}
	@AfterClass
	public void classsamp()
	{
		System.out.println("This is @AfterClass");
	}
	@AfterTest
	public void testsamp()
	{
		System.out.println("This is @AfterTest");
	}

}
