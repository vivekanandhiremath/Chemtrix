package com.chemtrix.qa.runner.salesQuotation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.salesQuotation",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/SalesQuotationHTMLReports/SalesQuotationValidation.html",
				"json:report/SalesQuotationReports/SalesQuotationValidation.json" }, tags = "@CreateSalesQuotationValidation")
public class Sales_Quotation_Validation {

}