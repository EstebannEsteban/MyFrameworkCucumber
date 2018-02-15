package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResults extends BasePage {

	public SearchResults(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = ".search_title>span")
	private WebElement searchResultLabel;

	public String getSearchResultLabel() {
		String title = searchResultLabel.getText();
		return title;
	}
}
