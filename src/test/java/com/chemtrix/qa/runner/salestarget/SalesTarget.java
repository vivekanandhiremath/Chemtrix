package com.chemtrix.qa.runner.salestarget;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.salestarget",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/SalesTargettHTMLReports/SalesTarget.html" }, tags = "@UploadSalesTargetDocument", monochrome = false)

public class SalesTarget {

}