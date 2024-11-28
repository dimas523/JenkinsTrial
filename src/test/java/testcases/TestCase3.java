package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;

public class TestCase3 extends BaseTest{

	@Test(priority = 1)
	public void doUserReg() {
		System.out.println("Executing user reg");
//		Assert.fail("User not registered succesfully");
	}
	
	@Test(priority = 2,dependsOnMethods = "doUserReg")
	public void doLogin(){
		System.out.println("Log in succesful");
	}
	
	@Test(priority = 3,dependsOnMethods = "doUserReg")
	public void test3() {
		System.out.println("Executing 3rd test");
	}
	
	@Test(priority = 4,dependsOnMethods = "doUserReg",alwaysRun = true , groups = "bvt")
	public void test4(){
		System.out.println("Executing 4th test");
	}
	
	
	
}
