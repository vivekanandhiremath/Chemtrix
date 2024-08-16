package com.chemtrix.qa.pageObj;

import javax.activation.CommandMap;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class VisitPlanningPage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public VisitPlanningPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);

	}

	@FindBy(xpath = "//p[contains(.,'CREATE VISIT PLANNING')]")
	private WebElement createVisitPlanningButton;

	@FindBy(xpath = "//input[@id='Autocomplete']")
	private WebElement customerField;

	@FindBy(xpath = "//select[@id='label_PurposeVisit']")
	private WebElement purposeVisitDropdown;

	@FindBy(xpath = "//input[@id=' Txt_Visit Date']")
	private WebElement visitDateCalender;

	@FindBy(xpath = "//input[contains(@id,'Visit Time')]")
	private WebElement visitTimeClock;

	@FindBy(xpath = "//input[@id=' Txt_Visit Date']")
	private WebElement EditvisitDateCalender;

	@FindBy(xpath = "//input[@id=' TextVisit Time']")
	private WebElement EditvisitTimeClock;

	@FindBy(xpath = "//input[@id='inputPhoneNumber']")
	private WebElement phoneNumberNumericField;

	@FindBy(xpath = "//input[@id='inputEmail']")
	private WebElement Email;

	@FindBy(xpath = "//input[@id='txt_Phone Number']")
	private WebElement EditphoneNumberNumericField;

	@FindBy(xpath = "//input[@id='TextEmail']")
	private WebElement EditEmail;

	@FindBy(xpath = "//textarea[@id='Remarks']")
	private WebElement Remarks;

	@FindBy(xpath = "//textarea[@id='Address']")
	private WebElement Address;

	@FindBy(xpath = "(//input[@id='Autocomplete'])[2]")
	private WebElement customerField2;

	@FindBy(xpath = "(//select[@id='label_PurposeVisit'])[2]")
	private WebElement purposeVisitDropdown2;

	@FindBy(xpath = "(//input[@id=' Txt_Date'])[2]")
	private WebElement visitDateCalender2;

	@FindBy(xpath = "(//input[contains(@id,'Visit Time')])[2]")
	private WebElement visitTimeClock2;

	@FindBy(xpath = "(//td[@class=' px-6 py-4'])[1]")
	private WebElement tabledata;

	@FindBy(xpath = "(//td[@class='whitespace-normal  break-words px-6 py-4 text-sm'])[2]")
	private WebElement QuotationNo;

	@FindBy(xpath = "(//input[@id='inputPhoneNumber'])[2]")
	private WebElement phoneNumberNumericField2;

	@FindBy(xpath = "(//input[@id='Input Email'])[2]")
	private WebElement Email2;

	@FindBy(xpath = "(//textarea[@id='Remarks'])[2]")
	private WebElement Remarks2;

	@FindBy(xpath = "(//textarea[@id='Address'])[2]")
	private WebElement Address2;

	@FindBy(xpath = "//button[@id='SUBMIT']")
	WebElement Submit;

	@FindBy(xpath = "//button[.='UPDATE']")
	WebElement Update;

	@FindBy(xpath = "//button[.='Ok']")
	WebElement PopUp;

	@FindBy(xpath = "//button[.='SAVE AS DRAFT']")
	WebElement SaveAsDraft;

	@FindBy(xpath = "//button[.='ADD ENTRY']")
	WebElement AddEntry;

	@FindBy(xpath = "(//a[@href='/dashboard/visitplanning/edit'])[1]")
	WebElement Edit;

	@FindBy(id = "Approved")
	private WebElement Approve;

	@FindBy(id = "Rejected")
	WebElement Reject;

	@FindBy(id = "ForceClosed")
	private WebElement ForceClose;

	@FindBy(xpath = "//button[normalize-space()='ENQUIRY']")
	private WebElement Enquiry;

	@FindBy(xpath = "(//a[@href='/dashboard/visitplanning/view'])[1]")
	private WebElement ViewIcon;

	@FindBy(xpath = "//button[.='Ok']")
	private WebElement Popup;

	@FindBy(xpath = "//button[.='Yes']")
	private WebElement YesPopup;

	@FindBy(xpath = "(//td)[3]")
	private WebElement CvpNo;

	@FindBy(id = "search")
	private WebElement search;

	@FindBy(xpath = "//button[normalize-space()='BACK']")
	private WebElement Back;

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

	@FindBy(xpath = "//li[@id='Autocomplete-option-0']")
	private WebElement customeroption;

	public void clickOnCreateVisitPlanningButton() {

		elementUtils.clickOnElement(createVisitPlanningButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterRandomCustomer(String customer) {

		elementUtils.typeTextIntoElement(customerField, customer, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterSLCustomer(String customer) {
		elementUtils.typeTextIntoElement(customerField, customer, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(customeroption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterPLCustomer(String customer) {
		elementUtils.typeTextIntoElement(customerField, customer, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(customeroption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectThePurposeVisitDropdownValue(String purposeVisit) {
		elementUtils.selectOptionInDropdownByVisibleText(purposeVisitDropdown, purposeVisit,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterDate(String date) throws InterruptedException {

		elementUtils.typeTextIntoElement(visitDateCalender, date, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void ClickOnDate2(String date) throws InterruptedException {

		elementUtils.typeTextIntoElement(visitDateCalender2, date, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectTimefromVisitTimeClock(String VisitTime) {
		elementUtils.JavaScriptTimePick(visitTimeClock, VisitTime, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterPhoneNumberNumericField(String PhoneNumber) {
		elementUtils.typeTextIntoElement(phoneNumberNumericField, PhoneNumber, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void editPhoneNumberNumericField(String updatedPhoneNumber) {
		elementUtils.typeTextIntoElement(EditphoneNumberNumericField, updatedPhoneNumber,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectEditDatefromVisitDateCalender(String Day, String date, String month, String year) {
		elementUtils.clickOnElement(EditvisitDateCalender, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		WebElement elment = driver.findElement(
				By.xpath("//div[@aria-label='Choose " + Day + ", " + date + " " + month + " " + year + "']"));

		elment.click();
	}

	public void selectEditTimefromVisitTimeClock(String editVisitTime) {
		elementUtils.JavaScriptTimePick(EditvisitTimeClock, editVisitTime, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void editEmailField(String updatedemail) {

		elementUtils.typeTextIntoElement(EditEmail, updatedemail, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterEmailField(String email) {

		elementUtils.typeTextIntoElement(Email, email, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterAddressField(String address) {

		elementUtils.typeTextIntoElement(Address, address, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterRemarkField(String remark) {

		elementUtils.typeTextIntoElement(Remarks, remark, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterCustomer2(String Customer2) {
		elementUtils.typeTextIntoElement(customerField2, Customer2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectThePurposeVisitDropdownValue2(String purposeVisit2) {
		elementUtils.selectOptionInDropdownByVisibleText(purposeVisitDropdown2, purposeVisit2,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectTimefromVisitTimeClock2(String VisitTime2) {
		elementUtils.JavaScriptTimePick(visitTimeClock2, VisitTime2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterPhoneNumberNumericField2(String PhoneNumber2) {
		elementUtils.typeTextIntoElement(phoneNumberNumericField2, PhoneNumber2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterEmailField2(String email2) {

		elementUtils.typeTextIntoElement(Email2, email2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterAddressField2(String address2) {

		elementUtils.typeTextIntoElement(Address2, address2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterRemarkField2(String remark2) {

		elementUtils.typeTextIntoElement(Remarks2, remark2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickSubmit() {

		elementUtils.javaScriptClick(Submit, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(PopUp, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void GetQuotationDate() {

		elementUtils.DisplayedElement(QuotationNo, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		System.out.println(
				"Quotation no:" + elementUtils.getTextFromElement(QuotationNo, CommonUtils.EXPLICIT_WAIT_BASIC_TIME));

	}

	public void clickUpdate() {

		elementUtils.javaScriptClick(Update, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickPopUp() {

		elementUtils.clickOnElement(PopUp, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickSaveAsDraft() {

		elementUtils.javaScriptClick(SaveAsDraft, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(PopUp, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickAddEntry() {

		elementUtils.javaScriptClick(AddEntry, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickEdit() throws InterruptedException {
		Thread.sleep(2000);
		elementUtils.clickOnElement(Edit, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
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
		Thread.sleep(2000);
		elementUtils.clickOnElement(ViewIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickBAck() {
		elementUtils.clickOnElement(Back, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void SearchAndVerifyAndclickOViewtIcon(String entrytype, String cvpno) {

		if (entrytype.equalsIgnoreCase("manual")) {
			elementUtils.typeTextIntoElement(search, cvpno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement ele = driver.findElement(By.xpath("//td[12]"));
			String status = elementUtils.getTextFromElement(ele, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			System.out.println(status);

			if (status.equalsIgnoreCase("In-Query") || status.equalsIgnoreCase("Pending")) {
				try {
					elementUtils.clickOnElement(ViewIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
				} catch (StaleElementReferenceException e) {
					e.printStackTrace();
				}

			} else {
				driver.close();
				Assert.assertTrue(false,
						"The status should have been In-Query or Pending But the status is : " + status);
			}

		} else if (entrytype.equalsIgnoreCase("auto")) {

			if (driver.findElement(By.xpath("//td[12]")).getText().equalsIgnoreCase("In-Query")
					|| driver.findElement(By.xpath("//td[12]")).getText().equalsIgnoreCase("Pending")) {
				try {
					elementUtils.clickOnElement(ViewIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
				} catch (StaleElementReferenceException e) {
					e.printStackTrace();
				}

			} else {

				Assert.assertTrue(false, "The status should have been In-Query or Pending But the status is : "
						+ driver.findElement(By.xpath("//td[12]")).getText());
			}

		}

	}

//	public String getcvpno() {
//		String cvpno = CvpNo.getText();
//		return cvpno;
//
//	}

//	public String getSalesApprovedOrderStatus() throws InterruptedException {
//		Thread.sleep(2000);
//		String salesordersatus = ApprovedStatus.getText();
//		return salesordersatus;
//
//	}

//	public String getSalesOrderRejectStatus() throws InterruptedException {
//		Thread.sleep(2000);
//		String salesordersatus = RejectStatus.getText();
//		return salesordersatus;
//
//	}

//	public String getSalesOrderPendingStatus() throws InterruptedException {
//		Thread.sleep(2000);
//		String salesordersatus = PendingStatus.getText();
//		return salesordersatus;
//
//	}

//	public String getSalesOrderEnquiryStatus() throws InterruptedException {
//		Thread.sleep(2000);
//		String salesordersatus = EnquiryStatus.getText();
//		return salesordersatus;
//
//	}

//	public String getSalesOrderForceclosedStatus() throws InterruptedException {
//		Thread.sleep(2000);
//		String salesordersatus = ForceClosedStatus.getText();
//		return salesordersatus;
//
//	}

//	public void SearchCvpNo(String CvpNo) {
//
//		elementUtils.typeTextIntoElement(search, CvpNo, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
//
//	}

	@FindBy(xpath = "(//td[12])[1]")
	private WebElement bmfirstrecordstatus;

	@FindBy(xpath = "(//td[11])[1]")
	private WebElement tsmfirstrecordstatus;

	@FindBy(xpath = "(//td[3])[1]")
	private WebElement firstrecordcvpno;

	public void bMcheckForStatus() {
		String status = elementUtils.getTextFromElement(bmfirstrecordstatus, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		String cvpno = elementUtils.getTextFromElement(firstrecordcvpno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		System.out.println(cvpno + " " + " : " + " " + status);
	}

	public void tsmcheckForStatus() {
		String status = elementUtils.getTextFromElement(tsmfirstrecordstatus, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		String cvpno = elementUtils.getTextFromElement(firstrecordcvpno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		System.out.println(cvpno + " " + " : " + " " + status);
	}

	
	@FindBy(xpath = "//select[@id='Dropdown Dashboard']")
	private WebElement filterdropdown;
	
	
	
	
	public void autoApproveAllPendingAndInquery(String filteroption) {
		
		
		elementUtils.selectOptionInDropdownByVisibleText(filterdropdown,filteroption , CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		
		
		


	}

}