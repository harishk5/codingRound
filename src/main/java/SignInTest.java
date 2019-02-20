import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.SignInPage;
import TestBase.testBase;

public class SignInTest extends testBase {

	@BeforeMethod
	public void setup() {

		//setting the driver
		setDriverPath();
		SIPage = new SignInPage();

		//launching the application
		driver.get(prop.getProperty("url"));

	}

	@Test
	public void invalidSignIn() {

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
