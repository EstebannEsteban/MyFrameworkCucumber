package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	private MainPage mainPage;
	WebDriver driver;

	public MainPage navigateToMainPage() {
		driver = new FirefoxDriver();
		return new MainPage(driver);
	}
}
