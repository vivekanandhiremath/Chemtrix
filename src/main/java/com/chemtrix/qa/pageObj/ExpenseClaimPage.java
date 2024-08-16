package com.chemtrix.qa.pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class ExpenseClaimPage {
	WebDriver driver;
	private ElementUtils elementUtils;

	public ExpenseClaimPage(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		elementUtils = new ElementUtils(driver2);

	}

	@FindBy(xpath = "//p[contains(.,'CREATE CLAIM EXPENSE')]")
	private WebElement CreateExpenseClaimButton;

	public void ClickOnCreateExpenseClaimButton() {
		elementUtils.clickOnElement(CreateExpenseClaimButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='txtDateOfCustomerVisit']")
	private WebElement dateOfCustomerVisit;

	public void selectDateOfCustomervisit(String date) {
		elementUtils.JavaScriptDatePicker(dateOfCustomerVisit, date, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//select[@id='ddvehicletype']")
	private WebElement vehicleTypeDropdown;

	public void selectVehicletype(String vehicletype) {
		elementUtils.selectOptionInDropdownByVisibleText(vehicleTypeDropdown, vehicletype,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='txtvehicleno']")
	private WebElement vehicleNoTxt;

	public void EnterVehicleNo(String vehicleno) {
		elementUtils.typeTextIntoElement(vehicleNoTxt, vehicleno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@placeholder='Start KM']")
	private WebElement startKmNumfield;

	public void EnterStartKM(String startkm) {
		elementUtils.typeTextIntoElement(startKmNumfield, startkm, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@placeholder='End KM']")
	private WebElement endKmNumFiled;

	public void EnterEndKm(String endkm) {
		elementUtils.typeTextIntoElement(endKmNumFiled, endkm, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[@accept='image/*'])[1]")
	private WebElement startKmChooseFileButton;

	public void UploadStartKmFile(String startkmfile) {
		elementUtils.typeTextIntoElement(startKmChooseFileButton, startkmfile, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[@accept='image/*'])[2]")
	private WebElement endKmChooseFileButton;

	public void UploadEndKmFile(String endkmfile) {
		elementUtils.typeTextIntoElement(endKmChooseFileButton, endkmfile, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//select[@id='ddvehicletype2']")
	private WebElement vehicleType2Dropdown;

	public void selectVehicletype2(String vehicletype2) {
		elementUtils.selectOptionInDropdownByVisibleText(vehicleType2Dropdown, vehicletype2,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='txttravelfare2']")
	private WebElement travelFare2Txt;

	public void EnterTravelFare2(String travelfare2) {
		elementUtils.typeTextIntoElement(travelFare2Txt, travelfare2, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[1]")
	private WebElement breakfastCheckBox;

	public void ClickBreakFastCheckBox() {
		elementUtils.clickOnElement(breakfastCheckBox, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[2]")
	private WebElement lunchCheckBox;

	public void ClickLunchCheckBox() {
		elementUtils.clickOnElement(lunchCheckBox, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[3]")
	private WebElement dinnerCheckBox;

	public void ClickDinnerCheckBox() {
		elementUtils.clickOnElement(dinnerCheckBox, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[4]")
	private WebElement teaCheckBox;

	public void ClickTeaCheckBox() {
		elementUtils.clickOnElement(teaCheckBox, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[5]")
	private WebElement lodgingCheckBox;

	public void ClickLodgingCheckBox() {
		elementUtils.clickOnElement(lodgingCheckBox, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//input[@id='photo3_doc_attach']")
	private WebElement breakfastChooseFileButton;

	public void uploadBreakFastFile(String breakfastfile) {
		elementUtils.typeTextIntoElement(breakfastChooseFileButton, breakfastfile,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[@type='file'])[4]")
	private WebElement lunchChooseFileButton;

	public void uploadLunchFile(String lunchfile) {
		elementUtils.typeTextIntoElement(lunchChooseFileButton, lunchfile, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[@type='file'])[5]")
	private WebElement dinnerChooseButton;

	public void uploadDinnerFile(String dinnerfile) {
		elementUtils.typeTextIntoElement(dinnerChooseButton, dinnerfile, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//input[@type='file'])[6]")
	private WebElement teaChooseFileButton;

	public void uploadTeaFile(String teafile) {
		elementUtils.typeTextIntoElement(teaChooseFileButton, teafile, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//div[@class='w-1/2']//input[@id='photo1_doc_attach']")
	private WebElement lodgingChooseFileButton;

	public void uploadLodgingFile(String lodgingfile) {
		elementUtils.typeTextIntoElement(lodgingChooseFileButton, lodgingfile, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//select[@class='w-30 appearance-none rounded-md border bg-white p-2.5 text-gray-500 shadow-sm outline-none focus:border-indigo-600']")
	private WebElement lodgingcitydropdown;

	public void selectTheLOdgingCity(String lodgingcity) {

		driver.findElement(By.xpath(
				"//select[@class='w-30 appearance-none rounded-md border bg-white p-2.5 text-gray-500 shadow-sm outline-none focus:border-indigo-600']"))
				.click();

		driver.findElement(By.xpath(
				"//select[@class='w-30 appearance-none rounded-md border bg-white p-2.5 text-gray-500 shadow-sm outline-none focus:border-indigo-600']//option[.='"
						+ lodgingcity + "']"))
				.click();
//		elementUtils.selectOptionInDropdownByVisibleText(lodgingcitydropdown, lodgingcity,
//				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='txtdetailsofotherexpense']")
	private WebElement otherExpenseTxt;

	public void EnterDetailsOfOtherExpense(String detailofotherexpense) {
		elementUtils.typeTextIntoElement(otherExpenseTxt, detailofotherexpense, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@placeholder='Other Expense Amount']")
	private WebElement otherExpenseAmountnumField;

	public void EnterOtherExpenseAmount(String otherexpenseamount) {
		elementUtils.typeTextIntoElement(otherExpenseAmountnumField, otherexpenseamount,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[@id='photo8_doc_attach']")
	private WebElement otherExpenseChooseFileButton;

	public void UploadOtherExpenseFile(String otherexpensefile) {

		elementUtils.typeTextIntoElement(otherExpenseChooseFileButton, otherexpensefile,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//textarea[@id='txtRemarks']")
	private WebElement remarksTxt;

	public void EnterRemarks(String remarks) {

		elementUtils.typeTextIntoElement(remarksTxt, remarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//button[.='SUBMIT']")
	private WebElement submitbutton;
	@FindBy(xpath = "//button[.='Ok']")
	private WebElement popupokbutton;

	public void clickOnSubmitButton() {
		elementUtils.clickOnElement(submitbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(popupokbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//div[@class='row-span-3 col-span-10 col-start-2 items-center flex ']")
	private WebElement popupmessage;

	public String getExpenseClaimNoFromPopup() {

		String message = elementUtils.getTextFromElement(popupmessage, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		message.substring(30, 34);

		return message;

	}

	@FindBy(xpath = "(//a[@href='/dashboard/expenseclaims/Edit'])[1]")
	private WebElement editIcon;

	public void clickOnEditIcon() {
		elementUtils.clickOnElement(editIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//button[.='UPDATE']")
	private WebElement updatebutton;

	public void clickOnUpdateButton() {
		elementUtils.clickOnElement(updatebutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "(//a[@href='/dashboard/expenseclaims/View'])[1]")
	private WebElement viewicon;

	public void SearchAndVerifyAndclickOViewtIcon(String entrytype, String expenseclaimno) {

		if (entrytype.equalsIgnoreCase("manual")) {
			elementUtils.typeTextIntoElement(searchtxtfield, expenseclaimno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			WebElement ele = driver.findElement(By.xpath("//td[10]"));
			String status = elementUtils.getTextFromElement(ele, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
			System.out.println(status);
			if (status.equalsIgnoreCase("In-Query") || status.equalsIgnoreCase("Pending")) {

				elementUtils.clickOnElement(viewicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

			} else {

				Assert.assertTrue(false,
						"The status should have been In-Query or Pending But the status is : " + status);
			}

		} else {

			elementUtils.clickOnElement(viewicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		}

	}

	@FindBy(xpath = "//input[@id='search']")
	private WebElement searchtxtfield;

//	public void searchExpenseClaimID(String expenseclaimno) {
////		elementUtils.typeTextIntoElement(searchtxtfield, expenseclaimno, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
//	}

	@FindBy(xpath = "//button[@id='Approved']")
	private WebElement approvebutton;

	public void clickOnApproveButton() {
		elementUtils.clickOnElement(approvebutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

}