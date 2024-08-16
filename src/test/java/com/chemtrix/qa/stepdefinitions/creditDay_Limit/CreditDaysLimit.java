package com.chemtrix.qa.stepdefinitions.creditDay_Limit;

import com.chemtrix.qa.factory.WebdriverManager;
import com.chemtrix.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.pageObj.CreditDaysLimitPage;
import com.chemtrix.qa.pageObj.HomePage;
import com.chemtrix.qa.pageObj.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Properties;

public class CreditDaysLimit {

	WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	private CreditDaysLimitPage creditdayslimit;

	@Given("^TSM logs in wth valid email (.+) and password (.+)$")
	public void user_logs_in_wth_valid_email_and_password(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);

		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
	}

	@Given("^BM logs in wth valid email (.+) and password (.+)$")
	public void BM_logs_in_wth_valid_email_and_password(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);
		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
	}

	@Given("^CCM logs in wth valid email (.+) and password (.+)$")
	public void CCM_logs_in_wth_valid_email_and_password(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);
		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
	}

	@Given("^MD logs in wth valid email (.+) and password (.+)$")
	public void MD_logs_in_wth_valid_email_and_password(String username, String passwod) throws Throwable {
		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		loginPage = new LoginPage(driver);
		loginPage.loginWithValidCredential(username, passwod);
		homePage = loginPage.clickOnLoginButton();
	}

	@When("User Clicks on CreditControl icon")
	public void user_click_CreditControl() {

		creditdayslimit = homePage.clickOnCreditControlIcon();
	}

	@When("User Clicks on CreditControl Option")
	public void user_click_CreditControl_Option() {
		creditdayslimit.clickCreditControl();
	}

	@When("User Clicks on Create Creditdays")
	public void user_click_CreateCreditDays() {
		creditdayslimit.clickCreateCreditDays();
	}

	@When("Click on Approve Button")
	public void user_click_ApproveButton() {
		creditdayslimit.clickApproveButton();
	}

	@When("Click on Back Button")
	public void user_click_BAckButton() {
		creditdayslimit.clickBAck();
	}

	// @When("User Clicks on CreditControl Option")
	// public void user_click_CancelButton() {
	// creditdayslimit.clickCancel();
	// }

	@When("User Clicks on Create Button")
	public void user_click_CreateButton() {
		creditdayslimit.clickCreateButton();
	}

	@When("User Clicks on CreateCreditLimit Button")
	public void user_click_CreateCreditLimit() {
		creditdayslimit.clickCreateCreditLimit();
	}

	@When("User Clicks on CreateDays option")
	public void user_click_CreditDaysButton() {
		creditdayslimit.clickCreditDaysButton();
	}

	@When("User Clicks on Edit Icon")
	public void user_click_EditIcon() throws InterruptedException {
		creditdayslimit.clickEditIcon();
	}

	@When("Click on Enquiry Button")
	public void user_click_EnquiryButton() throws InterruptedException {
		creditdayslimit.clickEnquiryButton();
	}

	// @When("User Clicks on CreditControl Option")
	// public void user_click_LogOutButton() throws InterruptedException {
	// creditdayslimit.clickLogOut();
	// }

	@When("Click on MyItems")
	public void user_click_MyItems1() throws InterruptedException {
		creditdayslimit.clickMyItems1();
	}

	// @When("Click on Credit Days MyItems")
	// public void user_click_MyItems2() throws InterruptedException {
	// creditdayslimit.clickMyItems2();
	// }

	@When("User Clicks on Ok Popup")
	public void user_click_OkPopupButton() throws InterruptedException {
		creditdayslimit.clickOkPopupButton();
	}

	@When("User Clicks on Popup")
	public void user_click_PopupButton() throws InterruptedException {
		creditdayslimit.clickPopupButton();
	}

	@When("Click on RejectPopUp")
	public void user_click_RejectPopupButton() throws InterruptedException {
		creditdayslimit.clickOkPopupButton();
	}

	@When("Click on Reject Button")
	public void user_click_RejectButton() throws InterruptedException {
		creditdayslimit.clickRejectButton();
	}

	@When("Click on Reply")
	public void user_click_ReplyButton() throws InterruptedException {
		creditdayslimit.clickReplyButton();
	}

	@When("User Clicks on SUBMIT FOR REVIEW")
	public void user_click_SUBMITFORREVIEWButton() throws InterruptedException {
		creditdayslimit.clickSUBMITFORREVIEWButton();
	}

	@When("Click on TO MD CheckBox")
	public void user_click_ToMDCheckBox() throws InterruptedException {
		creditdayslimit.clickToMDCheckBox();
	}

	// @When("User Clicks Credit Day on Tsm View Icon")
	// public void user_click_TsmViewIcon() throws InterruptedException {
	// creditdayslimit.clickTsmViewIcon();
	// }

	@When("User Clicks on Update Button")
	public void user_click_UpdateButton() throws InterruptedException {
		creditdayslimit.clickUpdateButton();
	}

	@When("User Clicks View Icon")
	public void user_click_ViewIcon1() throws InterruptedException {
		creditdayslimit.clickViewIcon1();
	}

	// @When("User Clicks Credit Day on View Icon")
	// public void user_click_ViewIcon2() throws InterruptedException {
	// creditdayslimit.clickViewIcon2();
	// }

	// @When("User Clicks on CreditControl Option")
	// public void user_click_YesPopupButton() throws InterruptedException {
	// creditdayslimit.clickYesPopupButton();
	// }

	@When("^User Enters CreditDays As (.*)$")
	public void user_Enter_CreditDays(String creditdays) throws InterruptedException {
		creditdayslimit.enterCreditDays(creditdays);
	}

	@When("^User Enters CreditLimit As (.*)$")
	public void user_Enter_CreditLimit(String creditlimit) throws InterruptedException {
		creditdayslimit.enterCreditLimit(creditlimit);
	}

	@When("^User Enters Remarks As (.*)$")
	public void user_Enter_CreditRemark(String creditremark) throws InterruptedException {
		creditdayslimit.enterCreditRemark(creditremark);
	}

	@When("^User Select Customer As (.*)$")
	public void user_Enter_CustomerSearch(String customersearch) throws InterruptedException {
		creditdayslimit.enterCustomerSearch(customersearch);
	}

	@When("^Enter (.*) in the Enquiry Remark field$")
	public void user_Enter_EnquiryRemark(String enquiryremark) throws InterruptedException {
		creditdayslimit.enterEnquiryRemark(enquiryremark);
	}

	@When("^Enter (.*) in the Enquiry Reply field$")
	public void user_Enter_EnquiryReply(String enquiryreply) throws InterruptedException {
		creditdayslimit.enterEnquiryRemark(enquiryreply);
	}

	@When("^User Enters HighLevelCreditDays As (.*)$")
	public void user_Enter_HighLevelCreditDays(String highlevelcreditdays) throws InterruptedException {
		creditdayslimit.enterHighLevelCreditDays(highlevelcreditdays);
	}

	@When("^Enter (.*) in the Rejection remarks field$")
	public void user_Enter_Rejectionremarks(String rejectionremarks) throws InterruptedException {
		creditdayslimit.enterRejectionremarks(rejectionremarks);
	}

	@When("^User Enters Search As (.*)$")
	public void user_Enter_Serch1Text(String serch1text) throws InterruptedException {
		creditdayslimit.enterSerch1Text(serch1text);
	}

	// @When("^User Enters Credit Days Search As (.*)$")
	// public void user_Enter_Serch2Text(String serch2text) throws
	// InterruptedException {
	// creditdayslimit.enterSerch2Text(serch2text);
	// }

	// @When("User Clicks on CreditControl Option")
	// public void user_Get_Reject() throws InterruptedException {
	// creditdayslimit.getReject();
	// }

	// @When("User Clicks on CreditControl Option")
	// public void user_Get_ApprovedOrderStatus() throws InterruptedException {
	// creditdayslimit.getSalesApprovedOrderStatus();
	// }
	//
	// @When("User Clicks on CreditControl Option")
	// public void user_Get_SalesOrderEnquiryStatus() throws InterruptedException {
	// creditdayslimit.getSalesOrderEnquiryStatus();
	// }

	//
	// @When("User Clicks on CreditControl Option")
	// public void user_Get_SalesOrderPendingStatus() throws InterruptedException {
	// creditdayslimit.getSalesOrderPendingStatus();
	// }

	@When("^User Select Chemical Type As (.*)$")
	public void user_Select_ChemicalType(String chemicaltype) throws InterruptedException {
		creditdayslimit.selectChemicalType(chemicaltype);
	}

	@When("^User Select Filter Type As (.*)$")
	public void user_Select_Filter1(String filter1) throws InterruptedException {
		creditdayslimit.selectFilter1(filter1);
	}

	// @When("^User Credit Days Select Filter Type As (.*)$")
	// public void user_Select_Filter2(String filter2) throws InterruptedException {
	// creditdayslimit.selectFilter2(filter2);
	// }

	@When("^User Select ProductGroup As (.*)$")
	public void user_Select_ProductGroup(String productgroup) throws InterruptedException {
		creditdayslimit.selectProductGroup(productgroup);
	}

	@When("^Select the (.*) from the  Resonforrejection$")
	public void user_Select_ResonforRejectionOption(String resonforrejectionoption) throws InterruptedException {
		creditdayslimit.selectResonforRejectionOption(resonforrejectionoption);
	}

}
