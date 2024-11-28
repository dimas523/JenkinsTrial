import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

	@Parameters({"broswer"})
	@Test
	public void Parallel(String browser) {
		System.out.println(browser);
	}
}
