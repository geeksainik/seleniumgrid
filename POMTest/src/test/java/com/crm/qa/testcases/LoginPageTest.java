package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginInPage;

public class LoginPageTest extends TestBase{
	
   LoginInPage loginpage;
   HomePage homepage;
	//constructor
	LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginInPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title,"#1 Free CRM for Any Business: Online Customer Relationship Software");
	}
	@Test(priority=2)
	public void crmLogoImageTest()
	{
		Boolean value=loginpage.ValidateCRMImage();
	    Assert.assertTrue(value);
	}
	@Test(priority=3)
	public void loginTest()
	{
		homepage= loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
