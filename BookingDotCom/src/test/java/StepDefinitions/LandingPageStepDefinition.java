package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.LandingPageLocators;

public class LandingPageStepDefinition {

	LandingPageLocators landingPage = new LandingPageLocators();

	@Given("^User is on Landing Page$")
	public void launchSession() {
		landingPage.launchSession("https://www.booking.com/");

	}

	@When("^user clicks Sign In$")
	public void clickSignIn() {
		landingPage.clickSignIn();

	}

	@Then("^user closes browser$")
	public void closeBrowser() {

		landingPage.closeSession();

	}

	@When("^user dismisses popup$")
	public void dismissPopup() {
		landingPage.closePopup();

	}

}
