package com.chemtrix.qa.stepdefinitions.salesbudget;

import com.chemtrix.qa.factory.WebdriverManager;
import com.chemtrix.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.pageObj.HomePage;
import com.chemtrix.qa.pageObj.LoginPage;
import com.chemtrix.qa.pageObj.SalesBudgetPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Properties;

public class SalesBudget {
	WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	private SalesBudgetPage salesbudgetpage;

	@Given("^User logs in with valid email (.+) and password (.+) for Sales Target$")
	public void user_logs_in_wth_valid_email_and_password(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);

		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
	}

	@When("^user clicks on Sales budget Menu$")
	public void UserClicksOnSalesTargetMenuICon() {
		salesbudgetpage = homePage.clickOnSalesBudgetIcon();

	}

	@And("^Click On Upload Button$")
	public void UserClicksOnUploadButton() {
		salesbudgetpage.clickOnUploadButton();

	}

	@And("^user select the document (.*)$")
	public void UserUploadsDocument(String filepath) {
		salesbudgetpage.selectDocument(filepath);
	}

	@And("^user Clicks on Submit Button$")
	public void clicksOnSubmitButton() {
		salesbudgetpage.clickOnSubmitButton();

	}

	@And("^user clicks on ok button from alert popup$")
	public void userClicksOnOkButtonFromAlertPopup() {
		salesbudgetpage.ClickonOkButtonFromTheAlertPoUp();

	}

	@And("^user clicks on preview submit button$")
	public void userClicksOnPreviewSubmitButton() {

		salesbudgetpage.clickOnPreviewSubmitButton();
	}

	@And("^user Checks the Validation$")
	public void userChecksTheValidation() {

	}

	@And("^user validates existing and new values for the Quantity and Sales Target on the preview page$")
	public void userChecksTheValidationOnPreviewPgae() {
		salesbudgetpage.checkTheValidationFromPreviewPage();
	}
}
