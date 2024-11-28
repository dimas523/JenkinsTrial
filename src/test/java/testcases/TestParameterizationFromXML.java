package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestParameterizationFromXML {

	@Parameters({"browser","env"})
	@Test
	public void getBrowser(String browser, String env) {
		System.out.println(browser);
		System.out.println(env);
	}
}
