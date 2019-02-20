package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath="//iframe[@class='spinnerMedium']")
	public WebElement signInFrame;
	
	
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
		
		wait = new WebDriverWait(driver, 30);
		driver.switchTo().frame(signInFrame);
		wait.until(ExpectedConditions.visibilityOf(signInButton));
		signInButton.click();
	}
	
	public String checkForError() {
		String error = errorTxt.getText();
		return error;
	}
	
}