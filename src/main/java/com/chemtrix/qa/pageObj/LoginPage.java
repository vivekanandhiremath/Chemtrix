package com.chemtrix.qa.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class LoginPage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);

	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement emailField;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;

	@FindBy(xpath = "//button[contains(.,'Log In')]")
	private WebElement loginButton;

	public void enterEmailAddress(String emailText) {

		elementUtils.typeTextIntoElement(emailField, emailText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterPassword(String passwordText) {

		elementUtils.typeTextIntoElement(passwordField, passwordText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public HomePage clickOnLoginButton() {

		elementUtils.clickOnElement(loginButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new HomePage(driver);

	}

	public void loginWithValidCredential(String emailText, String passwordText) {
		elementUtils.typeTextIntoElement(emailField, emailText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.typeTextIntoElement(passwordField, passwordText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

}