package dev.ranieri.runners;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import dev.ranieri.pages.WikiHomePage;
import junit.framework.Assert;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "dev.ranieri.steps")
public class WikiRunner {
	
	public static WebDriver driver;
	public static WikiHomePage homepage;

	static {
		// sets up my webdriver and creates a homepage object for me to use
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();	
		homepage = new WikiHomePage(driver);
	}
	
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
