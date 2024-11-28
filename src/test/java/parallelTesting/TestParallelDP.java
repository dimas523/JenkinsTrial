package parallelTesting;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParallelDP {

	@Test(dataProvider="getData")
	public void doLogin(String b) throws InterruptedException {
		Date d = new Date();
		System.out.println("Broswe name : " +b+"--"+d);
		Thread.sleep(3000);
	}
	
	@DataProvider(parallel=true)
	public Object[][] getData(){
		Object[][] o = new Object[2][1];
		o[0][0] = "firefox";
		o[1][0] = "chrome";
		
		return o;
	}
}
