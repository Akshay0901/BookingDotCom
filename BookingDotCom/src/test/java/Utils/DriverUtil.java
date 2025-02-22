package Utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.Driver;
import Driver.DriverFactory;

public class DriverUtil {

	public WebDriver driver = null;

	private static JavascriptExecutor jse;

	private static WebDriverWait wait;

	public void launchSession(String url) {

		WebDriver driverParam = DriverFactory.getDriverManager("chrome").getDriver();

		Driver.getDriverInstance().setDriver(driverParam);

		driver = Driver.getDriverInstance().getDriver();
		
		jse = (JavascriptExecutor) driver;
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get(url);

		driver.manage().window().maximize();

	}

	public WebElement waitUntilElementToBeClickable(By locator) {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		executionOrder(element);
		return element;
	}
	public WebElement waitUntilPresenceOfElementLocated(By locator) {

		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		executionOrder(element);
		return element;
	}

	public void scrollToElement(WebElement element) {

		jse.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", element);
	}

	public void highLightElement(WebElement element) {

		jse.executeScript("arguments[0].setAttribute('style', 'border: 4px solid green;');", element);
	}

	public void removeHighLightElement(WebElement element) {

		jse.executeScript("arguments[0].setAttribute('style', 'border: 4px solid white;');", element);
	}

	public void pause() {

		try {
			TimeUnit.MILLISECONDS.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void closeSession() {

		Driver.getDriverInstance().closeDriver();

	}

	public void executionOrder(WebElement element) {

		scrollToElement(element);
		
		highLightElement(element);
		
		pause();
		
		removeHighLightElement(element);
		
		pause();
	}

}
