package firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriverFunction {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"E:\\myworkspace_selenium\\software\\FireFoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.close();
	}

}
