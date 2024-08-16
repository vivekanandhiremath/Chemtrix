package com.chemtrix.qa.runner.salesOrder;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/SalesOrder.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.salesOrder", "com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/SalesOrderHTMLReports/SalesOrderForceClosed.html",
				"json:report/SalesOrderReports/SalesOrderForceClosed.json" }, tags = "@CreateSalesOrderWithMandatory or @BMForceClosed", monochrome = false)
public class SalesOrderForceCloseBM {

}