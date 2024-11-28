package invocationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public WebDriver driver = null;
	
	public WebDriver getDriver(String b) {
		if(b.equals("chrome")) {
			driver = new ChromeDriver();

		} else {
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	
}
