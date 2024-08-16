package com.chemtrix.qa.runner.creditLimit;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/CreditDays_Limit.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.creditDay_Limit", "com.chemtrix.qa.hooks" }, publish = true, plugin = {
				"html:report/CreditLimitHTMLReports/CreditLimitMDEnquiry.html" }, tags = "@CreateCreditLimit or @BMSUBMITFORREVIEWCreditLimit or @CCMToMDCreditLimit or @MDEnquiryCreditLimit or @CCMEnquiryCreditLimit or @BMEnquiryCreditLimit or @TsmEnquiryReplyCreditLimit or @MDEnquiryCreditLimit")
public class CreditLimitMdEnquiry {

}