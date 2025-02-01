package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.DriverUtil;

public class SignInPageLocator extends DriverUtil {

	private By userName = By.name("username");
	
	public void enterUserName() {
		
	WebElement element = waitUntilPresenceOfElementLocated(userName);
	
	element.sendKeys("test@gmail.com");
		
	}
	
}
