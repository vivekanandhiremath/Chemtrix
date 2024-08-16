package com.chemtrix.qa.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class CollectionEntryPage {
	@FindBy(id = "txtbank")
	private WebElement bankNameTextField;

	@FindBy(xpath = "//input[@id='txtbank']")
	private WebElement OnlinebankNameTextField;

	@FindBy(id = "txtamt")
	WebElement amountNumField;

	@FindBy(xpath = "//input[@id='txtamt']")
	private WebElement onlineAmount;

	@FindBy(id = "txtChequeNo")
	WebElement chequeNumberNumfield;

	@FindBy(id = "txtChqdate")
	WebElement chequeDate;

	@FindBy(xpath = "//input[@id='txtUTR']")
	private WebElement utrnoNumfield;

	@FindBy(xpath = "//input[@id=' Txt_Date']")
	private WebElement transactionDate;

	WebDriver driver;
	ElementUtils elementUtils;

	public CollectionEntryPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);

	}

	@FindBy(xpath = "//p[contains(.,'CREATE COLLECTION ENTRY')]")
	private WebElement createCollectionENtryButton;

	public void ClickOnCreateCollectionENtryButton() {
		elementUtils.clickOnElement(createCollectionENtryButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='txtCustAuto']")
	private WebElement customerTxtField;

	@FindBy(xpath = "//li[@id='txtCustAuto-option-0']")
	private WebElement customerOption;

	public void EnterCustomerName(String customer) {
		elementUtils.typeTextIntoElement(customerTxtField, customer, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(customerOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//textarea[@id='Remarks']")
	private WebElement remarksTxtField;

	public void EnterRemarks(String remarks) {
		elementUtils.typeTextIntoElement(remarksTxtField, remarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='txtInvoiceAuto']")
	private WebElement invoiceNoDropdown;
	@FindBy(xpath = "//li[@id='txtInvoiceAuto-option-0']")
	private WebElement invoiceDropdownoption;

	public void SelectInvoiceNo(String invoiceno) {
		elementUtils.typeTextIntoElement(invoiceNoDropdown, invoiceno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(invoiceDropdownoption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//select[@id='DropDownSelect' and @class]")
	private WebElement modeOfPaymentDropdown;

	public void EnterBankDetails(String modeofpayment, String bank, String amount, String checknumber,
			String chequedate, String utrno, String transactiondate) {
		elementUtils.selectOptionInDropdownByVisibleText(modeOfPaymentDropdown, modeofpayment,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		if (modeofpayment.equalsIgnoreCase("Cheque")) {

			elementUtils.typeTextIntoElement(bankNameTextField, bank, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.typeTextIntoElement(amountNumField, amount, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.typeTextIntoElement(chequeNumberNumfield, checknumber, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.javaScriptType(chequeDate, chequedate, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		} else if (modeofpayment.equalsIgnoreCase("Online")) {

			elementUtils.typeTextIntoElement(OnlinebankNameTextField, bank, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.typeTextIntoElement(amountNumField, amount, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.typeTextIntoElement(utrnoNumfield, utrno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			elementUtils.typeTextIntoElement(transactionDate, transactiondate, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} else if (modeofpayment.equalsIgnoreCase("Cash")) {
			elementUtils.typeTextIntoElement(amountNumField, amount, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else {
			System.out.println("No Mode Of Payment Match");
		}
	}

	public void EditBankDetails(String modeofpayment, String bank, String amount, String checknumber, String chequedate,
			String utrno, String transactiondate) {
		elementUtils.selectOptionInDropdownByVisibleText(modeOfPaymentDropdown, modeofpayment,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		if (modeofpayment.equalsIgnoreCase("Cheque")) {

			elementUtils.typeTextIntoElement(EditBankNameTxtField, bank, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.typeTextIntoElement(amountNumField, amount, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.typeTextIntoElement(chequeNumberNumfield, checknumber, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.javaScriptType(chequeDate, chequedate, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		} else if (modeofpayment.equalsIgnoreCase("Online")) {

			elementUtils.typeTextIntoElement(EditBankNameTxtField, bank, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.typeTextIntoElement(amountNumField, amount, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.typeTextIntoElement(editutrnotxt, utrno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			elementUtils.javaScriptType(transactionDate, transactiondate, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		} else if (modeofpayment.equalsIgnoreCase("Cash")) {
			elementUtils.typeTextIntoElement(amountNumField, amount, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		} else {
			System.out.println("No Mode Of Payment Match");
		}
	}

	@FindBy(xpath = "(//textarea[@id='Remarks'])[2]")
	private WebElement paymentRemarksTxtField;

	public void EnterPaymentRemarks(String paymentremarks) {
		elementUtils.typeTextIntoElement(paymentRemarksTxtField, paymentremarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//button[contains(.,'SUBMIT')]")
	private WebElement submitButton;

	public void ClickOnSubmitButton() {
		elementUtils.clickOnElement(submitButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//button[contains(.,'CANCEL')]")
	private WebElement cancelButton;

	public void ClickOnCancelButton() {
		elementUtils.clickOnElement(cancelButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void EnterAmount(String amount) {
		elementUtils.typeTextIntoElement(amountNumField, amount, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//button[.='Ok']")
	private WebElement popUpOKButton;

	public void ClickOnOKButton() {
		elementUtils.clickOnElement(popUpOKButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//a[@href='/dashboard/collectionentrys/edit'])[1]")
	private WebElement EditIcon;

	public void ClickOnEditIcon() {

//		elementUtils.handleStaleElementException(EditIcon);

		elementUtils.clickOnElement(EditIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void EditCustomerRemarksTextfield(String customerremarks) {
		elementUtils.typeTextIntoElement(remarksTxtField, customerremarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void EditModeOfPayment(String modeofpayment) {
		modeOfPaymentDropdown.click();
		elementUtils.selectOptionInDropdownByVisibleText(modeOfPaymentDropdown, modeofpayment,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='txtbank']")
	private WebElement EditBankNameTxtField;

	public void EditBankName(String bank) {
		elementUtils.typeTextIntoElement(EditBankNameTxtField, bank, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='txtamt']")
	private WebElement EditchequeamountNumField;

	public void EditChequeAmount(String amount) {
		elementUtils.typeTextIntoElement(EditchequeamountNumField, amount, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[@id='txtchqno'])")
	private WebElement EditchequeNumberNumfield;

	public void EditChequeNumber(String checknumber) {
		elementUtils.typeTextIntoElement(EditchequeNumberNumfield, checknumber, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//a[@href='/dashboard/collectionentrys/view'])[1]")
	private WebElement viewIcon;

	public void ClickOnViewIcon() {
		elementUtils.clickOnElement(viewIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='search']")
	private WebElement searchTxt;

	public void SearchForCollectionEntry() {
		String collectionEntryno = getCollectionEntryNo();
		elementUtils.typeTextIntoElement(searchTxt, collectionEntryno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//button[@id='Approved']")
	private WebElement approveButton;

	public void ClickOnApproveButton() {
		elementUtils.clickOnElement(approveButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(popUpOkButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//button[.='UPDATE']")
	private WebElement UpdateButton;

	public void ClickOnUpdateButton() {
		elementUtils.clickOnElement(UpdateButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//button[.='Ok']")
	private WebElement popUpOkButton;

	public void ClickOnPopUpOkButton() {
		elementUtils.clickOnElement(popUpOkButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//td[@role='cell'][1])[1]")
	private WebElement collectionentryno;

	public String getCollectionEntryNo() {
		String collectionEntryno = elementUtils.getTextFromElement(collectionentryno,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		System.out.println(collectionEntryno);
		return collectionEntryno;
	}

	@FindBy(xpath = "//input[@id='txtUTR']")
	private WebElement editutrnotxt;

}