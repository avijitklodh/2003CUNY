package dev.ranieri.app;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	public static void main(String[] args) {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		
		try {
		
			
			driver.get("https://orteil.dashnet.org/cookieclicker/");
			
//			WebElement searchbar = driver.findElement(By.name("q"));
//			WebElement searchbtn = driver.findElement(By.name("btnK"));
//			
//			searchbar.sendKeys("New York Mets");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			searchbtn.click();
//			
			
			WebElement bigcookie = driver.findElement(By.id("bigCookie"));
			
			for(int i =0; i<1000; i++) {
				bigcookie.click();
			}
			
		}finally {
			driver.quit();
		}
		
		
		
	}
}
