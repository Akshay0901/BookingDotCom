package locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;


import Utils.DriverUtil;

public class LandingPageLocators extends DriverUtil {

	private By popup = By.xpath("//button[starts-with(@aria-label, 'Dismiss')]");

	private By signIn = By.xpath("//a[@aria-label='Sign in']");

	private By stayservice = By.linkText("Stays");

	private By flightsService = By.linkText("Flights");
	
	private By offerButton = By.xpath("//a[@aria-label='Search for Early 2025 Deals']");

	public void closePopUp() {

		try {

			pause(5000);

			WebElement element = waitUntilElementToBeClickable(popup);

			element.click();

		}
		catch(TimeoutException ex) {

			System.out.println(ex.getMessage());

		}
	}

	public void clickSignIn() {

		WebElement element = waitUntilElementToBeClickable(signIn);

		element.click();
	}

	public void VerifyStaysService() {

		WebElement element = waitUntilPresenceOfElementLocated(stayservice);
		Assert.assertEquals(element.getText(), "Stays");
	}

	public void VerifyFlightsService() {

		WebElement element = waitUntilPresenceOfElementLocated(flightsService);
		Assert.assertEquals(element.getText(), "Flights");
	}
	
	public void ClicksaveOnStaysOfferButton() {

		WebElement element = waitUntilPresenceOfElementLocated(offerButton);
		element.click();
	}

}