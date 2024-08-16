package com.chemtrix.qa.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class CreditDaysLimitPage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public CreditDaysLimitPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);

	}

	@FindBy(xpath = "//button[.='Create Credit Limit']")
	private WebElement CreateCreditLimit1;

	@FindBy(xpath = "//button[.='Create Credit Limit']")
	private WebElement CreateCreditLimit2;

	@FindBy(xpath = "//li[@id='CreditControl']")
	private WebElement CreditControl;

	@FindBy(id = "txtCusSearch")
	private WebElement CustomerSearch;

	@FindBy(xpath = "//li[@id='txtCusSearch-option-0']")
	private WebElement CustomerValue;

	@FindBy(id = "txtCreditLimit")
	private WebElement CreditLimit;

	@FindBy(id = "txtRemarks")
	private WebElement CreditRemark;

	@FindBy(xpath = "//button[normalize-space()='Create']")
	private WebElement CreateButton;

	@FindBy(id = "tab2")
	private WebElement CreditDaysButton;

	@FindBy(xpath = "//button[normalize-space()='Create Credit Days']")
	private WebElement CreateCreditDays;

	@FindBy(id = "ddChemicalType")
	private WebElement ChemicalType;

	@FindBy(id = "ddProductGroup")
	private WebElement ProductGroup;

	@FindBy(id = "txtCreditDays")
	private WebElement CreditDays;

	@FindBy(id = "txtHighLevelCreditDays")
	private WebElement HighLevelCreditDays;

	@FindBy(xpath = "//button[normalize-space()='CANCEL']")
	private WebElement Cancel;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	private WebElement Popup;

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	private WebElement oKPopup;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	private WebElement YesPopup;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	private WebElement Update;

	@FindBy(xpath = "(//input[@id='search'])[1]")
	private WebElement Search1;

	@FindBy(xpath = "(//input[@id='search'])[2]")
	private WebElement Search2;

	@FindBy(xpath = "//button[normalize-space()='SUBMIT FOR REVIEW']")
	private WebElement SUBMITFORREVIEW;

	@FindBy(xpath = "(//*[@id=\"rowEdit\"])[1]")
	private WebElement EditIcon;

	@FindBy(xpath = "(//*[@id='rowView'])[1]")
	private WebElement ViewIcon1;

	@FindBy(xpath = "(//*[@id='rowView'])[2]")
	private WebElement ViewIcon2;

	@FindBy(xpath = "(//*[@id='rowView'])[3]")
	private WebElement ViewIcon3;

	@FindBy(xpath = "(//*[@id='rowView'])[4]")
	private WebElement ViewIcon4;

	@FindBy(xpath = "(//*[@id='rowView'])[5]")
	private WebElement ViewIcon5;

	@FindBy(xpath = "(//*[@id='rowView'])[6]")
	private WebElement ViewIcon6;

	@FindBy(xpath = "(//*[@id='rowView'])[7]")
	private WebElement ViewIcon7;

	@FindBy(xpath = "(//*[@id='rowView'])[8]")
	private WebElement ViewIcon8;

	@FindBy(xpath = "(//*[@id='rowView'])[2]")
	private WebElement TSMViewIcon;

	@FindBy(xpath = "(//select[@id='filterSelection'])[2]")
	private WebElement Filter2;

	@FindBy(xpath = "(//select[@id='filterSelection'])[1]")
	private WebElement Filter1;

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

	@FindBy(id = "Approved")
	private WebElement Approve;

	@FindBy(xpath = "//div[@aria-expanded='true']")
	private WebElement Role;

	@FindBy(xpath = "//p[@class='block antialiased font-sans text-base font-light leading-relaxed text-inherit']")
	private WebElement Logout;

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

	@FindBy(xpath = "//button[normalize-space()='BACK']")
	private WebElement Back;

	@FindBy(xpath = "//button[normalize-space()='ENQUIRY']")
	private WebElement Enquiry;

	@FindBy(xpath = "(//*[@id='checkbox'])[1]")
	private WebElement MyItems1;

	@FindBy(xpath = "(//*[@id='checkbox'])[2]")
	private WebElement MyItems2;

	@FindBy(xpath = "//input[@id='checktocustomer']")
	private WebElement ToMD;

	public void enterCustomerSearch(String customer) {
		elementUtils.typeTextIntoElement(CustomerSearch, customer, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(CustomerValue, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterCreditLimit(String creditlimit) {

		elementUtils.typeTextIntoElement(CreditLimit, creditlimit, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterCreditRemark(String creditremark) {
		elementUtils.typeTextIntoElement(CreditRemark, creditremark, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterSerch1Text(String search) {
		if (Search1.isDisplayed()) {
			elementUtils.typeTextIntoElement(Search1, search, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else if (Search2.isDisplayed()) {
			elementUtils.typeTextIntoElement(Search2, search, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else {
			elementUtils.typeTextIntoElement(Search1, search, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		}
	}

	public void enterCreditDays(String creditdays) {
		elementUtils.typeTextIntoElement(CreditDays, creditdays, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterRejectionremarks(String rejectionremarks) {

		elementUtils.typeTextIntoElement(Rejectionremarks, rejectionremarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterEnquiryRemark(String enquiryremark) {

		elementUtils.typeTextIntoElement(EnquiryRemark, enquiryremark, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectChemicalType(String chemicaltype) {
		elementUtils.selectOptionInDropdownByVisibleText(ChemicalType, chemicaltype,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectProductGroup(String productgroup) {
		elementUtils.selectOptionInDropdownByVisibleText(ProductGroup, productgroup,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectFilter1(String filter) {
		if (Filter1.isDisplayed()) {
			elementUtils.selectOptionInDropdownByVisibleText(Filter1, filter, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else if (Filter2.isDisplayed()) {
			elementUtils.selectOptionInDropdownByVisibleText(Filter2, filter, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else {
			elementUtils.selectOptionInDropdownByVisibleText(Filter1, filter, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		}
	}

	public void selectResonforRejectionOption(String resonforrejection) {
		elementUtils.selectOptionInDropdownByVisibleText(Resonforrejection, resonforrejection,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterHighLevelCreditDays(String highLevelcreditdays) {
		elementUtils.typeTextIntoElement(HighLevelCreditDays, highLevelcreditdays,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickCreateCreditLimit() {

		elementUtils.clickOnElement(CreateCreditLimit2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickCreateButton() {
		elementUtils.clickOnElement(CreateButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickToMDCheckBox() {
		elementUtils.clickOnElement(ToMD, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickMyItems1() {
		if (MyItems1.isDisplayed()) {
			elementUtils.clickOnElement(MyItems1, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else if (MyItems2.isDisplayed()) {
			elementUtils.clickOnElement(MyItems2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else {
			elementUtils.clickOnElement(MyItems1, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		}
	}

	public void clickBAck() {
		elementUtils.clickOnElement(Back, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

//	public void clickMyItems2() {
//		elementUtils.clickOnElement(MyItems2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
//
//	}

	public void clickUpdateButton() {
		elementUtils.clickOnElement(Update, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickSUBMITFORREVIEWButton() {
		elementUtils.clickOnElement(SUBMITFORREVIEW, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickCreditDaysButton() {
		elementUtils.clickOnElement(CreditDaysButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickApproveButton() {
		elementUtils.clickOnElement(Approve, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickReplyButton() {
		elementUtils.clickOnElement(ReplyButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
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

	public void clickCreateCreditDays() {
		elementUtils.clickOnElement(CreateCreditDays, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickCreditControl() {
		elementUtils.clickOnElement(CreditControl, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickCancel() {
		elementUtils.clickOnElement(Cancel, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickLogOut() {
		elementUtils.clickOnElement(Role, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(Logout, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickPopupButton() throws InterruptedException {

		elementUtils.clickOnElement(Popup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickOkPopupButton() throws InterruptedException {
		// Thread.sleep(2000);
		elementUtils.clickOnElement(oKPopup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickEditIcon() throws InterruptedException {
		// Thread.sleep(2000);
		elementUtils.clickOnElement(EditIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickViewIcon1() throws InterruptedException {
		Thread.sleep(2000);
		if (ViewIcon1.isDisplayed()) {
			elementUtils.clickOnElement(ViewIcon1, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else if (ViewIcon2.isDisplayed()) {
			elementUtils.clickOnElement(ViewIcon2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else if (ViewIcon3.isDisplayed()) {
			elementUtils.clickOnElement(ViewIcon3, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else if (ViewIcon4.isDisplayed()) {
			elementUtils.clickOnElement(ViewIcon4, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else if (ViewIcon5.isDisplayed()) {
			elementUtils.clickOnElement(ViewIcon5, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else if (ViewIcon6.isDisplayed()) {
			elementUtils.clickOnElement(ViewIcon6, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else if (ViewIcon7.isDisplayed()) {
			elementUtils.clickOnElement(ViewIcon8, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else if (ViewIcon8.isDisplayed()) {
			elementUtils.clickOnElement(ViewIcon8, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else {
			elementUtils.clickOnElement(ViewIcon1, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		}
	}

//	public void clickViewIcon2() throws InterruptedException {
//		 Thread.sleep(2000);
//		elementUtils.clickOnElement(ViewIcon2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
//
//	}

//	public void clickTsmViewIcon() throws InterruptedException {
//		 Thread.sleep(2000);
//		elementUtils.clickOnElement(TSMViewIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
//
//	}

	public void clickYesPopupButton() throws InterruptedException {
		// Thread.sleep(2000);
		elementUtils.clickOnElement(YesPopup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

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
