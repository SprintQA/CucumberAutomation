package com.sprintqa.stepDef;

import com.sprintqa.pages.LoginPage;
import com.sprintqa.utils.BaseClass;
import com.sprintqa.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseClass{

	@Given("^user open the website$")
	public void user_open_the_website() throws Throwable {
		getWebDriver().get(ConfigsReader.getProperty("url"));
	}

	@Then("^verify login page is displayed$")
	public void verify_login_page_is_displayed() throws Throwable {
		
	}

	@When("^user login with valid cred$")
	public void user_login_with_valid_cred() throws Throwable {
		LoginPage login = new LoginPage(getWebDriver());
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Then("^verify user is on homepage$")
	public void verify_user_is_on_homepage() throws Throwable {

	}
}
