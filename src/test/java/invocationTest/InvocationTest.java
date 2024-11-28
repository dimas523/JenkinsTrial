package invocationTest;

import org.testng.annotations.Test;

public class InvocationTest extends BaseTest{
	
	@Test(invocationCount=5,threadPoolSize=5)
	public void testings() {
		driver = getDriver("chrome");
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		//driver.quit();
		
	}

}
