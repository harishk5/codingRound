package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.testBase;

public class HotelBookingPage extends testBase {

	// Page Factory - OR:
	@FindBy(linkText = "Hotels")
	public WebElement hotelLink;

	@FindBy(id = "Tags")
	public WebElement localityTextBox;

@FindBy(id="ui-id-1")
public WebElement locality;

@FindBy(xpath="//a[contains(text(),'18')]")
public WebElement checkInDate;

@FindBy(xpath="//div[contains(@class,'monthBlock first')]//a[contains(@class,'ui-state-default')][contains(text(),'20')]")
public WebElement checkOutDate;

	@FindBy(id = "SearchHotelsButton")
	public WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	public WebElement travellerSelection;

	// Initializing the Page Objects:
	public HotelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickHotelLink() {
		hotelLink.click();
	}
	
	public void typeLocality(String locality) {
		localityTextBox.sendKeys(locality);
	}
	
	public void selectLocality() {
		locality.click();
	}
	
	public void selectCheckinDate() {
		checkInDate.click();
	}
	
	public void selectCheckOutDate() {
		checkOutDate.click();
	}
	
	public void selectTravellerDetail(String TravellerDetail) {
		new Select(travellerSelection).selectByVisibleText(TravellerDetail);
	}
	
	public void clickSearch() {
		searchButton.click();
	}

}
