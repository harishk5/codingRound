package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.testBase;

public class FlightBookingPage extends testBase {

	// Page Factory - OR:
	@FindBy(id = "OneWay")
	WebElement oneWayRdBtn;
	
	@FindBy(id = "FromTag")
	WebElement fromCitytxtbox;
	
	@FindBy(xpath = "//*[@id='ui-id-1']/li")
	List<WebElement> originOptionList;
	
	@FindBy(id = "toTag")
	WebElement toCitytxtbox;
	
	@FindBy(xpath = "//*[@id='ui-id-2']/li")
	List<WebElement> destinOptionList;

	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
	WebElement date;
	
	@FindBy(id = "SearchBtn")
	WebElement searchBtn;

	@FindBy(className = "searchSummary")
	WebElement searchResultsHeadertxt;
	
	
	// Initializing the Page Objects:
	public FlightBookingPage(){
		PageFactory.initElements(driver, this);
	}

}
