import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestCases {
	@Test
	public void CheckLoginPage() {
		

		Assert.assertEquals(1236, 1236);

	}

	@Test
	public void CheckLoginPage3() {
		Assert.assertEquals("Please enter valid email. ", "blank not allowed");
	}

	@Test
	public void CheckLoginPage4() {
		Assert.assertEquals("Please enter password.", "blank not allowed");
	}
	

}
