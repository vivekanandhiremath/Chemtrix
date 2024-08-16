package com.chemtrix.qa.stepdefinitions.salesOrder;

import com.chemtrix.qa.factory.WebdriverManager;
import com.chemtrix.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.pageObj.HomePage;
import com.chemtrix.qa.pageObj.LoginPage;
import com.chemtrix.qa.pageObj.SalesOrderPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Properties;

public class SalesOrder {
	WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	private SalesOrderPage salesorderpage;

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

	@When("^User Clicks on Sales Order icon$")
	public void UserClicksonSalesOrdericon() throws Throwable {
		salesorderpage = homePage.clickOnSalesOrderIcon();
	}

	@And("^Clicks on Create Sales order button$")
	public void clicks_on_create_button() throws Throwable {
		salesorderpage.clickOnCreateSalesOrderButton();

	}

	@And("^Enter (.*) in the Customer Bill To text field$")
	public void EntertextintheCustomerBillTotextfield(String customerBillTo) throws Throwable {

		salesorderpage.enterCustomer(customerBillTo);

	}

	@And("^Enter (.*) in the POREFNo text field$")
	public void EntertextinthePorefNoTextfield(String porefno) throws Throwable {

		salesorderpage.enterPOREFNo(porefno);

	}

	@And("^Enter (.*) in the PoRef DatePicker$")
	public void EntertextinthePorefDateTextfield(String porefdate) throws Throwable {

		salesorderpage.pickthePoRefDate(porefdate);

	}

	@And("^Enter (.*) in the Committed Date DatePicker$")
	public void EnterCommittedDateTextfield(String committeddt) throws Throwable {

		salesorderpage.picktheCommittedDt(committeddt);

	}

	@And("^Enter (.*) in the Customer Req Date DatePicker$")
	public void EnterCustReqDateTextfield(String custreqdt) throws Throwable {

		salesorderpage.picktheCustReqDt(custreqdt);

	}

	@And("^Enter (.*) in the PandF num field$")
	public void EnterValueInThePandFNumField(String pandf) throws Throwable {

		salesorderpage.enterPandF(pandf);

	}

	@And("^Select the (.*) from the Discount Type$")
	public void selectDiscountType(String discountType) throws Throwable {

		salesorderpage.selectDiscountTypeOption(discountType);
	}

	@And("^Enter (.*) in the Insurance num field$")
	public void EnterInsurance(String insurance) throws Throwable {

		salesorderpage.enterInsurance(insurance);
	}

	@And("^Select the (.*) from the Delivery Terms$")
	public void selectDeliveryTerms(String deliveryterms) throws Throwable {

		salesorderpage.selectDeliveryTermsOption(deliveryterms);
	}

	@And("^Enter (.*) in the ProformaInvoice field$")
	public void EnterProformaInvoice(String proformainvoice) throws Throwable {

		salesorderpage.enterProformaInvoice(proformainvoice);
	}

	@And("^Select the (.*) from the Payment Terms$")
	public void selectPaymentTerms(String paymentterms) throws Throwable {

		salesorderpage.selectPaymentTermsOption(paymentterms);
	}

	@And("^Enter (.*) in the Agent text field$")
	public void EnterAgent(String agent) throws Throwable {

		salesorderpage.enterAgent(agent);
	}

	@And("^Select the (.*) from the ModeOfShipment$")
	public void selectModeOfShipment(String modeofshipment) throws Throwable {

		salesorderpage.selectModeOfShipmentOption(modeofshipment);
	}

	@And("^Enter (.*) in the Freight num field$")
	public void EnterFreight(String freight) throws Throwable {

		salesorderpage.enterFreight(freight);
	}

	@And("^Select the (.*) from the FreightMode")
	public void selectFreightMode(String freightmode) throws Throwable {

		salesorderpage.selectFreightModeOption(freightmode);
	}

	@And("^Select the (.*) from the FreightStatus")
	public void selectFreightStatus(String freightstatus) throws Throwable {

		salesorderpage.selectFreightStatusOption(freightstatus);
	}

	@And("^Select the (.*) from the InsuranceMode")
	public void selectInsuranceMode(String insurancemode) throws Throwable {

		salesorderpage.selectInsuranceModeOption(insurancemode);
	}

	@And("^Select the (.*) from the Transport On")
	public void selectTransportOn(String transporton) throws Throwable {

		salesorderpage.selectTransportOnOption(transporton);
	}

	@And("^Select the (.*) from the  Resonforrejection")
	public void selectResonforrejection(String resonforrejection) throws Throwable {

		salesorderpage.selectResonforRejectionOption(resonforrejection);
	}

	@And("^Enter (.*) in the search product group field$")
	public void EnterProductGroup(String productgroup) throws Throwable {

		salesorderpage.enterProductGroup(productgroup);
	}

	@And("^Enter (.*) in the Rejection remarks field$")
	public void EnterRejectionremarks(String rejectionremarks) throws Throwable {

		salesorderpage.enterRejectionremarks(rejectionremarks);
	}

	@And("^Enter (.*) in the Enquiry Remark field$")
	public void EnterEnquiryRemark(String enquiryremark) throws Throwable {

		salesorderpage.enterEnquiryRemark(enquiryremark);
	}

	@And("^Enter (.*) in the Enquiry Reply field$")
	public void EnterEnquiryReply(String enquiryremark) throws Throwable {

		salesorderpage.enterEnquiryRemark(enquiryremark);
	}

	@And("^Enter (.*) in the search product field$")
	public void EnterProduct(String product) throws Throwable {

		salesorderpage.enterProduct(product);
	}

	@And("^Click on Add button$")
	public void clickOnAddButton() {
		salesorderpage.clickAddButton();

	}

	@And("^Enter (.*) in the Quantity field$")
	public void EnterQuantity(String quantity) throws Throwable {

		salesorderpage.enterQuantity(quantity);
	}

	@And("^Enter (.*) in the rate field$")
	public void EnterRate(String rate) throws Throwable {

		salesorderpage.enterRate(rate);
	}

	@And("^Click on Create Button$")
	public void clickOnCreate() throws InterruptedException {
		salesorderpage.clickCreateButton();

	}

	@And("^Click on Update Button$")
	public void clickOnUpdate() throws InterruptedException {
		salesorderpage.clickUpdateButton();

	}

	@And("^Click on Back Button$")
	public void clickOnBackButton() throws InterruptedException {
		salesorderpage.clickBAck();

	}

	@And("^Click on Approve Button$")
	public void clickOnApprove() throws InterruptedException {
		salesorderpage.clickApproveButton();

	}

	@And("^Click on ForceClose Button$")
	public void clickOnForceCloseButton() throws InterruptedException {
		salesorderpage.clickForceCloseButton();

	}

	@And("^Click on Reject Button$")
	public void clickOnRejectButton() throws InterruptedException {
		salesorderpage.clickRejectButton();

	}

	@And("^Click on Enquiry Button$")
	public void clickOnEnquiryButton() throws InterruptedException {
		salesorderpage.clickEnquiryButton();

	}

	@And("^Click on Edit Icon$")
	public void clickOnEditIcon() throws InterruptedException {
		salesorderpage.clickEditIcon();

	}

	@And("Click on View Icon")
	public void clickOnViewIcon() throws InterruptedException {
		salesorderpage.clickViewIcon();

	}

	@And("^Click on PopUp$")
	public void clickOnPopUp() throws InterruptedException {
		salesorderpage.clickPopupButton();

	}

	@And("^Click on Reply$")
	public void clickOnReply() throws InterruptedException {
		salesorderpage.clickReplyButton();

	}

	@And("^Click on Yes PopUp$")
	public void clickOnYesPopUp() throws InterruptedException {
		salesorderpage.clickYesPopupButton();

	}

	@And("^Click on RejectPopUp$")
	public void clickOnRejectPopUp() throws InterruptedException {
		salesorderpage.clickPopupButton();

	}

	@And("^Click on Save AS Draft$")
	public void clickOnSaveASDraft() throws InterruptedException {
		salesorderpage.clickSaveAsDraftButton();

	}

	@When("user check for sales order no")
	public void SalesOrderNo() {

		System.out.println("SalesOrder No:" + salesorderpage.getSalesOrderNo());

	}

	@When("user check for sales order ApprovedStatus")
	public void SalesOrderApprovedOrder() throws InterruptedException {

		System.out.println("SalesOrder Status:" + salesorderpage.getSalesApprovedOrderStatus());

	}

	@When("user check for sales order Enquiry Status")
	public void SalesOrderEnquiryStatus() throws InterruptedException {

		System.out.println("SalesOrder Status:" + salesorderpage.getSalesOrderEnquiryStatus());

	}

	@When("user check for sales order ForceclosedStatus")
	public void SalesOrderForceclosedStatus() throws InterruptedException {

		System.out.println("SalesOrder Status:" + salesorderpage.getSalesOrderForceclosedStatus());

	}

	@When("user check for sales order PendingStatus")
	public void SalesOrderPendingStatus() throws InterruptedException {

		System.out.println("SalesOrder Status:" + salesorderpage.getSalesOrderPendingStatus());

	}

	@When("user check for sales order RejectStatus")
	public void SalesOrderRejectStatus() throws InterruptedException {

		System.out.println("SalesOrder Status:" + salesorderpage.getSalesOrderRejectStatus());

	}

	@When("Search for Saleorder Number")
	public void search_for_Salesorder() {

		salesorderpage.SearchSalesOrder(salesorderpage.getSalesOrderNo());

	}

}
