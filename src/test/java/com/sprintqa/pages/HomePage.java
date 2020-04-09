package com.sprintqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.utils.CommonMethods;

public class HomePage extends CommonMethods{
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminMenu;

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pimMenu;

	@FindBy(id = "menu_leave_viewLeaveModule")
	public WebElement leaveMenu;

	@FindBy(id = "menu_time_viewTimeModule")
	public WebElement timeMenu;
	
	public HomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public void verifyHomePage() {
		waitForElementToPresent(adminMenu);
		Assert.assertTrue("Admin menu is not present on home page", adminMenu.isDisplayed());
		Assert.assertTrue("pim menu is not present on home page", pimMenu.isDisplayed());
	}
	
}
