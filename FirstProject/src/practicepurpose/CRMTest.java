package practicepurpose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\myworkspace_selenium\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		
	}

}
