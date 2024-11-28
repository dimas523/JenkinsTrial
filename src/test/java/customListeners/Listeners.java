package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed Test -" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\Claud\\Pictures\\Camera Roll\\lol.jpg\">ScreenShot Link</a>");
		Reporter.log("<a href=\"C:\\Users\\Claud\\Pictures\\Camera Roll\\lol.jpg\"><img width =200 height = 200 src =\"C:\\Users\\Claud\\Pictures\\Camera Roll\\lol.jpg\" /> </a>");
		System.out.println("Capturing Screenshot for the Failed Test" + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
