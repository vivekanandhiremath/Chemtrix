package com.chemtrix.qa.stepdefinitions.visitPlanning;

import com.chemtrix.qa.factory.WebdriverManager;
import com.chemtrix.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.pageObj.HomePage;
import com.chemtrix.qa.pageObj.LoginPage;
import com.chemtrix.qa.pageObj.VisitPlanningPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Properties;

public class VisitPlanning {
	WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	private VisitPlanningPage visitplanningPage;

	@Given("^User logs in wth valid email (.+) and password (.+)$")
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

	@And("^user clicks on create VisitPlanning button$")
	public void user_clicks_on_create_visitplanning_button() throws Throwable {

		visitplanningPage = homePage.clickOnVisitPlanningIcon();
		visitplanningPage.clickOnCreateVisitPlanningButton();
	}

	@When("Click on Visit Plan icon")
	public void click_on_Visit_Plan_icon() {
		visitplanningPage = homePage.clickOnVisitPlanningIcon();

	}

	@And("^user gets Quotation number$")
	public void user_gets_Quotation_number() throws Throwable {

		visitplanningPage.GetQuotationDate();
	}

	@And("^user enters Customer name (.+) (.+)$")
	public void user_enters_customer_name(String Customertype, String customer) throws Throwable {
		
		if (Customertype.equalsIgnoreCase("sl")) {

			visitplanningPage.enterSLCustomer(customer);

		} else if (Customertype.equalsIgnoreCase("pl")) {
			visitplanningPage.enterPLCustomer(customer);
		} else {
			visitplanningPage.enterRandomCustomer(customer);

		}

	}

//	@When("user check for CVP no")
//	public void SalesOrderNo() {
//
//		System.out.println("CVP No:" + visitplanningPage.getcvpno());
//
//	}

	@When("^Search and click on view icon for CvpNo Number (.*) (.*)$")
	public void search_for_Salesorder(String entrytype,String cvpno) {

		visitplanningPage.SearchAndVerifyAndclickOViewtIcon(entrytype,cvpno);

	}

	@And("^select the purpose of visit (.*)$")
	public void select_the_purpose_of_visit(String purposevisit) throws Throwable {
		visitplanningPage.selectThePurposeVisitDropdownValue(purposevisit);
	}

	@And("^TSM user check for the Status$")
	public void userChecksForStatus() throws Throwable {
		visitplanningPage.tsmcheckForStatus();
	}
	@And("^BM user check for the Status$")
	public void bmUserChecksForStatus() throws Throwable {
		visitplanningPage.bMcheckForStatus();
	}
	
	
	@And("^user enters visit date (.*)$")
	public void user_enters_visit_date(String date) throws Throwable {

		visitplanningPage.enterDate(date);

	}

	@And("^Enter (.*) in the Enquiry Reply field$")
	public void EnterEnquiryReply(String enquiryremark) throws Throwable {

		visitplanningPage.enterEnquiryRemark(enquiryremark);
	}

	@And("^user enters visit time(.*)$")
	public void user_enters_visit_time(String visittime) throws Throwable {
		visitplanningPage.selectTimefromVisitTimeClock(visittime);
	}

	@And("^user enters phone number(.*) (.*)$")
	public void user_enters_phone_number(String customertype,String phonenumber) throws Throwable {

		if(customertype.equalsIgnoreCase("random")) {

		visitplanningPage.enterPhoneNumberNumericField(phonenumber);
		}
		}

	@And("^user entrers email (.*) (.*)$")
	public void user_entrers_email(String customertype,String email) throws Throwable {
		if(customertype.equalsIgnoreCase("random"))
		visitplanningPage.enterEmailField(email);
	}

	@And("^user edit phone number (.*)$")
	public void user_edit_phone_number(String updatedPhoneNumber) throws Throwable {
		visitplanningPage.editPhoneNumberNumericField(updatedPhoneNumber);
	}

	@And("^user edit email (.*)$")
	public void user_edit_email(String updatedemail) throws Throwable {
		visitplanningPage.editEmailField(updatedemail);
	}

	@And("^user enters address (.*) (.*)$")
	public void user_enters_address(String customertype,String address) throws Throwable {
		if(customertype.equalsIgnoreCase("random"))
		visitplanningPage.enterAddressField(address);
	}

	@And("^user enters visitremarks (.*)$")
	public void user_enters_remarks(String remarks) throws Throwable {
		visitplanningPage.enterRemarkField(remarks);
	}

	@And("^user enters Second Customer name (.*)$")
	public void user_enters_customer_name2(String customer2) throws Throwable {
		visitplanningPage.enterCustomer2(customer2);
	}

	@And("^select the Second purpose of visit (.*)$")
	public void select_the_purpose_of_visit2(String purposevisit2) throws Throwable {
		visitplanningPage.selectThePurposeVisitDropdownValue2(purposevisit2);
	}

	@And("^user enters Second visit date (.*)$")
	public void user_enters_visit_date2(String date) throws Throwable {

		visitplanningPage.ClickOnDate2(date);


	}

	@And("Click on View Icon")
	public void clickOnViewIcon() throws InterruptedException {
		visitplanningPage.clickViewIcon();

	}

	@And("^Click on PopUp$")
	public void clickOnPopUp() throws InterruptedException {
		visitplanningPage.clickPopupButton();

	}

	@And("^user enters Second visit time(.*)$")
	public void user_enters_visit_time2(String visittime2) throws Throwable {
		visitplanningPage.selectTimefromVisitTimeClock2(visittime2);
	}

	@And("^user enters edit visit date (.*) (.*) (.*) (.*)$")
	public void user_enters_edit_visit_date(String Day, String date, String month, String year) throws Throwable {

		visitplanningPage.selectEditDatefromVisitDateCalender(Day, date, month, year);

	}

	@And("^user enters edit visit time (.*)$")
	public void user_enters_edit_visit_time2(String editVisitTime) throws Throwable {
		visitplanningPage.selectEditTimefromVisitTimeClock(editVisitTime);
	}

	@And("^user enters Second phone number(.*)$")
	public void user_enters_phone_number2(String phonenumber2) throws Throwable {
		visitplanningPage.enterPhoneNumberNumericField2(phonenumber2);
	}

	@And("^user entrers Second email (.*)$")
	public void user_entrers_email2(String email2) throws Throwable {
		visitplanningPage.enterEmailField2(email2);
	}

	@And("^user enters Second address (.*)$")
	public void user_enters_address2(String address2) throws Throwable {
		visitplanningPage.enterAddressField2(address2);
	}

	@And("^user enters Second remarks (.*)$")
	public void user_enters_remarks2(String remarks2) throws Throwable {
		visitplanningPage.enterRemarkField2(remarks2);
	}

	@And("^Clicks on Submit button$")
	public void clicks_on_submit_button() throws Throwable {
		visitplanningPage.clickSubmit();

	}

	@And("^Clicks on Update button$")
	public void clicks_on_Update_button() throws Throwable {
		visitplanningPage.clickUpdate();
	}

	@And("^Clicks on Save as Draft button$")
	public void clicks_on_Save_as_Draft_button() throws Throwable {
		visitplanningPage.clickSaveAsDraft();
	}

	@And("^Clicks on Add entry button$")
	public void clicks_on_Add_entry_button() throws Throwable {
		visitplanningPage.clickAddEntry();
	}

	@And("^Clicks on Edit Icon$")
	public void clicks_on_Edit_Icon() throws Throwable {
		visitplanningPage.clickEdit();
	}

	@And("^Click on Reply$")
	public void clickOnReply() throws InterruptedException {
		visitplanningPage.clickReplyButton();

	}

	@And("^Click on Yes PopUp$")
	public void clickOnYesPopUp() throws InterruptedException {
		visitplanningPage.clickYesPopupButton();

	}

	@And("^Select the (.*) from the  Resonforrejection")
	public void selectResonforrejection(String resonforrejection) throws Throwable {

		visitplanningPage.selectResonforRejectionOption(resonforrejection);
	}

	@And("^Enter (.*) in the Enquiry Remark field$")
	public void EnterEnquiryRemark(String enquiryremark) throws Throwable {

		visitplanningPage.enterEnquiryRemark(enquiryremark);
	}

	@And("^Enter (.*) in the Rejection remarks field$")
	public void EnterRejectionremarks(String rejectionremarks) throws Throwable {

		visitplanningPage.enterRejectionremarks(rejectionremarks);
	}

	@And("^Click on Reject Button$")
	public void clickOnRejectButton() throws InterruptedException {
		visitplanningPage.clickRejectButton();

	}

	@And("^Click on RejectPopUp$")
	public void clickOnRejectPopUp() throws InterruptedException {
		visitplanningPage.clickPopupButton();

	}

	@And("^Click on Back Button$")
	public void clickOnBackButton() throws InterruptedException {
		visitplanningPage.clickBAck();

	}

	@And("^Click on Approve Button$")
	public void clickOnApprove() throws InterruptedException {
		visitplanningPage.clickApproveButton();

	}

	@When("user check for sales order ApprovedStatus")
	public void SalesOrderApprovedOrder() throws InterruptedException {

//		System.out.println("VisitPlan Status:" + visitplanningPage.getSalesApprovedOrderStatus());

	}

	@When("user check for sales order RejectStatus")
	public void SalesOrderRejectStatus() throws InterruptedException {

//		System.out.println("VisitPlan Status:" + visitplanningPage.getSalesOrderRejectStatus());

	}

	@When("user check for sales order Enquiry Status")
	public void SalesOrderEnquiryStatus() throws InterruptedException {

//		System.out.println("VisitPlan Status:" + visitplanningPage.getSalesOrderEnquiryStatus());

	}

	@And("^Click on Enquiry Button$")
	public void clickOnEnquiryButton() throws InterruptedException {
		visitplanningPage.clickEnquiryButton();

	}

}
