package com.chemtrix.qa.stepdefinitions;

import com.chemtrix.qa.factory.WebdriverManager;
import com.chemtrix.qa.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.pageObj.HomePage;
import com.chemtrix.qa.pageObj.LoginPage;
import com.chemtrix.qa.utils.CommonUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Properties;

public class Login {

	WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;

	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {

		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);
//		 homePage = new HomePage(driver);
//		homePage.clickOnMyAccount();
//		loginPage = homePage.selectLoginOption();

	}

	@When("^User enters valid email address (.+) into email field$")
	public void User_enters_valid_email_address_into_email_field(String emailText) {

		loginPage.enterEmailAddress(emailText);

	}

	@And("^User enters valid password (.+) into password field$")
	public void user_enters_valid_password_into_password_field(String passwordText) {

		loginPage.enterPassword(passwordText);

	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {

		homePage = loginPage.clickOnLoginButton();

	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {

		Assert.assertTrue(homePage.displayWelcomeText());

	}

	@When("User enters invalid email address into email field")
	public void user_enters_invalid_email_address_into_email_field() {

		new CommonUtils();
		loginPage.enterEmailAddress(CommonUtils.getEmailWithTimeStamp());

	}

	@When("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidPasswordText) {

		loginPage.enterPassword(invalidPasswordText);

	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {
		System.out.println("still under develomenet");
//		Assert.assertTrue(
//				loginPage.getWarningMessageText().contains("Warning: No match for E-Mail Address and/or Password."));

	}

	@When("User dont enter email address into email field")
	public void user_dont_enter_email_address_into_email_field() {

		loginPage.enterEmailAddress("");

	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {

		loginPage.enterPassword("");

	}

}