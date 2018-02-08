package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","username","pswd"})
	
    public void gmaillogin(String url,String username,String pswd)
	{
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(username);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys(pswd);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		
		
	}
	
	

}
