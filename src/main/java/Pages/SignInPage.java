package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.testBase;

public class SignInPage extends testBase {

	@FindBy(linkText="Your trips")
	public WebElement yourTripsMenu;

	@FindBy(id="SignIn")
	public WebElement signInMenu;

	@FindBy(id="signInButton")
	public WebElement signInButton;

	@FindBy(id="errors1")
	public WebElement errorTxt;
	
	
	// Initializing the Page Objects:
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickYourTripsMenu() {
		yourTripsMenu.click();
	}
	
	public void clickSignInMenu() {
		signInMenu.click();
	}
	
	public void clickSignInBtn() {
		signInButton.click();
	}
	
	public String checkForError() {
		String error = errorTxt.getText();
		return error;
	}
	
}
