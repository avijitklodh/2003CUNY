package dev.ranieri.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dev.ranieri.pages.WikiHomePage;
import dev.ranieri.runners.WikiRunner;
import junit.framework.Assert;

public class WikiSearchSteps {
	
	public static WebDriver driver = WikiRunner.driver;
	public static WikiHomePage homepage = WikiRunner.homepage;
	
	@When("^The user types \"([^\"]*)\" into search bar$")
	public void the_user_types_into_search_bar(String query) throws Throwable {
		homepage.searchBar.sendKeys(query);
	}

	@When("^The user clicks on search button$")
	public void the_user_clicks_on_search_button() throws Throwable {
		homepage.searchBtn.click();
	}

	@Then("^The title should be \"([^\"]*)\"$")
	public void the_title_should_be(String arg) throws Throwable {
		Assert.assertEquals(arg, driver.getTitle());
	}


}
