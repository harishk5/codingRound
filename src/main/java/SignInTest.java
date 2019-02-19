import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.SignInPage;
import TestBase.testBase;

public class SignInTest extends testBase {

	@BeforeMethod
	public void setup() {

		setDriverPath();
		SIPage = new SignInPage();

		driver.get(prop.getProperty("url"));

	}

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		SIPage.clickYourTripsMenu();
		SIPage.clickSignInMenu();
		SIPage.clickSignInBtn();
		Assert.assertTrue(SIPage.checkForError().contains("There were errors in your submission"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
