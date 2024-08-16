package com.chemtrix.qa.runner.salesQuotation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/salesquo.feature", glue = { "com.chemtrix.qa.stepdefinitions.salesQuotation",
		"com.chemtrix.qa.hooks"}, publish = true, plugin = { "pretty",
				"html:report/SalesQuotationHTMLReports/SalesQuotationReject.html",
				"json:report/SalesQuotationReports/SalesQuotationReject.json" }, tags = "@CreateSalesQuotationWithMandatory or @Reject" , monochrome = false)
public class Sales_Quotation_Reject {

}