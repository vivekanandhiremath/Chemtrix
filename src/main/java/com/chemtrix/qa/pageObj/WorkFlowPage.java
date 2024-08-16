package com.chemtrix.qa.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class WorkFlowPage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public WorkFlowPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);

	}

	@FindBy(id = "Approved")
	private WebElement Approve;

	@FindBy(id = "Rejected")
	WebElement Reject;

	@FindBy(id = "ForceClosed")
	private WebElement ForceClose;

	@FindBy(xpath = "//button[normalize-space()='ENQUIRY']")
	private WebElement Enquiry;

	@FindBy(xpath = "(//a[@href='/dashboard/salesquotations/view'])[1]")
	private WebElement ViewIcon;

	@FindBy(xpath = "//button[.='Ok']")
	private WebElement Popup;

	@FindBy(xpath = "//button[.='Yes']")
	private WebElement YesPopup;

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

	@FindBy(xpath = "(//*[name()='text'][@id='text_In-Query'])[1]")
	private WebElement ForceClosedStatus;

	@FindBy(xpath = "(//*[name()='text' and @id='txtpending'])[1]")
	private WebElement PendingStatus;

	@FindBy(xpath = "(//*[name()='text' and @id='rejecttxt'])[1]")
	private WebElement RejectStatus;

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

	public void clickReplyButton() {
		elementUtils.clickOnElement(ReplyButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickYesPopupButton() throws InterruptedException {
		// Thread.sleep(2000);
		elementUtils.clickOnElement(YesPopup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickPopupButton() throws InterruptedException {
		// Thread.sleep(2000);
		elementUtils.clickOnElement(Popup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

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

	public void clickViewIcon() throws InterruptedException {
//		Thread.sleep(2000);
		elementUtils.clickOnElement(ViewIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
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
