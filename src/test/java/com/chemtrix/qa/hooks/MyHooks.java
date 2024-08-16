package com.chemtrix.qa.hooks;

import java.util.Properties;

import com.chemtrix.qa.factory.WebdriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.chemtrix.qa.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

	private WebDriver driver;

	@Before
	public void setup() {

		Properties prop = new ConfigReader().intializeProperties();
		driver = WebdriverManager.getInstance(prop.getProperty("browser")).getDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}


	@After
	public void tearDown(Scenario scenario) throws InterruptedException {

		String scenarioName = scenario.getName().replaceAll(" ", "_");

		if (scenario.isFailed()) {

			byte[] srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot, "image/png", scenarioName);
		}
		WebdriverManager.quitBrowser();

	}

}