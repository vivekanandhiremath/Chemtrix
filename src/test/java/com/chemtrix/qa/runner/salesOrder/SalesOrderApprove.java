package com.chemtrix.qa.runner.salesOrder;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/SalesOrder.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.salesOrder", "com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/SalesOrderHTMLReports/SalesOrderApprove.html",
				"json:report/SalesOrderReports/SalesOrderApprove.json" }, tags = "@CreateSalesOrderWithMandatory or @Approve", monochrome = false)
public class SalesOrderApprove {

}