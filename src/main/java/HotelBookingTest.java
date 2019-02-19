import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pages.HotelBookingPage;
import TestBase.testBase;

public class HotelBookingTest extends testBase {

    HotelBookingPage HBPage = new HotelBookingPage();

    @Test
    public void shouldBeAbleToSearchForHotels() {
    	setDriverPath();

        driver.get(prop.getProperty("url"));
        HBPage.hotelLink.click();

        HBPage.localityTextBox.sendKeys("Indiranagar, Bangalore");

        new Select(HBPage.travellerSelection).selectByVisibleText("1 room, 2 adults");
        HBPage.searchButton.click();

        driver.quit();

    }

    

}
