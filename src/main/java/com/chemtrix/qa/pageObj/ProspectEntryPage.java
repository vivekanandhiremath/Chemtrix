package com.chemtrix.qa.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class ProspectEntryPage {

	@FindBy(xpath = "//p[.='CREATE PROSPECT ENTRY']")
	@CacheLookup
	WebElement CreatProspectEntry;

	@FindBy(id = "companyname")
	@CacheLookup
	WebElement txt_Company_Name;

	@FindBy(id = "cont_person_name")

	WebElement txt_Contact_Person_Name;

	@FindBy(id = "phone_number")
	WebElement txt_Mobile_Number;

	@FindBy(id = "address")
	WebElement txt_Address1;

	@FindBy(id = "email_id")
	@CacheLookup
	WebElement txt_Email_Address;

	@FindBy(xpath = "//select[@id='industry']")
	WebElement DD_Industry;

	@FindBy(id = "photo_doc_attach")
	@CacheLookup
	WebElement txt_Photo_Document_Attachment;

	@FindBy(id = "Remarks")
	@CacheLookup
	WebElement txt_Remarks;

	@FindBy(id = "overall_potent_quan")
	@CacheLookup
	WebElement txt_Overall_Potential_Quantity;

	@FindBy(id = "mon_pot_quant")
	@CacheLookup
	WebElement txt_Monthly_Potential_Quantity;

	@FindBy(id = "uom")
	@CacheLookup
	WebElement uomdropdown;

	@FindBy(id = "competitor_name")
	@CacheLookup
	WebElement txt_Competitor_Name;

	@FindBy()
	@CacheLookup
	WebElement txt_SL_Type;

	@FindBy(id = "pan_no")
	@CacheLookup
	WebElement txt_PAN_number;

	@FindBy(id = "gst_no")
	@CacheLookup
	WebElement txt_GST_number;

	@FindBy(xpath = "//select[@id='state']")
	@CacheLookup
	WebElement DD_State;

	@FindBy()
	@CacheLookup
	WebElement txt_Currency;

	@FindBy(xpath = "//button[normalize-space()='CREATE']")
	@CacheLookup
	WebElement btn_Create;

	@FindBy(xpath = "//button[normalize-space()='CANCEL']")
	@CacheLookup
	WebElement btn_Cancel;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	@CacheLookup
	WebElement btn_Update;

	@FindBy(xpath = "//button[normalize-space()='Ok']")
	@CacheLookup
	WebElement ProspectPopup;

	@FindBy(xpath = "(//*[name()='path'])[5]")
	@CacheLookup
	WebElement EditIcon;

	WebDriver driver;
	private ElementUtils elementUtils;

	public ProspectEntryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);

	}

	public void ClickCreatProspectEntry() {
		elementUtils.clickOnElement(CreatProspectEntry, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_Company_Name(String companyname) throws InterruptedException {

		elementUtils.typeTextIntoElement(txt_Company_Name, companyname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_Contact_Person_Name(String contactpersonname) {
		elementUtils.typeTextIntoElement(txt_Contact_Person_Name, contactpersonname,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_Mobile_Number(String MobileNumber) {

		elementUtils.typeTextIntoElement(txt_Mobile_Number, MobileNumber, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_Address1(String Address) {

		elementUtils.typeTextIntoElement(txt_Address1, Address, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_Email_Address(String EmailAddress) {
		elementUtils.typeTextIntoElement(txt_Email_Address, EmailAddress, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Select_Industry_DropDown(String Industry) {

		elementUtils.selectOptionInDropdownByVisibleText(DD_Industry, Industry, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_Photo_Document_Attachment(String PhotoDocument) {

		elementUtils.typeTextIntoElement(txt_Photo_Document_Attachment, PhotoDocument,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_Remarks(String Remarks) {
		elementUtils.typeTextIntoElement(txt_Remarks, Remarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_Overall_Potential_Quantity(String OverallPotential) {
		elementUtils.typeTextIntoElement(txt_Overall_Potential_Quantity, OverallPotential,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_Monthly_Potential_Quantity(String MonthlyPotential) {

		elementUtils.typeTextIntoElement(txt_Monthly_Potential_Quantity, MonthlyPotential,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void SelectUom(String UOM) {

		elementUtils.selectOptionInDropdownByVisibleText(uomdropdown, UOM, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_Competitor_Name(String Competitor) {
		elementUtils.typeTextIntoElement(txt_Competitor_Name, Competitor, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_SL_Type(String sltype) {
		elementUtils.typeTextIntoElement(txt_SL_Type, sltype, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_PAN_number(String PAN) {
		elementUtils.typeTextIntoElement(txt_PAN_number, PAN, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Enter_GST_number(String GST) {
		elementUtils.typeTextIntoElement(txt_GST_number, GST, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Select_State_DropDown(String State) {
		elementUtils.selectOptionInDropdownByVisibleText(DD_State, State, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Click_Create() {
		elementUtils.clickOnElement(btn_Create, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void Click_Cancel() {
		elementUtils.clickOnElement(btn_Cancel, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Click_PropsPopup() {
		elementUtils.clickOnElement(ProspectPopup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Click_EditIcon() {
		elementUtils.clickOnElement(EditIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void Click_Update() {
		elementUtils.clickOnElement(btn_Update, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//input[contains(@id,'addresstwo')]")
	private WebElement address2textfield;

	public void enterAddress2(String address2) {
		elementUtils.typeTextIntoElement(address2textfield, address2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[contains(@id,'addressthree')]")
	private WebElement address3textfield;

	public void enterAddress3(String address3) {
		elementUtils.typeTextIntoElement(address3textfield, address3, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityTextfield;

	public void enterCity(String city) {
		elementUtils.typeTextIntoElement(cityTextfield, city, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
}
