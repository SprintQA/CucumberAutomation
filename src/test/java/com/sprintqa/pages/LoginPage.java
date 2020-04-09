package com.sprintqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sprintqa.utils.CommonMethods;
import com.sprintqa.utils.ConfigsReader;

public class LoginPage extends CommonMethods {

	@FindBy(id = "txtUsername")
	public WebElement userNameField;

	@FindBy(name = "txtPassword")
	public WebElement passwordField;

	@FindBy(id = "btnLogin")
	public WebElement loginBtn;

	@FindBy(id = "frmLogin")
	public WebElement loginFrm;

	@FindBy(css = "img[src*='logo.png']")
	public WebElement logo;

	@FindBy(xpath = "//span[@id='spanMessage']")
	public WebElement invalidLoginErrorMsg;
	
	WebDriver driver;
	
	public LoginPage(WebDriver webDriver) {
		driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}
	
	public void doLogin(String user, String pass) {
		sendText(userNameField, user);
		sendText(passwordField, pass);
		submitForm(loginFrm);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void openWebsite() {
		driver.get(ConfigsReader.getProperty("url"));
	}
	
	public void verifyLoginPage() {
		waitForElementToPresent(userNameField);
		Assert.assertTrue("Username field is not present on login page", userNameField.isDisplayed());
		Assert.assertTrue("Password field is not present on login page", passwordField.isDisplayed());
	}
	
	public void verifyInvalidLoginErrorMessage() {
		waitForElementToPresent(invalidLoginErrorMsg);
		Assert.assertTrue("Invalid login error is not present on login page", invalidLoginErrorMsg.isDisplayed());
	}
	
	
}












