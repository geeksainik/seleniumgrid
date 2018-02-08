package sampletestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.google.co.in");
	}
	@Test
	public void googleTitleTest()
	{
		String s= driver.getTitle();
		Assert.assertEquals(s,"Google","Title Do not Match");
		
	}
	@Test
	public void logoTest()
	{
		 boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
		 System.out.println("Logo Displayed");
		 Assert.assertTrue(b);
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
