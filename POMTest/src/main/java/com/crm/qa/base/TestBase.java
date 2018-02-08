package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		
	try {
		prop=new Properties();
		FileInputStream is=new FileInputStream("E:\\myworkspace_selenium\\POMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
	    prop.load(is);
	    }catch(FileNotFoundException e) {
	    	
	    	e.printStackTrace();
	    }catch(IOException e) {
	    	
	    e.printStackTrace();
	    }
	}
	public void initialization()
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
		     driver=new ChromeDriver();
		}else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\myworkspace_selenium\\software\\FireFoxdriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoad_TimeOuts,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicitly_Wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}	
		
	}


		
	
	


