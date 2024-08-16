package com.chemtrix.qa.stepdefinitions.salesQuotation;

import com.chemtrix.qa.factory.WebdriverManager;
import com.chemtrix.qa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.pageObj.HomePage;
import com.chemtrix.qa.pageObj.LoginPage;
import com.chemtrix.qa.pageObj.SalesQuotationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.Properties;

public class SalesQuotation {
	WebDriver driver;
	private LoginPage loginPage = new LoginPage(driver);
	private HomePage homePage = new HomePage(driver);
	private SalesQuotationPage salesquotationPage = new SalesQuotationPage(driver);

	@Given("^User logs in with valid email (.*) and password (.*)$")
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

	@When("Click on Sales Quotation icon")
	public void click_on_sales_quotation_icon() {
		salesquotationPage = homePage.clickOnSalesQuotationIcon();

	}

	@When("Click on create Sales Quotation")
	public void click_on_create_sales_quotation_icon() {

		salesquotationPage.clickOnCreateQuotationBUtton();
	}

	@When("^Enters customer field (.*)$")
	public void enters_customer_field(String customer) throws InterruptedException {

		salesquotationPage.enterCustomer(customer);
	}

	@When("^Enters CustomerReference field (.*)$")
	public void enters_customer_reference_field(String customerreference) throws InterruptedException {

		salesquotationPage.enterCustomerReference(customerreference);
	}

	@When("^Enters ValidDate (.*)$")
	public void enters_valid_date(String date) throws InterruptedException {

		salesquotationPage.enterValidDate(date);
	}

	@When("^Select Transporter (.*)$")
	public void select_transporter(String transporter) throws InterruptedException {

		salesquotationPage.selectTransporter(transporter);
	}

	@When("^Select Bank (.*)$")
	public void select_bank(String bank) throws InterruptedException {
		salesquotationPage.selectBank(bank);
	}

	@When("^Select LoadingPort (.*)$")
	public void select_loading_port(String loadingPort) throws InterruptedException {

		salesquotationPage.selectLoadingPort(loadingPort);
	}

	@When("^Select DestinationPort (.*)$")
	public void select_destination_port(String destinationPort) throws InterruptedException {

		salesquotationPage.selectDestinationPort(destinationPort);
	}

	@When("^Select InsuranceType (.*)$")
	public void select_insurance_type(String insuranceType) throws InterruptedException {

		salesquotationPage.selectInsuranceType(insuranceType);
	}

	@When("^Search for Productgroup (.*)$")
	public void search_for_productgroup(String searchproductgroup) throws InterruptedException {
		salesquotationPage.enterSearchProductgroup(searchproductgroup);

	}

	@When("^Search for SearchProduct (.*)$")
	public void search_for_search_product(String searchproduct) throws InterruptedException {

		salesquotationPage.enterSearchProduct(searchproduct);
	}

	@When("^Enters InvoiceQuantity (.*)$")
	public void enters_invoice_quantity(String invoicequantity) throws InterruptedException {

		salesquotationPage.enterInvoiceQuantity(invoicequantity);
	}

	@When("^Enters Rate (.*)$")
	public void enters_rate(String rate) throws InterruptedException {

		salesquotationPage.enterRate(rate);
	}

	@When("^Enters Remarks (.*)$")
	public void enters_remarks(String remarks) throws InterruptedException {

		salesquotationPage.enterRemarks(remarks);
	}

	@When("^Enters P_F_Value (.*)$")
	public void enters_p_f_value(String p_f_Value) throws InterruptedException {
		salesquotationPage.enterP_F_Value(p_f_Value);
	}

	@When("^Enters FreightValue (.*)$")
	public void enters_freight_value(String freightvalue) throws InterruptedException {

		salesquotationPage.enterFreightValue(freightvalue);
	}

	@When("^Enters Internal_Remarks (.*)$")
	public void enters_internal_remarks(String internal_remarks) throws InterruptedException {

		salesquotationPage.enterInternal_Remarks(internal_remarks);
	}

	@When("^Enters External_Remarks (.*)$")
	public void enters_external_remarks(String external_remarks) throws InterruptedException {
		salesquotationPage.enterExternal_Remarks(external_remarks);
	}

	@And("^Enter (.*) in the Enquiry Remark field$")
	public void EnterEnquiryRemark(String enquiryremark) throws Throwable {

		salesquotationPage.enterEnquiryRemark(enquiryremark);
	}

	@And("^Enter (.*) in the Enquiry Reply field$")
	public void EnterEnquiryReply(String enquiryremark) throws Throwable {

		salesquotationPage.enterEnquiryRemark(enquiryremark);
	}

	@When("clicks on CREATE button")
	public void clicks_on_create_button1() {

		salesquotationPage.clickCREATEButton();
	}

	@And("^Click on Reply$")
	public void clickOnReply() throws InterruptedException {
		salesquotationPage.clickReplyButton();

	}

	@And("^Click on Back Button$")
	public void clickOnBackButton() throws InterruptedException {
		salesquotationPage.clickBAck();

	}

	@When("clicks on SAVEASDRAFT")
	public void clicks_on_saveasdraft() {

		salesquotationPage.clickSAVEASDRAFTButton();
	}

	@And("^Click on Enquiry Button$")
	public void clickOnEnquiryButton() throws InterruptedException {
		salesquotationPage.clickEnquiryButton();

	}

	@When("clicks on CANCEL")
	public void clicks_on_cancel() {

		salesquotationPage.clickCANCELButton();
	}

	@When("clicks on EDIT")
	public void clicks_on_edit() {

		salesquotationPage.clickEDITButton();
	}

	@When("clicks on UPDATE")
	public void clicks_on_update() {

		salesquotationPage.clickUPDATEButton();
	}

	@And("^clicks on Popup$")
	public void clickOnPopUp() throws InterruptedException {

		salesquotationPage.clickPopupButton();

	}

	@When("clicks on ADD")
	public void clicks_on_add() {

		salesquotationPage.clickADDButton();
	}

//	@And("^Click on View Icon$")
//	public void clickOnViewIcon() throws InterruptedException {
//
//		salesquotationPage.clickViewIcon();
//
//	}

	@And("^Select the (.*) from the  Resonforrejection")
	public void selectResonforrejection(String resonforrejection) throws Throwable {

		salesquotationPage.selectResonforRejectionOption(resonforrejection);
	}

	@And("^Enter (.*) in the Rejection remarks field$")
	public void EnterRejectionremarks(String rejectionremarks) throws Throwable {

		salesquotationPage.enterRejectionremarks(rejectionremarks);
	}

	@And("^Click on Reject Button$")
	public void clickOnRejectButton() throws InterruptedException {
		salesquotationPage.clickRejectButton();

	}

	@And("^Click on RejectPopUp$")
	public void clickOnRejectPopUp() throws InterruptedException {
		salesquotationPage.clickPopupButton();

	}

	@And("^Click on Yes PopUp$")
	public void clickOnYesPopUp() throws InterruptedException {
		salesquotationPage.clickYesPopupButton();

	}

	@And("^Click on PopUp$")
	public void clickOnPopUp1() throws InterruptedException {
		salesquotationPage.clickPopupButton();

	}

	@And("^Click on ForceClose Button$")
	public void clickOnForceCloseButton() throws InterruptedException {
		salesquotationPage.clickForceCloseButton();

	}

	@And("^Click on Approve Button$")
	public void clickOnApprove() throws InterruptedException {
		salesquotationPage.clickApproveButton();

	}

	@When("user check for sales order ApprovedStatus")
	public void SalesOrderApprovedOrder() throws InterruptedException {

		System.out.println("SalesOrder Status:" + salesquotationPage.getSalesApprovedOrderStatus());

	}

	@When("user check for sales order Enquiry Status")
	public void SalesOrderEnquiryStatus() throws InterruptedException {

		System.out.println("SalesOrder Status:" + salesquotationPage.getSalesOrderEnquiryStatus());

	}

	@When("user check for sales order RejectStatus")
	public void SalesOrderRejectStatus() throws InterruptedException {

		System.out.println("SalesOrder Status:" + salesquotationPage.getSalesOrderRejectStatus());

	}

	@When("user check for sales order ForceclosedStatus")
	public void SalesOrderForceclosedStatus() throws InterruptedException {

		System.out.println("SalesOrder Status:" + salesquotationPage.getSalesOrderForceclosedStatus());

	}

	@When("user check for sales order PendingStatus")
	public void SalesOrderPendingStatus() throws InterruptedException {

		System.out.println("SalesOrder Status:" + salesquotationPage.getSalesOrderPendingStatus());

	}

	@When("^Search for SalesQuotation (.*) (.*)$")
	public void search_for_SalesQuotation(String entrytype, String salesorderno) {

		salesquotationPage.SearchAndVerifyStatusAndClickOnView(entrytype, salesorderno);

	}

}
