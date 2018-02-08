package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("chusi chudangane nachesave song"+Keys.ENTER);
	    Thread.sleep(9000);
		driver.close();
		
	}

}
