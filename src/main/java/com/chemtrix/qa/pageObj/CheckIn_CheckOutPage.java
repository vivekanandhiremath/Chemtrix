package com.chemtrix.qa.pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class CheckIn_CheckOutPage {
	WebDriver driver;
	private ElementUtils elementUtils;

	public CheckIn_CheckOutPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}

	@FindBy(xpath = "//select[@id='ddSelectVisitType']")
	private WebElement selectvisittypedropdown;

	public void selectVisitType(String visittype) {

		elementUtils.selectOptionInDropdownByVisibleText(selectvisittypedropdown, visittype,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//select[@id='ddSelectCustname']")
	private WebElement customerdropdown;

	public void selectCustomer(String customer) {

		elementUtils.selectOptionInDropdownByVisibleText(customerdropdown, customer,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//select[@id='ddSelectCVPNo']")
	private WebElement selectcvpnodropdown;

	public void selectCvpNo(String cvpno) {

		elementUtils.selectOptionInDropdownByVisibleText(selectcvpnodropdown, cvpno,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnRadioButton(String cvno) throws InterruptedException {

		WebElement cv_no = driver.findElement(By.xpath("//h2[contains(.,'" + cvno + "')]"));
//		WebElement cv_no = driver.findElement(By.xpath("//input[@value='" + cvno + "']"));
		elementUtils.clickOnElement(cv_no, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//button[.='Check In']")
	private WebElement checkInButton;
	@FindBy(xpath = "//button[.='Ok']")
	private WebElement popupokbutton;

	public void clickOnCheckInButton() {
		elementUtils.clickOnElement(checkInButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(popupokbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//textarea[@id='txtremarks']")
	private WebElement remarkstextfield;

	public void enterRemarks(String remarks) throws InterruptedException {

		elementUtils.typeTextIntoElement(remarkstextfield, remarks, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//input[@id='photo_doc_attach']")
	private WebElement choosefilebutton;

	public void uploadFile(String file) throws InterruptedException {

		elementUtils.typeTextIntoElement(choosefilebutton, file, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//button[.='Check Out']")
	private WebElement checkoutbutton;

	public void clickOnChecOut() throws InterruptedException {

		elementUtils.clickOnElement(checkoutbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(popupokbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//p[.='Office IN']")
	private WebElement officeinbutton;

	public void clickOnOfficeIn() throws InterruptedException {

		elementUtils.clickOnElement(officeinbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(popupokbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	@FindBy(xpath = "//p[.='Office Out']")
	private WebElement officeoutbutton;

	public void clickOnOfficeOut() throws InterruptedException {

		elementUtils.clickOnElement(officeoutbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		elementUtils.clickOnElement(popupokbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}
}
