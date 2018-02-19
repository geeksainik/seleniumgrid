package gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		
		
		String hubUrl="http://192.168.0.103:4444/wd/hub";
		WebDriver driver=new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		//driver.close();

	}

}

/*for Setting hub through cmd:
D:\selenium server jar>java -jar selenium-server-standalone-3.9.1.jar -role hub

For Setting Node through cmd:
D:\selenium server jar>java -Dwebdriver.chrome.driver="E:\myworkspace_selenium\software\chromedriver\chromedriver.exe" 
-jar selenium-server-standalone-3.9.1.jar -role node -hub http://192.168.0.103:4444/grid/register


















*/