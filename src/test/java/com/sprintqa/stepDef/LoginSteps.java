package com.sprintqa.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginSteps {
	// ^ - Start of statement
	// $ - End of statement
	
	WebDriver driver;

	@When("^user open website$")
	public void openWebsite() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@When("^user search with keyword TV$")
	public void user_search_with_keyword_TV() throws Throwable {
	   WebElement searchBox = driver.findElement(By.name("q"));
	   searchBox.sendKeys("TV");
	   WebElement searchBtn = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
	   searchBtn.click();
	}
}
