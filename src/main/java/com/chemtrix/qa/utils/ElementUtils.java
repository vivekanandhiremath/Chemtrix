package com.chemtrix.qa.utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

	WebDriver driver;

	public ElementUtils(WebDriver driver) {

		this.driver = driver;

	}

	public void clickOnElement(WebElement element, long durationInSeconds) {

		WebElement webElement = waitForElement(element, durationInSeconds);
		webElement.click();

	}

	public void DisplayedElement(WebElement element, long durationInSeconds) {

		WebElement webElement = waitForElement(element, durationInSeconds);
		webElement.isDisplayed();

	}

	public void typeTextIntoElement(WebElement element, String textToBeTyped, long durationInSeconds) {

		WebElement webElement = waitForElement(element, durationInSeconds);
		// webElement.click();
		webElement.clear();
		webElement.sendKeys(textToBeTyped);

	}

	private WebElement waitForElement(WebElement element, long durationInSeconds) {

		WebElement webElement = null;

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Throwable e) {
			e.printStackTrace();
		}

		return webElement;

	}

	public void selectOptionInDropdownByVisibleText(WebElement element, String dropDownOption, long durationInSeconds) {
		try {
			WebElement webElement = waitForElement(element, durationInSeconds);
			Select select = new Select(webElement);
			select.selectByVisibleText(dropDownOption);
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

	public void selectOptionInDropdownByValue(WebElement element, String dropDownOption, long durationInSeconds) {

		WebElement webElement = waitForElement(element, durationInSeconds);
		Select select = new Select(webElement);
		select.selectByValue(dropDownOption);

	}

	public void selectOptionInDropdownByIndex(WebElement element, int dropDownOption, long durationInSeconds) {

		WebElement webElement = waitForElement(element, durationInSeconds);
		Select select = new Select(webElement);
		select.deselectByIndex(dropDownOption);

	}

	public void selectOptionInDropdownByJavascript(WebElement element, String dropDownOption, long durationInSeconds) {

		WebElement webElement = waitForElement(element, durationInSeconds);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='" + dropDownOption + "'", webElement);

	}

	public void acceptAlert(long durationInSeconds) {

		Alert alert = waitForAlert(durationInSeconds);
		alert.accept();

	}

	public void dismissAlert(long durationInSeconds) {

		Alert alert = waitForAlert(durationInSeconds);
		alert.dismiss();

	}

	public Alert waitForAlert(long durationInSeconds) {

		Alert alert = null;

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			alert = wait.until(ExpectedConditions.alertIsPresent());
		} catch (Throwable e) {
			e.printStackTrace();
		}

		return alert;

	}

	public void mouseHoverAndClick(WebElement element, long durationInSeconds) {

		WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
		Actions actions = new Actions(driver);
		actions.moveToElement(webElement).click().build().perform();

	}

	public WebElement waitForVisibilityOfElement(WebElement element, long durationInSeconds) {

		WebElement webElement = null;

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			webElement = wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Throwable e) {
			e.printStackTrace();
		}

		return webElement;

	}

	public void javaScriptClick(WebElement element, long durationInSeconds) {

		WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].click();", webElement);

	}

	public void javaScriptType(WebElement element, String textToBeTyped, long durationInSeconds) {

		WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].value='" + textToBeTyped + "'", webElement);

	}

	public String getTextFromElement(WebElement element, long durationInSeconds) {

		WebElement webElement = waitForElement(element, durationInSeconds);
		return webElement.getText();

	}

	public boolean displayStatusOfElement(WebElement element, long durationInSeconds) {

		try {
			WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);
			return webElement.isDisplayed();
		} catch (Throwable e) {
			return false;
		}

	}

	// public void DatePicking1(String day, String date, String month, String year,
	// long durationInSeconds) {
	// WebElement element;
	// WebElement dateWidget = waitForElement(element, durationInSeconds);
	// List<WebElement> columns =

	// for (WebElement cell : columns) {
	// // Select 13th Date
	// if (cell.getText().equals("13")) {
	// cell.findElement(By.linkText("13")).click();
	// break;
	// }
	// }
	// }

	public void DatePicking(WebElement element, long durationInSeconds) {
		WebElement dateWidget = waitForElement(element, durationInSeconds);
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns) {
			// Select 13th Date
			if (cell.getText().equals("13")) {
				cell.findElement(By.linkText("13")).click();
				break;
			}
		}
	}

	public void JavaScriptDatePicker(WebElement element, String Date, long durationInSeconds) {
		WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);

		webElement.clear();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].valueAsNumber = Date.parse(arguments[1])", element, Date);

		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true, cancelable: true }))",

				element);
	}

	public void JavaScriptTimePick(WebElement element, String Time, long durationInSeconds) {
		WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);

		webElement.clear();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value', arguments[1]);", element, Time);

		js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true, cancelable: true }))",

				element);

	}

	public void JavaScriptScrollTillBottomOfPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}

	public void JavaScriptScrollByPixel(int xnum, int ynum, long durationInSeconds) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + xnum + "," + ynum + ")", "");
	}

	public void JavaScriptScrollTillElementVisibility(WebElement element, long durationInSeconds) {
		WebElement webElement = waitForVisibilityOfElement(element, durationInSeconds);

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);

	}

	public void printDropdownOptions(WebElement element) {

		Select select = new Select(element);
		List<WebElement> list = select.getOptions();
		for (WebElement element2 : list) {
			System.out.println(element2.getText());
		}
	}

	public void getTheCountOfTheDropdownOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		System.out.println(options.size());

	}

	public void comparingColumnsFromATable(List<WebElement> firstcolumnelements, List<WebElement> secondcolumnelements,
			long durationInSeconds) {
		List<WebElement> firstcolumnwebelements = waitForWebelements(firstcolumnelements, durationInSeconds);

		System.out.println("Existing count " + firstcolumnwebelements.size());

		// Step 1: Convert the extracted text values to integers for comparison
		List<Integer> firstcolumnexistingvalues = new ArrayList<>();
		for (int i = 0; i < firstcolumnwebelements.size(); i++) {
			String firstcolumnexistingvaluesText = firstcolumnwebelements.get(i).getText();
			try {
				int firstcolumnvalues = Integer.parseInt(firstcolumnexistingvaluesText);
				firstcolumnexistingvalues.add(firstcolumnvalues);
				System.out.println("existing value : " + firstcolumnvalues);

			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}

		List<WebElement> secondcolumnwebelements = waitForWebelements(secondcolumnelements, durationInSeconds);
		System.out.println("New Quantity count " + secondcolumnwebelements.size());

		// Step 1: Convert the extracted text values to integers for comparison
		List<Integer> secondcolumnexistingvalues = new ArrayList<>();
		for (int i = 0; i < secondcolumnwebelements.size(); i++) {
			String secondcolumnexistingvaluesText = secondcolumnwebelements.get(i).getText();
			try {
				int secondcolumnvalues = Integer.parseInt(secondcolumnexistingvaluesText);
				secondcolumnexistingvalues.add(secondcolumnvalues);
				System.out.println("new quantity: " + secondcolumnvalues);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

		}

		// You can perform any other desired comparisons or actions based on your
		// requirements.
		if (firstcolumnexistingvalues.size() != secondcolumnexistingvalues.size()) {
			System.out.println("Note: The number of existing quantities and new quantities do not match.");
		} else {
			for (int i = 0; i < firstcolumnexistingvalues.size(); i++) {
				int existingValue = firstcolumnexistingvalues.get(i);
				int newValue = secondcolumnexistingvalues.get(i);

				if (newValue > existingValue) {
					System.out
							.println("The new quantity in row " + (i + 1) + " is greater than the existing quantity.");
				} else if (newValue < existingValue) {
					System.out.println("The new quantity in row " + (i + 1) + " is less than the existing quantity.");
				} else {
					System.out.println("The new quantity in row " + (i + 1) + " is equal to the existing quantity.");
				}
			}
		}

	}

	public List<WebElement> waitForWebelements(List<WebElement> elements, long durationInSeconds) {

		List<WebElement> webelement = null;

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			webelement = wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		} catch (Throwable e) {
			e.printStackTrace();
		}

		return webelement;

	}

	public boolean handleStaleElementException(WebElement element) {
		boolean outcome = false;
		int repeat = 0;
		while (repeat <= 3) {
			try {
				element.click();
				outcome = true;
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}
			repeat++;
		}
		return outcome;
	}
}
