package dev.ranieri.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dev.ranieri.pages.WikiHomePage;
import dev.ranieri.runners.WikiRunner;
import junit.framework.Assert;

public class WikiLangSteps {
	
	public static WebDriver driver = WikiRunner.driver;
	public static WikiHomePage homepage = WikiRunner.homepage;
		
	@Given("^The user is on the Wikipedia homepage$")
	public void the_user_is_on_the_Wikipedia_homepage() throws Throwable {
	   driver.get("https://www.wikipedia.org/");
	}

	@When("^The user clicks on English$")
	public void the_user_clicks_on_English() throws Throwable {
	    homepage.english.click();
	}

	@Then("^The user should be on the Enlish home page$")
	public void the_user_should_be_on_the_Enlish_home_page() throws Throwable {
		Assert.assertEquals("Wikipedia, the free encyclopedia", driver.getTitle());
	}
	
	@When("^The user clicks on Spanish$")
	public void the_user_clicks_on_Spanish() throws Throwable {
		homepage.espanol.click();
	}

	@Then("^The user should be on the Spanish homepage$")
	public void the_user_should_be_on_the_Spanish_homepage() throws Throwable {
		Assert.assertEquals("Wikipedia, la enciclopedia libre", driver.getTitle());
	}



}
