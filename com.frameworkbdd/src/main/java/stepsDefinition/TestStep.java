package stepsDefinition;

import org.junit.Assert;

import Pages.BaseTest;
import Pages.MainPage;
import Pages.SearchResults;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep extends BaseTest {

	MainPage mainPage;
	SearchResults searchResults;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mainPage = navigateToMainPage();
	}

	@When("^User search for \"(.*)\" product$")
	public void user_search_for_product(String product) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		mainPage.setSearchTextBox(product);
		searchResults = mainPage.clickSearchButton();

	}

	@Then("^Title \"(.*)\" is displayed$")
	public void title_is_displayed(String product) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(searchResults.getSearchResultLabel().equals(product));
	}

	// Implementaciones del examen

	@Given("^a valid user logged into the application$")
	public void a_valid_user_logged_into_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the user select the from ‘GBP’ currency$")
	public void the_user_select_the_from_GBP_currency() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the user select the to ‘EUR’ currency$")
	public void the_user_select_the_to_EUR_currency() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^user enter the amount to convert$")
	public void user_enter_the_amount_to_convert() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^the user press Convert button$")
	public void the_user_press_Convert_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the user can see the result conversion in the screen$")
	public void the_user_can_see_the_result_conversion_in_the_screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^the user can see the ‘convert again’ button displayed$")
	public void the_user_can_see_the_convert_again_button_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
