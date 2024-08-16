package com.chemtrix.qa.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class AccountPage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public AccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);

	}

	@FindBy(linkText = "Edit your account information")
	private WebElement editYourAccountInformationOption;

	public boolean displayStatusOfEditYourAccountInformationOption() {

		return elementUtils.displayStatusOfElement(editYourAccountInformationOption,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

}