package parallelTesting;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

	@Parameters({"browser"})
	@Test
	public void Parallel(String browser) throws InterruptedException {
		System.out.println(browser);
		Thread.sleep(5000);
	}
}
