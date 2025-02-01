package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeManager implements DriverManager{

	@Override
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 
		 return new ChromeDriver();
		 
	}

}
