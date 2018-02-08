package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class GmailLogin_ExcelTest {
	 WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com/gmail/");
	}

		
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testdata=TestUtil.getDataFromExcel();
		return testdata.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void gmaillogintest(String emailid,String pswd)
	{
		driver.findElement(By.id("identifierId")).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		driver.findElement(By.name("password")).sendKeys(pswd);
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		Boolean value=driver.findElement(By.partialLinkText("Inbox")).isDisplayed();
		Assert.assertTrue(value);
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	

}
