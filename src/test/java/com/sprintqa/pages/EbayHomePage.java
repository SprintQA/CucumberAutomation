package com.sprintqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.utils.CommonMethods;

public class EbayHomePage extends CommonMethods {

	@FindBy(id = "gh-ac")
	public WebElement searchBox;

	@FindBy(id = "gh-btn")
	public WebElement searchBtn;

	WebDriver driver;

	public EbayHomePage(WebDriver webDriver) {
		driver = webDriver;
		PageFactory.initElements(driver, this);
	}

	public void openEbayWebsite() {
		driver.get("https://www.ebay.co.uk/");
	}

	public void searchWithProduct(String product) {
		waitForElementToPresent(searchBox);
		searchBox.sendKeys(product);
	}

	public void clickOnSearchBtn() {
		searchBtn.click();
	}

}
