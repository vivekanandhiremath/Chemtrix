package com.chemtrix.qa.runner.salesbudget;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.salesbudget",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/SalesBudgettHTMLReports/SalesBudget.html" }, tags = "@UploadSalesBudgetDocument", monochrome = false)

public class SalesBudget {

}