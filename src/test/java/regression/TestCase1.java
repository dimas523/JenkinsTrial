package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void creatingDBConn(){
		System.out.println("Connected to DB");
	}
	
	@AfterTest
	public void closeDBConn(){
		System.out.println("Closing DB connection");
	}
	
	@BeforeMethod
	public void launbBrowser() {
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing Browser");
	}
	
	@Test(priority=1, groups = {"function", "smoke"})
	public void doUserReg(){
		try {
		System.out.println("Executing User Reg");
		}catch(Throwable t) {
			System.out.println("Capturing Screenshot");
		}
	}
	
	@Test(priority=2, groups = {"function", "smoke"})
	public void doLogin(){
		System.out.println("Executing Login");
	}
}
 