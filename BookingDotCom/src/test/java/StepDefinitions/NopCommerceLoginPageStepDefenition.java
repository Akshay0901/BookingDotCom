package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.NC_LoginPageLocator;

public class NopCommerceLoginPageStepDefenition {
	
	NC_LoginPageLocator loginPage = new NC_LoginPageLocator();

	@Given("^User is on Landing Page$")
	public void LaunchNopCommerceSession() {
		
	}
	
	@When("^User enters username$")
	public void enterUsername() {
		loginPage.enterEmail(null);
	}
	@And("^User enters password$")
	public void enterPassword() {
		loginPage.enterPassword(null);
	}
	
	@And("^User clicks log in$")
	public void ClickLogin() {
		loginPage.clicklLoginBtn();
	}
	
	@Then("^User can see dashboard$")
	public void ValidateLogin() {
		
	}
}
