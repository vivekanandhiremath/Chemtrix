package com.chemtrix.qa.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chemtrix.qa.utils.CommonUtils;
import com.chemtrix.qa.utils.ElementUtils;

public class HomePage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public HomePage(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		elementUtils = new ElementUtils(driver2);

	}

	@FindBy(xpath = "//p[.='My Activity']")
	private WebElement myactivityicon;

	@FindBy(xpath = "(//p[.='Prospect Entry'])[1]")
	private WebElement prospectEntryIcon;

	@FindBy(xpath = "(//p[contains(.,'dashboard')])[1]")
	private WebElement dashboardIcon;

	@FindBy(xpath = "(//p[contains(.,'Sales Quotations')])[1]")
	private WebElement salesquotatonsIcon;

	@FindBy(xpath = "(//p[contains(.,'Sales Orders')])[1]")
	private WebElement salesOrderIcon;

	@FindBy(xpath = "//p[.='Visit Planning']")
	private WebElement visitplanningIcon;

	@FindBy(xpath = "(//p[.='Credit Control'])[1]")
	private WebElement creditcontrolIcon;

	@FindBy(xpath = "//p[.='Check In/Check Out']")
	private WebElement checkIn_checkOutIcon;

	@FindBy(xpath = "//p[.='Collection Entry']")
	private WebElement CollectionEntryIcon;

	@FindBy(xpath = "//h2[contains(.,'Welcome')]")
	private WebElement welcometext;

	@FindBy(xpath = "(//p[.='Expense Claim'])[1]")
	private WebElement expenseclaimmenuicon;

	@FindBy(xpath = "//p[.='Master']")
	private WebElement mastermenuicon;

	@FindBy(xpath = "//p[.='Sales']")
	private WebElement salesmenuicon;

	public ExpenseClaimPage clickOnExpenseClaimIcon() {
		elementUtils.clickOnElement(myactivityicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(expenseclaimmenuicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new ExpenseClaimPage(driver);
	}

	public boolean displayWelcomeText() {

		return elementUtils.displayStatusOfElement(welcometext, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public String getWelcomeText() {

		return elementUtils.getTextFromElement(welcometext, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void clickOnDashboardIcon() {
		elementUtils.clickOnElement(dashboardIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public ProspectEntryPage clickOnProspectEntryIcon() {
		elementUtils.clickOnElement(salesmenuicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(prospectEntryIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new ProspectEntryPage(driver);
	}

	public SalesQuotationPage clickOnSalesQuotationIcon() {

		elementUtils.clickOnElement(salesmenuicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(salesquotatonsIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new SalesQuotationPage(driver);
	}

	public SalesOrderPage clickOnSalesOrderIcon() {

		elementUtils.clickOnElement(salesmenuicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(salesOrderIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new SalesOrderPage(driver);
	}

	public VisitPlanningPage clickOnVisitPlanningIcon() {
		elementUtils.clickOnElement(myactivityicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(visitplanningIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new VisitPlanningPage(driver);

	}

	public CreditDaysLimitPage clickOnCreditControlIcon() {
		elementUtils.clickOnElement(mastermenuicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(creditcontrolIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new CreditDaysLimitPage(driver);

	}

	public CollectionEntryPage clickOnCollectionEntryIcon() {
		elementUtils.clickOnElement(myactivityicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(CollectionEntryIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new CollectionEntryPage(driver);

	}

	public CheckIn_CheckOutPage clickOnCheckIn_CheckOutIcon() {
		elementUtils.clickOnElement(myactivityicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(checkIn_checkOutIcon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new CheckIn_CheckOutPage(driver);
	}

	@FindBy(xpath = "(//p[contains(.,'Sales Target')])[1]")
	private WebElement salestargetmenuicon;

	public SalesTargetPage clickOnSalesTargetPageIcon() {

		elementUtils.clickOnElement(salesmenuicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(salestargetmenuicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new SalesTargetPage(driver);
	}

	@FindBy(xpath = "(//p[contains(.,'Sales Budget')])[1]")
	private WebElement salesbudgetmenuicon;

	public SalesBudgetPage clickOnSalesBudgetIcon() {
		elementUtils.clickOnElement(salesbudgetmenuicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new SalesBudgetPage(driver);
	}

	@FindBy(xpath = "(//p[contains(.,'Credit Release')])[1]")
	private WebElement creditreleasemenu;

	public SalesBudgetPage clickOnCreditRelease() {
		elementUtils.clickOnElement(salesmenuicon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

		elementUtils.clickOnElement(creditreleasemenu, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new SalesBudgetPage(driver);
	}

}