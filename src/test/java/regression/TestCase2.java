package regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
	
	SoftAssert softAssert = new SoftAssert();
	@Test
	public void validateTitles() {
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
		
		System.out.println("will print");
		softAssert.assertEquals(true, false, "print is not what?");
		
		System.out.println("validating title");
		softAssert.assertEquals(expected_title, actual_title, "title incorrect");
		
		System.out.println("validating image");
		softAssert.assertEquals(true, false, "image not found");
		
		softAssert.assertAll();
	}

}
