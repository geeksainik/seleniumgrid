package sampletestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
	
	@Test(priority=2)
	public void logocheck()
	{
		 driver.findElement(By.id("hplogo")).isDisplayed();
		 System.out.println("Logo Displayed");
		
	}
	@Test(priority=1)
	
	public void signcheck()
	{
	    driver.findElement(By.linkText("Sign in")).isDisplayed();
	    System.out.println("Signin Link Exist");
	   
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
