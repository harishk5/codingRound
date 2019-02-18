package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.testBase;

public class SignInPage extends testBase {

	@FindBy(linkText="Your trips")
	private WebElement yourTripsMenu;

	@FindBy(id="SignIn")
	private WebElement signInMenu;

	@FindBy(id="signInButton")
	private WebElement signInButton;

	@FindBy(id="errors1")
	private WebElement errorTxt;
	
	
	// Initializing the Page Objects:
	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
}
