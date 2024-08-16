package com.chemtrix.qa.runner.salesQuotation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.salesQuotation",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:target/CucumberReports/CucumberHTMLReports/CucumberReport.html",
				"json:target/CucumberReports/JsonCucumberReports/CucumberReport.json" }, tags = "@Approve")
public class Sales_Quotation_Search {

}