package com.chemtrix.qa.runner.salesQuotation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.salesQuotation",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/SalesQuotationHTMLReports/CreateSalesQuotationWithAllField.html",
				"json:report/SalesQuotationReports/CreateSalesQuotationWithAllField.json" }, tags = "@CreateSalesQuotation")
public class Sales_Quotation_CreateWithAll {

}