//package com.chemtrix.qa.stepdefinitions.masters;
//
//import org.openqa.selenium.WebDriver;
//
//import com.chemtrix.qa.factory.DriverFactory;
//import com.chemtrix.qa.pageObj.HomePage;
//import com.chemtrix.qa.pageObj.LoginPage;
//import com.chemtrix.qa.pageObj.MastersPage;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Masters {
//	WebDriver driver;
//
//	private LoginPage loginPage;
//	private HomePage homePage;
//	private MastersPage masters;
//
//	@Given("^User logs in wth valid email (.+) and password (.+)$")
//	public void user_logs_in_wth_valid_email_and_password(String username, String passwod) throws Throwable {
//		driver = DriverFactory.getDriver();
//		loginPage = new LoginPage(driver);
//
//		loginPage.loginWithValidCredential(username, passwod);
//		homePage = loginPage.clickOnLoginButton();
//	}
//
//	@When("user Click Master Icon")
//	public void user_click_master_icon() {
//		homePage = new HomePage(driver);
//		homePage.clickOnMastersIcon();
//	}
//
//	@Then("^Clicks on Edit Icon$")
//	public void clicks_on_edit_icon() throws InterruptedException {
//		masters = new MastersPage(driver);
//		masters.clickEditIcon();
//	}
//
//	@Then("^Edit Customer Grading (.*)$")
//	public void edit_customer_grading(String customergrading) {
//		masters.selectCustomerGrading(customergrading);
//	}
//
//	@Then("^Edit Remarks (.*)$")
//	public void edit_remarks(String remarks) {
//		masters.enterRemarks(remarks);
//	}
//
//	@Then("^Edit Payment (.*)$")
//	public void edit_payment(String payment) {
//
//		masters.selectPayment(payment);
//	}
//
//	@Then("^Edit Volume (.*)$")
//	public void edit_volume(String volume) {
//
//		masters.selectVolume(volume);
//	}
//
//	@Then("^Edit Collection (.*)$")
//	public void edit_collection(String collection) {
//		masters.selectCollection(collection);
//	}
//
//	@Then("^Edit Profitability (.*)$")
//	public void edit_profitability(String profitability) {
//
//		masters.selectProfitability(profitability);
//	}
//
//	@Then("^Edit Sales (.*)$")
//	public void edit_sales(String sales) {
//
//		masters.selectSales(sales);
//	}
//
//	@Then("Clicks on update button")
//	public void clicks_on_update_button() {
//
//		masters.clickUpdate();
//	}
//
//	@Then("Click on popup")
//	public void click_on_popup() {
//		masters.clickPopUp();
//	}
//
//}
