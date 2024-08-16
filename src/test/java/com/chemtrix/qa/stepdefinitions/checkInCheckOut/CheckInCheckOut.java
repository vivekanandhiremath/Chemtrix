package com.chemtrix.qa.stepdefinitions.checkInCheckOut;

import com.chemtrix.qa.factory.WebdriverManager;
import com.chemtrix.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.pageObj.CheckIn_CheckOutPage;
import com.chemtrix.qa.pageObj.HomePage;
import com.chemtrix.qa.pageObj.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Properties;

public class CheckInCheckOut {
	WebDriver driver;

	private LoginPage loginPage;
	private HomePage homePage;
	private CheckIn_CheckOutPage checkincheckoutPage;

	@Given("^User logs in wth valid email (.+) and password (.+)$")
	public void user_logs_in_wth_valid_email_and_password(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);

		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
	}

	@When("^user clicks on CheckInCheckOuticon$")
	public void user_clicks_on_prospect_entry_icon() throws Throwable {
		homePage = new HomePage(driver);
		checkincheckoutPage = homePage.clickOnCheckIn_CheckOutIcon();
	}

	@And("^selects VisitType (.+)$")
	public void selectVisitType(String visittype) throws Throwable {
		checkincheckoutPage.selectVisitType(visittype);
	}

	@And("^click on Office In button$")
	public void clickOnOfficeInbutton() throws Throwable {
		checkincheckoutPage.clickOnOfficeIn();
	}

	@And("^click on Office Out button$")
	public void clickOnOfficeOutbutton() throws Throwable {
		checkincheckoutPage.clickOnOfficeOut();
	}

	@And("^selects Customer(.+)$")
	public void selectCustomer(String customer) throws Throwable {
		checkincheckoutPage.selectCustomer(customer);
	}

	@And("^selects CVP No (.+)$")
	public void selectCVPNo(String cvpno) throws Throwable {
		checkincheckoutPage.selectCvpNo(cvpno);
	}

	@And("^Check the RadioButton(.*)$")
	public void clickOnCheckBox(String cvno) throws Throwable {
		checkincheckoutPage.clickOnRadioButton(cvno);
	}

	@And("^Click on CheckIn button$")
	public void clickOnCheckInButton() throws Throwable {
		checkincheckoutPage.clickOnCheckInButton();
	}

	@And("^enter the Remarks as (.+)$")
	public void enterRemarks(String remarks) throws Throwable {
		checkincheckoutPage.enterRemarks(remarks);
	}

//
	@And("^upload File (.+)$")
	public void uploadFile(String filepath) throws Throwable {
		checkincheckoutPage.uploadFile(filepath);
	}

//
	@And("^Click on CheckOut button$")
	public void clickOnCheckout() throws Throwable {
		checkincheckoutPage.clickOnChecOut();
	}

//

//
//	@And("^pick nextvisitdate (.+)$")
//	public void pickingNextVisitDate(String date) throws Throwable {
//		checkincheckoutPage.selectNextVisitDate(date);
//	}

//
//	@And("^pick nextvisittime (.+)$")
//	public void pickingNextVisitTime(String time) throws Throwable {
//		checkincheckoutPage.selectNextVisitTime(time);
//	}

}
