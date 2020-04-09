package com.sprintqa.stepDef;

import com.sprintqa.pages.HomePage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.java.en.Then;

public class HomeSteps extends BaseClass{
	
	HomePage home = new HomePage(getWebDriver());
	
	
	@Then("^verify user is on homepage$")
	public void verify_user_is_on_homepage() throws Throwable {
		home.verifyHomePage();
	}
	
}
