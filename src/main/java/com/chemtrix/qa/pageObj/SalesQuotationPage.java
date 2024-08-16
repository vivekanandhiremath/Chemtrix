package com.chemtrix.qa.pageObj;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;
import com.chemtrix.qa.utils.SalesquotationNoReader;
import com.chemtrix.qa.utils.WritePropertyFiles;

public class SalesQuotationPage {

	WebDriver driver;
	private ElementUtils elementUtils;
	WritePropertyFiles write = new WritePropertyFiles();
	Properties read = new SalesquotationNoReader().intializeProperties();

	public SalesQuotationPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);

	}

	@FindBy(xpath = "//p[.='CREATE SALES QUOTATION']")
	private WebElement CreateSalesQuotationButton;

	@FindBy(xpath = "//input[@id='txtCusBillTo']")
	private WebElement customerTextField;

	@FindBy(xpath = "(//li[contains(@tabindex,'-1')])[1]")
	private WebElement customerSearchOption;

	@FindBy(xpath = "//li[@id='txtCusBillTo-option-0']")
	private WebElement customerOption;

	@FindBy(id = "txtPoRefNo")
	private WebElement CustomerReference;

	@FindBy(id = " Txt_Visit Date")
	private WebElement ValidDate;

	@FindBy(id = "ddTransporton")
	private WebElement Transporter;

	@FindBy(id = "ddBank")
	private WebElement Bank;

	@FindBy(id = "ddLoadingPort")
	private WebElement LoadingPort;

	@FindBy(id = "ddDestinationPort")
	private WebElement DestinationPort;

	@FindBy(id = "ddInsuranceType")
	private WebElement InsuranceType;

	@FindBy(id = "txtProductGroupSearch")
	private WebElement SearchProductgroup;

	@FindBy(xpath = "//li[@id='txtProductGroupSearch-option-0']")
	private WebElement SearchProductgroupValue;

	@FindBy(id = "txtSearchProduct")
	private WebElement SearchProduct;

	@FindBy(xpath = "//li[@id='txtSearchProduct-option-0']")
	private WebElement SearchProductValue;

	@FindBy(id = "txtquantity")
	private WebElement InvoiceQuantity;

	@FindBy(id = "txtrate")
	private WebElement Rate;

	@FindBy(xpath = "//button[normalize-space()='BACK']")
	private WebElement Back;

	@FindBy(id = "txtRemarks")
	private WebElement Remarks;

	@FindBy(id = "txtPF")
	private WebElement P_F_Value;

	@FindBy(id = "txtfreight")
	private WebElement FreightValue;

	@FindBy(id = "checkbox")
	private WebElement proforma_invoice;

	@FindBy(id = "txtInternalRemark")
	private WebElement Internal_Remarks;

	@FindBy(id = "txtExternalRemark")
	private WebElement External_Remarks;

	@FindBy(xpath = "//button[.='ADD']")
	private WebElement ADD;

	@FindBy(xpath = "//button[.='CREATE']")
	private WebElement CREATE;

	@FindBy(xpath = "//button[.='SAVE AS DRAFT']")
	private WebElement SAVEASDRAFT;

	@FindBy(xpath = "//button[.='CANCEL']")
	private WebElement CANCEL;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/*[name()='svg'][1]/*[name()='path'][1]")
	private WebElement EDIT;

	@FindBy(xpath = "//button[.='UPDATE']")
	private WebElement UPDATE;

	@FindBy(id = "Approved")
	private WebElement Approve;

	@FindBy(id = "Rejected")
	private WebElement Reject;

	@FindBy(id = "ForceClosed")
	private WebElement ForceClose;

	@FindBy(xpath = "//button[normalize-space()='ENQUIRY']")
	private WebElement Enquiry;

	@FindBy(xpath = "(//a[@href='/dashboard/salesquotations/view'])[1]")
	private WebElement ViewIcon;

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	private WebElement Popup;

	@FindBy(xpath = "//button[.='Yes']")
	private WebElement YesPopup;

	@FindBy(xpath = "(//td[@class='whitespace-normal  break-words px-6 py-4 text-sm'])[2]")
	private WebElement salesquoid;

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

	@FindBy(xpath = "(//div[2]//label[1])[1]")
	private WebElement ApprovedStatus;

	@FindBy(xpath = "(//*[name()='text'][@id='text_In-Query'])[1]")
	private WebElement EnquiryStatus;

	@FindBy(xpath = "(//*[name()='text'][@id='text_In-Closed'])[1]")
	private WebElement ForceClosedStatus;

	@FindBy(xpath = "(//*[name()='text' and @id='txtpending'])[1]")
	private WebElement PendingStatus;

	@FindBy(xpath = "(//*[name()='text' and @id='rejecttxt'])[1]")
	private WebElement RejectStatus;

	public void clickOnCreateQuotationBUtton() {

		elementUtils.clickOnElement(CreateSalesQuotationButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterCustomer(String customer) throws InterruptedException {

		elementUtils.typeTextIntoElement(customerTextField, customer, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(customerOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterCustomerReference(String customerreference) throws InterruptedException {

		elementUtils.typeTextIntoElement(CustomerReference, customerreference, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterValidDate(String date) throws InterruptedException {

		elementUtils.typeTextIntoElement(ValidDate, date, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectTransporter(String transporter) throws InterruptedException {

		elementUtils.selectOptionInDropdownByVisibleText(Transporter, transporter,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectBank(String bank) throws InterruptedException {

		elementUtils.selectOptionInDropdownByVisibleText(Bank, bank, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectLoadingPort(String loadingPort) throws InterruptedException {

		elementUtils.selectOptionInDropdownByVisibleText(LoadingPort, loadingPort,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectDestinationPort(String destinationPort) throws InterruptedException {

		elementUtils.selectOptionInDropdownByVisibleText(DestinationPort, destinationPort,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectInsuranceType(String insuranceType) throws InterruptedException {

		elementUtils.selectOptionInDropdownByVisibleText(InsuranceType, insuranceType,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterSearchProduct(String searchproduct) throws InterruptedException {

		elementUtils.typeTextIntoElement(SearchProduct, searchproduct, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(SearchProductValue, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterSearchProductgroup(String searchproductgroup) throws InterruptedException {

		elementUtils.typeTextIntoElement(SearchProductgroup, searchproductgroup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(SearchProductgroupValue, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterInvoiceQuantity(String invoicequantity) throws InterruptedException {

		elementUtils.typeTextIntoElement(InvoiceQuantity, invoicequantity, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterRate(String rate) throws InterruptedException {

		elementUtils.typeTextIntoElement(Rate, rate, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterRemarks(String remarks) throws InterruptedException {

		elementUtils.typeTextIntoElement(Remarks, remarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectResonforRejectionOption(String resonforrejection) {
		elementUtils.selectOptionInDropdownByVisibleText(Resonforrejection, resonforrejection,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterRejectionremarks(String rejectionremarks) {

		elementUtils.typeTextIntoElement(Rejectionremarks, rejectionremarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterEnquiryRemark(String enquiryremark) {

		elementUtils.typeTextIntoElement(EnquiryRemark, enquiryremark, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterP_F_Value(String p_f_Value) throws InterruptedException {

		elementUtils.typeTextIntoElement(P_F_Value, p_f_Value, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterFreightValue(String freightvalue) throws InterruptedException {

		elementUtils.typeTextIntoElement(FreightValue, freightvalue, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterInternal_Remarks(String internal_remarks) throws InterruptedException {

		elementUtils.typeTextIntoElement(Internal_Remarks, internal_remarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterExternal_Remarks(String external_remarks) throws InterruptedException {

		elementUtils.typeTextIntoElement(External_Remarks, external_remarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickADDButton() {

		elementUtils.clickOnElement(ADD, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickCREATEButton() {

		elementUtils.clickOnElement(CREATE, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		String salesquotationno = getSalesQuoId();
		write.write("salesquotationID", salesquotationno);
	}

	public void clickSAVEASDRAFTButton() {

		elementUtils.clickOnElement(SAVEASDRAFT, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickReplyButton() {
		elementUtils.clickOnElement(ReplyButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickCANCELButton() {

		elementUtils.clickOnElement(CANCEL, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickBAck() {
		elementUtils.clickOnElement(Back, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

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

	public void clickEDITButton() {

		elementUtils.clickOnElement(EDIT, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void SearchAndVerifyStatusAndClickOnView(String entrytype, String salesquotationno) {

//		@FindBy(xpath = "(//a[@href='/dashboard/expenseclaims/View'])[1]")
//		private WebElement viewicon;

//		public void SearchAndVerifyAndclickOViewtIcon(String entrytype,String expenseclaimno) {

		if (entrytype.equalsIgnoreCase("manual")) {
			elementUtils.typeTextIntoElement(search, salesquotationno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement ele = driver.findElement(By.xpath("//td[11]"));
			String status = elementUtils.getTextFromElement(ele, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			System.out.println(status);
			if (status.equalsIgnoreCase("In-Query") || status.equalsIgnoreCase("Pending")) {

				elementUtils.clickOnElement(ViewIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			} else {

				Assert.assertTrue(false,
						"The status should have been In-Query or Pending But the status is : " + status);
			}

		} else {
			String salesquotationid = read.getProperty("salesquotationID");
			elementUtils.typeTextIntoElement(search, salesquotationid, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.clickOnElement(ViewIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		}

	}

//			String salesquotationid = read.getProperty("salesquotationID");
//		elementUtils.typeTextIntoElement(search, salesquotationid, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

//	}
//	public void clickViewIcon() throws InterruptedException {
//		Thread.sleep(2000);
//		elementUtils.clickOnElement(ViewIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
//	}

	public void clickYesPopupButton() throws InterruptedException {
		// Thread.sleep(2000);
		elementUtils.clickOnElement(YesPopup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickUPDATEButton() {

		elementUtils.clickOnElement(UPDATE, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//div[@class='row-span-3 col-span-10 col-start-2 items-center flex ']")
	private WebElement popupmessage;

	public String getSalesQuotationIDFromPopupText() {

		String message = elementUtils.getTextFromElement(popupmessage, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		String expenseclaimno = message.substring(17, 24);

		return expenseclaimno;

	}

	public void clickPopupButton() throws InterruptedException {
		// Thread.sleep(2000);
		elementUtils.clickOnElement(Popup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickproforma_invoice() {

		elementUtils.clickOnElement(proforma_invoice, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public String getSalesQuoId() {
		String salesquotaionid = getSalesQuotationIDFromPopupText();
		System.out.println(salesquotaionid);

		return salesquotaionid;

//		String salesquotaionid = salesquoid.getText();
//		return salesquotaionid;

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

}
