package com.chemtrix.qa.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class SalesOrderPage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public SalesOrderPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);

	}

	@FindBy(xpath = "//button[contains(.,'CREATE SALES ORDER')]")
	private WebElement CreateSalesOrderButton;

	@FindBy(xpath = "//input[@id='txtCusBillTo']")
	private WebElement customerBillToTextField;

	@FindBy(xpath = "//li[@id='txtCusBillTo-option-0']")
	private WebElement customerBillToSearchOption;

	@FindBy(xpath = "//input[contains(@id,'txtPoRefNo')]")
	private WebElement porfnoTextfield;

	@FindBy(xpath = "//input[@id='txtPoRefDate']")
	private WebElement porefnoDateDatePicker;

	@FindBy(id = "txtCommitted")
	private WebElement CommittedDt;

	@FindBy(id = "txtcustReq")
	private WebElement CustReqDt;

	@FindBy(xpath = "//input[@id='txtPF']")
	private WebElement PandFnumfield;

	@FindBy(xpath = "//select[@id='DDPF']")
	private WebElement discountTypeDrodown;

	@FindBy(xpath = "//input[@id='txtIns']")
	private WebElement insuranceNumField;

	@FindBy(xpath = "//select[@id='ddDeliveryTerms']")
	private WebElement deliveryTermsDropdown;

	@FindBy(xpath = "//input[@id='txtProformaInvoice']")
	private WebElement proformaInvoiceTextfield;

	@FindBy(xpath = "//input[@id='txtBuyer']")
	private WebElement buyerTextfield;

	@FindBy(xpath = "//select[@id='DDPaymentTerms']")
	private WebElement paymentTermsDropdown;

	@FindBy(xpath = "//input[@id='txtagent']")
	private WebElement agentTextField;

	@FindBy(xpath = "//select[@id='ddModeofShipment']")
	private WebElement modeofshipmentDropdown;

	@FindBy(xpath = "//input[@id='txtfreight']")
	private WebElement frightNumField;

	@FindBy(xpath = "//select[@id='ddFreightmode']")
	private WebElement frightmodeDropdown;

	@FindBy(xpath = "//select[@id='DDStatus']")
	private WebElement frightStatusDropdown;

	@FindBy(xpath = "//select[@id='DDinsurancemode']")
	private WebElement insurancemodeDropdown;

	@FindBy(xpath = "//select[@id='ddTransporton']")
	private WebElement transportonDropdown;

	@FindBy(xpath = "//input[@id='txtProductGroupSearch']")
	private WebElement searchproductgroupTextfield;

	@FindBy(xpath = "//button[normalize-space()='BACK']")
	private WebElement Back;

	@FindBy(xpath = "//li[@id='txtProductGroupSearch-option-0']")
	private WebElement searchproductgroupoption;

	@FindBy(xpath = "//input[@id='txtSearchProduct']")
	private WebElement searchproductTextField;

	@FindBy(xpath = "//li[@id='txtSearchProduct-option-0']")
	private WebElement searchproductoption;

	@FindBy(xpath = "//button[@id='btnAddProduct']")
	private WebElement addButton;

	@FindBy(xpath = "//input[@id='txtquantity']")
	private WebElement quantityNumField;

	@FindBy(xpath = "//input[@id='txtrate']")
	private WebElement rateNumField;

	@FindBy(xpath = "//input[@id='txtdisc']")
	private WebElement discountNumField;

	@FindBy(id = "//input[@id='txtCommitted']")
	private WebElement committeddateDatePicker;

	@FindBy(id = "//input[@id='txtcustReq']")
	private WebElement requesteddateDatePicker;

	@FindBy(xpath = "//textarea[@id='txtRemarks']")
	private WebElement productremarksTextfield;

	@FindBy(xpath = "//textarea[@id='txtInternalRemark']")
	private WebElement internalRemarksTextfield;

	@FindBy(xpath = "//textarea[@id='txtExternalRemark']")
	private WebElement externalRemarksTextfield;

	@FindBy(xpath = "//button[@id='btnCancel']")
	private WebElement cancelButton;
	@FindBy(xpath = "//button[@id='btnSaveasDraft']")
	private WebElement saveasdraftButton;

	@FindBy(xpath = "//button[@id='btnAddSalesOrder']")
	private WebElement createButton;

	@FindBy(xpath = "//button[.='Ok']")
	private WebElement Popup;

	@FindBy(xpath = "//button[.='Yes']")
	private WebElement YesPopup;

	@FindBy(xpath = "//button[.='Save as Draft']")
	private WebElement SaveAsDraft;

	@FindBy(xpath = "//button[.='UPDATE']")
	private WebElement Update;

	@FindBy(id = "Approved")
	private WebElement Approve;

	public WebElement getApprove() {
		return Approve;
	}

	@FindBy(id = "Rejected")
	private WebElement Reject;

	public WebElement getReject() {
		return Reject;
	}

	@FindBy(id = "ForceClosed")
	private WebElement ForceClose;

	@FindBy(xpath = "//button[normalize-space()='ENQUIRY']")
	private WebElement Enquiry;

	@FindBy(xpath = "(//td[@class='whitespace-normal  break-words px-6 py-4 text-sm'])[2]")
	private WebElement salesorderNo;

	@FindBy(xpath = "(//a[@href='/dashboard/salesorders/addsalesorders'])[2]")
	private WebElement EditIcon;

	@FindBy(xpath = "(//a[@href='/dashboard/salesorders/view'])[1]")
	private WebElement ViewIcon;

	@FindBy(id = "search")
	private WebElement search;

	@FindBy(id = "DDReason")
	private WebElement Resonforrejection;

	@FindBy(id = "txtRemarks")
	private WebElement Rejectionremarks;

	@FindBy(xpath = "//textarea[@maxlength='255']")
	private WebElement EnquiryRemark;

	@FindBy(xpath = "//button[normalize-space()='REPLY']")
	private WebElement ReplyButton;

	@FindBy(xpath = "((//*[.='Approved'])[2])[1]")
	private WebElement ApprovedStatus;

	@FindBy(xpath = "(//*[name()='text'][@id='text_In-Query'])[1]")
	private WebElement EnquiryStatus;

	@FindBy(xpath = "(//*[name()='text'][@id='text_In-Closed'])[1]")
	private WebElement ForceClosedStatus;

	@FindBy(xpath = "(//*[name()='text' and @id='txtpending'])[1]")
	private WebElement PendingStatus;

	@FindBy(xpath = "(//*[name()='text' and @id='rejecttxt'])[1]")
	private WebElement RejectStatus;

	public void clickOnCreateSalesOrderButton() {

		elementUtils.clickOnElement(CreateSalesOrderButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterCustomer(String customerBillTo) throws InterruptedException {

		elementUtils.typeTextIntoElement(customerBillToTextField, customerBillTo, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(customerBillToSearchOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterPOREFNo(String porefno) {

		elementUtils.typeTextIntoElement(porfnoTextfield, porefno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void pickthePoRefDate(String date) {

		elementUtils.JavaScriptDatePicker(porefnoDateDatePicker, date, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void picktheCommittedDt(String committeddt) {

		elementUtils.JavaScriptDatePicker(CommittedDt, committeddt, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void picktheCustReqDt(String custreqdt) {

		elementUtils.JavaScriptDatePicker(CustReqDt, custreqdt, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterPandF(String PandF) {

		elementUtils.typeTextIntoElement(PandFnumfield, PandF, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectDiscountTypeOption(String discountType) {
		elementUtils.selectOptionInDropdownByVisibleText(discountTypeDrodown, discountType,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterInsurance(String insurance) {

		elementUtils.typeTextIntoElement(insuranceNumField, insurance, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterRejectionremarks(String rejectionremarks) {

		elementUtils.typeTextIntoElement(Rejectionremarks, rejectionremarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterEnquiryRemark(String enquiryremark) {

		elementUtils.typeTextIntoElement(EnquiryRemark, enquiryremark, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectDeliveryTermsOption(String deliveryterm) {
		elementUtils.selectOptionInDropdownByVisibleText(deliveryTermsDropdown, deliveryterm,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterProformaInvoice(String proformainvoice) {

		elementUtils.typeTextIntoElement(proformaInvoiceTextfield, proformainvoice,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectPaymentTermsOption(String paymentterms) {
		elementUtils.selectOptionInDropdownByVisibleText(paymentTermsDropdown, paymentterms,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterAgent(String agent) {

		elementUtils.typeTextIntoElement(agentTextField, agent, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectModeOfShipmentOption(String modeofshipment) {
		elementUtils.selectOptionInDropdownByVisibleText(modeofshipmentDropdown, modeofshipment,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterFreight(String freight) {

		elementUtils.typeTextIntoElement(frightNumField, freight, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectFreightModeOption(String freightmode) {
		elementUtils.selectOptionInDropdownByVisibleText(frightmodeDropdown, freightmode,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectFreightStatusOption(String freightstatus) {
		elementUtils.selectOptionInDropdownByVisibleText(frightStatusDropdown, freightstatus,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectResonforRejectionOption(String resonforrejection) {
		elementUtils.selectOptionInDropdownByVisibleText(Resonforrejection, resonforrejection,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectInsuranceModeOption(String insurancemode) {
		elementUtils.selectOptionInDropdownByVisibleText(insurancemodeDropdown, insurancemode,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectTransportOnOption(String transporton) {
		elementUtils.selectOptionInDropdownByVisibleText(transportonDropdown, transporton,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterProductGroup(String productgroup) {

		elementUtils.typeTextIntoElement(searchproductgroupTextfield, productgroup,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(searchproductgroupoption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterProduct(String product) {

		elementUtils.typeTextIntoElement(searchproductTextField, product, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(searchproductoption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickAddButton() {
		elementUtils.clickOnElement(addButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterQuantity(String quantity) {

		elementUtils.typeTextIntoElement(quantityNumField, quantity, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterRate(String rate) {

		elementUtils.typeTextIntoElement(rateNumField, rate, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickCreateButton() {
		elementUtils.clickOnElement(createButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickReplyButton() {
		elementUtils.clickOnElement(ReplyButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickBAck() {
		elementUtils.clickOnElement(Back, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickSaveAsDraftButton() {
		elementUtils.clickOnElement(SaveAsDraft, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickUpdateButton() {
		elementUtils.clickOnElement(Update, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickApproveButton() {
		elementUtils.clickOnElement(Approve, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickRejectButton() {
		elementUtils.clickOnElement(Reject, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickForceCloseButton() {
		elementUtils.clickOnElement(ForceClose, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickEnquiryButton() {
		elementUtils.clickOnElement(Enquiry, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickEditIcon() throws InterruptedException {
		Thread.sleep(2000);
		elementUtils.clickOnElement(EditIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickViewIcon() throws InterruptedException {
		Thread.sleep(2000);
		elementUtils.clickOnElement(ViewIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickPopupButton() throws InterruptedException {
		// Thread.sleep(2000);
		elementUtils.clickOnElement(Popup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickYesPopupButton() throws InterruptedException {
		// Thread.sleep(2000);
		elementUtils.clickOnElement(YesPopup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public String getSalesOrderNo() {

		String salesorderno = salesorderNo.getText();
		return salesorderno;

	}

	public String getSalesApprovedOrderStatus() throws InterruptedException {
		Thread.sleep(2000);
		String salesordersatus = ApprovedStatus.getText();
		return salesordersatus;

	}

	public String getSalesOrderRejectStatus() throws InterruptedException {
		Thread.sleep(2000);
		String salesordersatus = RejectStatus.getText();
		return salesordersatus;

	}

	public String getSalesOrderPendingStatus() throws InterruptedException {
		Thread.sleep(2000);
		String salesordersatus = PendingStatus.getText();
		return salesordersatus;

	}

	public String getSalesOrderEnquiryStatus() throws InterruptedException {
		Thread.sleep(2000);
		String salesordersatus = EnquiryStatus.getText();
		return salesordersatus;

	}

	public String getSalesOrderForceclosedStatus() throws InterruptedException {
		Thread.sleep(2000);
		String salesordersatus = ForceClosedStatus.getText();
		return salesordersatus;

	}

	public void SearchSalesOrder(String salesorderNo) {

		elementUtils.typeTextIntoElement(search, salesorderNo, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

}
