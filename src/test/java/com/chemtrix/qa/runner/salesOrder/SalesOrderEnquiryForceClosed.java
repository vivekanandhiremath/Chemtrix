package com.chemtrix.qa.runner.salesOrder;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/SalesOrder.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.salesOrder", "com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/SalesOrderHTMLReports/SalesOrderTsmForceClosed.html",
				"json:report/SalesOrderReports/SalesOrderTsmForceClosed.json" }, tags = "@CreateSalesOrderWithMandatory or @BMEnquiry or @TsmForceClosed", monochrome = false)
public class SalesOrderEnquiryForceClosed {

}