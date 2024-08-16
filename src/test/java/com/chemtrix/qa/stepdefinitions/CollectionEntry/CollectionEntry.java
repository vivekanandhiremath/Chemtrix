package com.chemtrix.qa.stepdefinitions.CollectionEntry;

import com.chemtrix.qa.factory.WebdriverManager;
import com.chemtrix.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.pageObj.CollectionEntryPage;
import com.chemtrix.qa.pageObj.HomePage;
import com.chemtrix.qa.pageObj.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Properties;

public class CollectionEntry {
	WebDriver driver;

	private LoginPage loginPage;
	private HomePage homePage;
	private CollectionEntryPage collectionEntryPage;

	@Given("^User logs in wth valid email (.+) and password (.+)$")
	public void user_logs_in_wth_valid_email_and_password(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);

		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
		Thread.sleep(2000);
	}

	@When("^user clicks on CollectionEntry Icon$")
	public void user_clicks_on_prospect_entry_icon() throws Throwable {
		homePage = new HomePage(driver);
		collectionEntryPage = homePage.clickOnCollectionEntryIcon();
	}

	@And("^user clicks on Create Collection Entry Button$")
	public void userClicksOnCreateCollectionENtryButton() throws Throwable {

		collectionEntryPage.ClickOnCreateCollectionENtryButton();
	}

	@And("^user Enters Customer Name as (.*)$")
	public void userEntersCustomerNameAs(String customer) throws Throwable {

		collectionEntryPage.EnterCustomerName(customer);
	}

	@And("^user Enters Enters Bankndetails (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
	public void userEntersModeOfPayment(String modeofpayment, String bank, String amount, String checknumber,
			String chequedate, String utrno, String transactiondate) throws Throwable {

		collectionEntryPage.EnterBankDetails(modeofpayment, bank, amount, checknumber, chequedate, utrno,
				transactiondate);
	}

	@And("^user updates bank details (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
	public void userUpdatesBankDetails(String modeofpayment, String bank, String amount, String checknumber,
			String chequedate, String utrno, String transactiondate) throws Throwable {

		collectionEntryPage.EditBankDetails(modeofpayment, bank, amount, checknumber, chequedate, utrno,
				transactiondate);
	}
//

	@And("^user Enters Remarks as (.*)$")
	public void userEntersRemarksAs(String remarks) throws Throwable {

		collectionEntryPage.EnterRemarks(remarks);
	}

	@And("^user Selects Invoice no as (.*)$")
	public void userSelectInvoiceNo(String invoiceno) throws Throwable {

		collectionEntryPage.SelectInvoiceNo(invoiceno);
	}

	@And("^user clicks on Submit button$")
	public void userClicksOnSubmitButton() throws Throwable {

		collectionEntryPage.ClickOnSubmitButton();
		collectionEntryPage.ClickOnPopUpOkButton();
		collectionEntryPage.getCollectionEntryNo();

	}

	@And("^user clicks on Update button$")
	public void userClicksOnUpdateButton() throws Throwable {

		collectionEntryPage.ClickOnUpdateButton();
		collectionEntryPage.ClickOnPopUpOkButton();

	}

	@When("user clicks on Edit Icon")
	public void user_clicks_on_edit_button() {
		collectionEntryPage.ClickOnEditIcon();
	}

	@And("^user updates Remarks as (.*)$")
	public void EditCustomerRemarks(String customerremarks) {

		collectionEntryPage.EditCustomerRemarksTextfield(customerremarks);

	}

	@And("^user clicks on View Icon$")
	public void ClickOnViewIcon() {

		collectionEntryPage.ClickOnViewIcon();

	}

	@And("^search For collection Entry$")
	public void SearchCollectionEntry() {

		collectionEntryPage.SearchForCollectionEntry();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@And("^click on Approve button$")
	public void ClickOnApproveButton() {

		collectionEntryPage.ClickOnApproveButton();

	}

}
