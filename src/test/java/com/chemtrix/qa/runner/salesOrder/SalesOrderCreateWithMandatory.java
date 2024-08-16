package com.chemtrix.qa.runner.salesOrder;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.salesOrder",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/SalesOrderHTMLReports/CreateSalesOrderWithMandatory.html",
				"json:report/SalesOrderReports/CreateSalesOrderWithMandatory.json" }, tags = "@CreateSalesOrderWithMandatory", monochrome = false)
public class SalesOrderCreateWithMandatory {

}