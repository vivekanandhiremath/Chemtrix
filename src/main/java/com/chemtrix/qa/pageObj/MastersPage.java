package com.chemtrix.qa.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class MastersPage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public MastersPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);

	}

	@FindBy(xpath = "(//a[@href='/dashboard/Customermaster/Customercreation/view'])[1]")
	@CacheLookup
	WebElement EditIcon;

	@FindBy(xpath = "(//select[contains(@class,'rounded-md border bg-white p-2.5 text-gray-500 shadow-sm outline-none focus:border-indigo-600')])[1]")
	@CacheLookup
	WebElement CustomerGrading;

	@FindBy(xpath = "//textarea[@id='Remarks']")
	@CacheLookup
	WebElement Remarks;

	@FindBy(xpath = "(//select[contains(@class,'rounded-md border bg-white p-2.5 text-gray-500 shadow-sm outline-none focus:border-indigo-600')])[2]")
	@CacheLookup
	WebElement Payment;

	@FindBy(xpath = "(//select[contains(@class,'rounded-md border bg-white p-2.5 text-gray-500 shadow-sm outline-none focus:border-indigo-600')])[3]")
	@CacheLookup
	WebElement Volume;

	@FindBy(xpath = "(//select[contains(@class,'rounded-md border bg-white p-2.5 text-gray-500 shadow-sm outline-none focus:border-indigo-600')])[4]")
	@CacheLookup
	WebElement Collection;

	@FindBy(xpath = "(//select[contains(@class,'rounded-md border bg-white p-2.5 text-gray-500 shadow-sm outline-none focus:border-indigo-600')])[5]")
	@CacheLookup
	WebElement Profitability;

	@FindBy(xpath = "(//select[contains(@class,'rounded-md border bg-white p-2.5 text-gray-500 shadow-sm outline-none focus:border-indigo-600')])[6]")
	@CacheLookup
	WebElement Sales;

	@FindBy(xpath = "//button[.='Update']")
	@CacheLookup
	WebElement Update;

	@FindBy(xpath = "//button[.='CANCEL']")
	@CacheLookup
	WebElement Cancel;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	@CacheLookup
	WebElement Popup;

	public void clickEditIcon() throws InterruptedException {
		Thread.sleep(3000);
		elementUtils.clickOnElement(EditIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectCustomerGrading(String customergrading) {
		elementUtils.selectOptionInDropdownByVisibleText(CustomerGrading, customergrading,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterRemarks(String remarks) {
		elementUtils.typeTextIntoElement(Remarks, remarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectPayment(String payment) {
		elementUtils.selectOptionInDropdownByVisibleText(Payment, payment, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectVolume(String volume) {
		elementUtils.selectOptionInDropdownByVisibleText(Volume, volume, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectCollection(String collection) {
		elementUtils.selectOptionInDropdownByVisibleText(Collection, collection, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectProfitability(String profitability) {
		elementUtils.selectOptionInDropdownByVisibleText(Profitability, profitability,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectSales(String sales) {
		elementUtils.selectOptionInDropdownByVisibleText(Sales, sales, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickUpdate() {
		elementUtils.clickOnElement(Update, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickPopUp() {
		elementUtils.clickOnElement(Popup, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

}
