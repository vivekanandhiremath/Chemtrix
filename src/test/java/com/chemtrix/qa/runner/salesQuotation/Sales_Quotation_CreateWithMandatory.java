package com.chemtrix.qa.runner.salesQuotation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.salesQuotation",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/SalesQuotationHTMLReports/CreateSalesQuotationWithMandatory.html",
				"json:report/SalesQuotationReports/CreateSalesQuotationWithMandatory.json" }, tags = "@CreateSalesQuotationWithMandatory")
public class Sales_Quotation_CreateWithMandatory {

}