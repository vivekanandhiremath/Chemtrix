package com.chemtrix.qa.runner.salesQuotation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/salesquo.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.salesQuotation", "com.chemtrix.qa.hooks" }, publish = true, plugin = {
				"pretty", "html:report/SalesQuotationHTMLReports/SalesQuotationApprove.html",
				"json:report/SalesQuotationReports/SalesQuotationApprove.json" }, tags = "@CreateSalesQuotationWithMandatory or @BMEnquiry or @TsmForceClosed")
public class Sales_Quotation_EnquiryForceCloseByTsm {

}