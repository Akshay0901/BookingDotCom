package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.DriverUtil;

public class NC_LoginPageLocator extends DriverUtil {
	
	private By email = By.id("Email");
	
	private By password = By.id("Password");
	
	private By loginBtn = By.xpath("//button[@type='submit'");
	
	public void enterEmail(String userNamne) {
		WebElement element = waitUntilElementToBeClickable(email);
		element.sendKeys(userNamne);
		}
	
	public void enterPassword(String passWord) {
		WebElement element = waitUntilElementToBeClickable(password);
		element.sendKeys(passWord);
		}
	
	public void clicklLoginBtn() {
		WebElement element = waitUntilElementToBeClickable(loginBtn);
		element.click();
		}
}
