package com.sprintqa.stepDef;

import com.sprintqa.pages.LoginPage;
import com.sprintqa.utils.BaseClass;
import com.sprintqa.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends BaseClass{

	LoginPage login = new LoginPage(getWebDriver());
	
	@Given("^user open the website$")
	public void user_open_the_website() throws Throwable {
		login.openWebsite();
	}

	@Then("^verify login page is displayed$")
	public void verify_login_page_is_displayed() throws Throwable {
		login.verifyLoginPage();
	}

	@When("^user login with valid cred$")
	public void user_login_with_valid_cred() throws Throwable {
		login.doLogin(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}
	
	@When("^user login with invalid cred$")
	public void user_login_with_invalid_cred() throws Throwable {
		login.doLogin("12345","12345");
	}

	@Then("^verify login is unsuccessful$")
	public void verify_login_is_unsuccessful() throws Throwable {
	    login.verifyInvalidLoginErrorMessage();
	}
	
	@When("^user login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_with_username_and_password(String usernameKey, String passwordKey) throws Throwable {
		login.doLogin(ConfigsReader.getProperty(usernameKey), ConfigsReader.getProperty(passwordKey));
	}


}
