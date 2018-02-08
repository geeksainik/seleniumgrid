package firstpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//dummy class
public class Gmailtest {

	public static void main(String[] args) 
	{

		
		System.setProperty("webdriver.chrome.driver","E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/gmail/");
		
		driver.findElement(By.id("identifierId")).sendKeys("sairam9.om@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		driver.findElement(By.name("password")).sendKeys("omsairam29");
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		Boolean value=driver.findElement(By.partialLinkText("Inbox")).isDisplayed();
		if(value.equals(true))
		{
			System.out.println("TestCasePassed");
		}
		
		driver.close();
	}

}
