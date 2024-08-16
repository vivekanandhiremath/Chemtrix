package com.chemtrix.qa.runner.salesQuotation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.salesQuotation",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/SalesQuotationHTMLReports/CreateSalesQuotationSaveAsDraft.html",
				"json:report/SalesQuotationReports/CreateSalesQuotationSaveAsDraft.json" }, tags = "@CreateSalesQuotationSaveAsDraft")
public class Sales_Quotation_SaveAsDraft {

}