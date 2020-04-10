package com.sprintqa.stepDef;

import org.openqa.selenium.By;

import com.sprintqa.utils.BaseClass;

import cucumber.api.java.en.Given;

public class GoogleSearch extends BaseClass {

	@Given("^user open the google$")
	public void user_open_the_google() throws Throwable {
		getWebDriver().get("https://www.google.com");
	}

	@Given("^search with keyword TV$")
	public void search_with_keyword_TV() throws Throwable {
		getWebDriver().findElement(By.name("q")).sendKeys("TV");
		getWebDriver().findElement(By.xpath("(//input[@name='btnK'])[3]")).isDisplayed();
	}

}
