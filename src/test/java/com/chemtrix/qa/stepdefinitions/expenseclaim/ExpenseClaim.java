package com.chemtrix.qa.stepdefinitions.expenseclaim;

import com.chemtrix.qa.factory.WebdriverManager;
import com.chemtrix.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.pageObj.ExpenseClaimPage;
import com.chemtrix.qa.pageObj.HomePage;
import com.chemtrix.qa.pageObj.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Properties;

public class ExpenseClaim {
	WebDriver driver;

	private LoginPage loginPage;
	private HomePage homePage;
	private ExpenseClaimPage expenseclaim;

	@Given("^TSM logs in with valid email (.+) and password (.+)$")
	public void user_logs_in_wth_valid_email_and_password(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);

		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
		Thread.sleep(2000);
	}

	@Given("^BM logs in with valid email (.+) and password (.+)$")
	public void BMlogsIn(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);

		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
		Thread.sleep(2000);
	}

	@Given("^EAP logs in with valid email (.+) and password (.+)$")
	public void EAPlogsIn(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);

		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
		Thread.sleep(2000);
	}

	@When("^User Clicks on ExpenseClaim icon$")
	public void userClicksOnExpenseClaimIcon() {
		expenseclaim = homePage.clickOnExpenseClaimIcon();

	}

	@And("^Clicks on Create Expense Claim button$")
	public void clicksOnCreateExpenseClaimButton() {
		expenseclaim.ClickOnCreateExpenseClaimButton();
	}

	@And("^User select the Date Of Customer Visit (.*)$")
	public void userSelectTheDateOfCustomerVisit(String date) {
		expenseclaim.selectDateOfCustomervisit(date);
	}

	@And("^User select the VehicleType (.*)$")
	public void userSelectsTheVehicleType(String vehicletype) {
		expenseclaim.selectVehicletype(vehicletype);
	}

	@And("^User enters the VehicleNo (.*)$")
	public void UserEntersTheVehicleNo(String vehicleno) {
		expenseclaim.EnterVehicleNo(vehicleno);
	}

	@And("^User enters the StartKM (.*)$")
	public void UserEntersTheStartKm(String startkm) {
		expenseclaim.EnterStartKM(startkm);
	}

	@And("^user Uploads the Startkm Document (.*)$")
	public void userUploadsStartKmDoc(String startkmfile) {
		expenseclaim.UploadStartKmFile(startkmfile);
	}

	@And("^User enters the EndKM (.*)$")
	public void UserEntersTheEndKm(String endkm) {
		expenseclaim.EnterEndKm(endkm);
	}

	@And("^user Uploads the Endkm Document (.*)$")
	public void userUploadsEndKmDoc(String endkmfile) {
		expenseclaim.UploadEndKmFile(endkmfile);
	}

	@And("^User select the VehicleType2 (.*)$")
	public void userSelectsTheVehicleType2(String vehicletype2) {
		expenseclaim.selectVehicletype2(vehicletype2);
	}

	@And("^User enters the TravelFare2 (.*)$")
	public void userEntersTheTravelFare2(String travelfare2) {
		expenseclaim.EnterTravelFare2(travelfare2);
	}

	@And("^User Clicks On the BreakFast CheckBox and uploads document (.*)$")
	public void userCheckTheBreakFastCheckBoxAndUPloadsDocument(String breakfastbill) {
		expenseclaim.ClickBreakFastCheckBox();
		expenseclaim.uploadBreakFastFile(breakfastbill);
	}

	@And("^User Clicks On the Lodging CheckBox and selects the LodgingCity uploads document (.*) (.*)$")
	public void userCheckTheLodgingCityCheckBoxAndUploadsDocument(String lodgingcity, String lodgingbill) {
		expenseclaim.ClickLodgingCheckBox();
		expenseclaim.selectTheLOdgingCity(lodgingcity);
		expenseclaim.uploadLodgingFile(lodgingbill);
	}

	@And("^user enters details of other expense (.*)$")
	public void userEntersTheDetailsOfOtherExpense(String detailsofotherexpense) {
		expenseclaim.EnterDetailsOfOtherExpense(detailsofotherexpense);
	}

	@And("^user enters the Other expense amount and uploads bill (.*) (.*)$")
	public void userEntersTheOtherExpenseAmout(String otherexpenseamount, String otherexpensebill) {
		expenseclaim.EnterOtherExpenseAmount(otherexpenseamount);
		expenseclaim.UploadOtherExpenseFile(otherexpensebill);
	}

	@And("^user enters remarks (.*)$")
	public void userEntersRemarks(String remarks) {
		expenseclaim.EnterRemarks(remarks);
	}

	@And("^User clicks on Submit button$")
	public void userClicksOnSubmitButton() {
		expenseclaim.clickOnSubmitButton();
	}

	@And("^Clicks on Edit icon$")
	public void userClicksOnEditIcon() {
		expenseclaim.clickOnEditIcon();
	}

	@And("^User clicks on update button$")
	public void userClicksOnUpdateIcon() {
		expenseclaim.clickOnEditIcon();
	}

	@And("^Clicks on view icon (.*) (.*)$")
	public void userClicksOnviewIcon(String entrytype, String expenseclaimno) {

		expenseclaim.SearchAndVerifyAndclickOViewtIcon(entrytype, expenseclaimno);

	}

	@And("^clicks on Approve$")
	public void userClicksOnApproveIcon() {
		expenseclaim.clickOnApproveButton();
	}

}
