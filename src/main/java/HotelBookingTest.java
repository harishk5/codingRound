import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HotelBookingPage;
import TestBase.testBase;

public class HotelBookingTest extends testBase {

	@BeforeMethod
	public void setup() {

		//setting the driver
		setDriverPath();
		HBPage = new HotelBookingPage();

		//launching the application
		driver.get(prop.getProperty("url"));

	}

	@Test
	public void hotelSearchBookingTest() {

		HBPage.clickHotelLink();
		HBPage.typeLocality("Indiranagar, Bangalore");
		HBPage.selectLocality();
		
		HBPage.selectCheckinDate();
		HBPage.selectCheckOutDate();
		
		HBPage.selectTravellerDetail("1 room, 2 adults");
		HBPage.clickSearch();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
