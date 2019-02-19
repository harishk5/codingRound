package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.testBase;

public class FlightBookingPage extends testBase {
	
	// Page Factory - OR:
	@FindBy(id = "OneWay")
	public WebElement oneWayRdBtn;
	
	@FindBy(id = "FromTag")
	public WebElement fromCitytxtbox;
	
	@FindBy(xpath = "//*[@id='ui-id-1']/li")
	public List<WebElement> originOptionList;
	
	@FindBy(id = "ToTag")
	public WebElement toCitytxtbox;
	
	@FindBy(xpath = "//*[@id='ui-id-2']/li")
	public List<WebElement> destinOptionList;

	@FindBy(xpath = "//div[contains(@class,'monthBlock last')]//a[contains(@class,'ui-state-default')][contains(text(),'27')]")
	public WebElement date;
	
	@FindBy(id = "SearchBtn")
	public WebElement searchBtn;

	@FindBy(className = "searchSummary")
	public WebElement searchResultsHeadertxt;
	
	
	// Initializing the Page Objects:
	public FlightBookingPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOneWayBtn() {
		oneWayRdBtn.click();
	}
	
	public void typeOriginCity(String origin) {
		fromCitytxtbox.clear();
		fromCitytxtbox.sendKeys(origin);
	}
	
	public void selectOriginCityfromList(String origin) {
		for (WebElement list : originOptionList) {
			if (list.getText().contains(origin)) {
				list.click();
				break;
			}
		}
	}
	
	public void typeDestinCity(String destin) {
		toCitytxtbox.clear();
		toCitytxtbox.sendKeys(destin);
	}
	
	public void selectDestinCityfromList(String destin) {
		for (WebElement list : destinOptionList) {
			if (list.getText().contains(destin)) {
				list.click();
				break;
			}
		}
	}
	
	public void selectDate() {
		date.click();
	}
	
	public void clickSearch() {
		searchBtn.click();
	}
	
	public WebElement verifySearchSummaryHeader() {
		return searchResultsHeadertxt;
	}

}
