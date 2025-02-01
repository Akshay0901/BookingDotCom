package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utils.DriverUtil;

public class LandingPageLocators extends DriverUtil {

	private By popup = By.xpath("//button[starts-with(@aria-label, 'Dismiss')]");
	
	private By signIn = By.xpath("//a[@aria-label='Sign in']");

	public void closePopup() {

		WebElement element = waitUntilElementToBeClickable(popup);
		
		element.click();
	}
	
	public void clickSignIn() {
		
		WebElement element = waitUntilElementToBeClickable(signIn);
		
		element.click();
	}

}