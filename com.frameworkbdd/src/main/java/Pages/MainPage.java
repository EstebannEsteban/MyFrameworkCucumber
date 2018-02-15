package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

	public MainPage(WebDriver driver) {
		super(driver);
		driver.get("http://www.carrefour.es");
	}

	@FindBy(css = "#atg_store_searchInput")
	private WebElement searchTextBox;

	@FindBy(css = ".icon-search")
	private WebElement searchButton;

	public void setSearchTextBox(String value) {
		searchTextBox.clear();
		searchTextBox.sendKeys(value);
	}

	public SearchResults clickSearchButton() {
		searchButton.click();
		return new SearchResults(getDriver());

	}

}
