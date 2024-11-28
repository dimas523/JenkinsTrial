package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseTest.BaseTest;

public class TestCase1 extends BaseTest {
	
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
	
	@Test(priority=1)
	public void edoLogin(){
		System.out.println("Logging in");
	}
	
	@Test(priority=2)
	public void doLogin(){
		System.out.println("Logging in ado");
	}
}
 