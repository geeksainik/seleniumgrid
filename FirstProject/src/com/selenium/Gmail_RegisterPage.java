package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Gmail_RegisterPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/SignUp");
		driver.findElement(By.id("FirstName")).sendKeys("dfggdd");
		driver.findElement(By.id("LastName")).sendKeys("jkhdj");
		driver.findElement(By.id("GmailAddress")).sendKeys("hjkdhajkhad@kjdfs.com");
		driver.findElement(By.id("Passwd")).sendKeys("hdbfjk");
		driver.findElement(By.id("PasswdAgain")).sendKeys("hjkfhrf");
		//WebElement e = driver.findElement(By.xpath("//*[@id='BirthMonth']"));
		//e.click();
		//driver.findElement(By.xpath("//*[@id='BirthMonth']/div[2]/div/div[./text()='May']")).click();
        //driver.findElement(By.xpath("//*[@id='BirthMonth']/following::div[text()='May']")).click();
		WebElement e=driver.findElement(By.xpath("//*[@id='BirthMonth']/div"));
		Actions a=new Actions(driver);
		a.click(e).build().perform();
		a.sendKeys("Nov").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("BirthDay")).sendKeys("29");
		driver.findElement(By.id("BirthYear")).sendKeys("1989");
		driver.findElement(By.xpath("//*[@title='Gender']")).click();
		a.sendKeys("f").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9865432897");
		
		
		
		
	}

}
