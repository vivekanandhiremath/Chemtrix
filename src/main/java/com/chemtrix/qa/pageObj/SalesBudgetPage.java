package com.chemtrix.qa.pageObj;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class SalesBudgetPage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public SalesBudgetPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}

	@FindBy(xpath = "//p[contains(.,'UPLOAD')]")
	private WebElement uploadbutton;

	public void clickOnUploadButton() {
		elementUtils.clickOnElement(uploadbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//input[contains(@type,'file')]")
	private WebElement choosefilebutton;

	public void selectDocument(String filepath) {
		elementUtils.typeTextIntoElement(choosefilebutton, filepath, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(xpath = "//button[.='Submit']")
	private WebElement submitbutton;

	public void clickOnSubmitButton() {
		elementUtils.clickOnElement(submitbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	@FindBy(css = "button[type='button']")
	private WebElement previewsubmitbutton;

	@FindBy(xpath = "//button[.='OK']")
	private WebElement popupokbutton;

	public void clickOnPreviewSubmitButton() {

		elementUtils.clickOnElement(previewsubmitbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(popupokbutton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void ClickonOkButtonFromTheAlertPoUp() {
		elementUtils.acceptAlert(CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.switchTo().window(tabs.get(1));
	}

	@FindBy(xpath = "//tbody//td[6]")
	List<WebElement> existingsalesbudget;

	@FindBy(xpath = "//tbody//td[7]")
	List<WebElement> newsalesbudget;

	public void checkTheValidationFromPreviewPage() {

//

		elementUtils.comparingColumnsFromATable(existingsalesbudget, newsalesbudget,
				CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}
}
