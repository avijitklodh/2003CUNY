package dev.ranieri.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHomePage {
	
	WebDriver driver;
	
	public WikiHomePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="search")
	public WebElement searchBar;

	@FindBy(className = "pure-button-primary-progressive")
	public WebElement searchBtn;
	
	// one of the better options for getting an element only if Name and Id are not possible
	@FindBy(css = "div[lang='en']")
	public WebElement english;
	
	@FindBy(id = "js-link-box-es")
	public WebElement espanol;
	
	@FindBy(partialLinkText = "Italiano")
	public WebElement italian;
	
	// do not use xpath if avoidable
	@FindBy(xpath = "//*[@id=\"www-wikipedia-org\"]/div[1]/div[6]")
	public WebElement french;
	
	
}
