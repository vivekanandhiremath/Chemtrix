package com.chemtrix.qa.runner.creditLimit;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/CreditDays_Limit.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.creditDay_Limit", "com.chemtrix.qa.hooks" }, publish = true, plugin = {
				"pretty",
				"html:report/CreditLimitHTMLReports/CreditLimitCCMReject.html" }, tags = "@CreateCreditLimit or @BMSUBMITFORREVIEWCreditLimit or @CCMRejectCreditLimit")
public class CreditLimitCcmReject {

}