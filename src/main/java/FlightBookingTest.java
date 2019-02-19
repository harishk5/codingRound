import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.FlightBookingPage;
import TestBase.testBase;

public class FlightBookingTest extends testBase {

	@BeforeMethod
	public void setup() {

		
		setDriverPath();
		FBPage = new FlightBookingPage();
		
		driver.get(prop.getProperty("url"));

	}

	@Test
	public void testThatResultsAppearForAOneWayJourney() {

		FBPage.clickOneWayBtn();
		FBPage.typeOriginCity("Bangalore");
		FBPage.selectOriginCityfromList("Bangalore");
		FBPage.typeDestinCity("Delhi");
		FBPage.selectDestinCityfromList("Delhi");
		FBPage.selectDate();
		FBPage.clickSearch();
		// verify that result appears for the provided journey search
		Assert.assertTrue(isElementPresent(By.className("searchSummary")));

	}

	
	@AfterMethod
	public void tearDown() {
		// close the browser
		driver.quit();
	}

}
