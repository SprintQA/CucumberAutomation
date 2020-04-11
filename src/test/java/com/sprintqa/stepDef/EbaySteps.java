package com.sprintqa.stepDef;

import com.sprintqa.pages.EbayHomePage;
import com.sprintqa.utils.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class EbaySteps extends BaseClass{
	
	EbayHomePage ebayHome = new EbayHomePage(getWebDriver());
	
	@Given("^user open ebay website$")
	public void user_open_ebay_website() throws Throwable {
		ebayHome.openEbayWebsite();
	}

	@When("^user search with keyword \"([^\"]*)\"$")
	public void user_search_with_keyword(String product) throws Throwable {
		ebayHome.searchWithProduct(product);
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
		ebayHome.clickOnSearchBtn();
	}
}
