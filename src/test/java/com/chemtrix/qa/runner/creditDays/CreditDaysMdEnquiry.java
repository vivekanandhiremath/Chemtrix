package com.chemtrix.qa.runner.creditDays;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/CreditDays_Limit.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.creditDay_Limit", "com.chemtrix.qa.hooks" }, publish = true, plugin = {
				"pretty",
				"html:report/CreditDaysHTMLReports/CreditDaysMDEnquiry.html" }, tags = "@CreateCreditDays or @BMSUBMITFORREVIEW or @CCMToMD or @MDEnquiry or @CCMEnquiry or @BMEnquiry or @TSMEnquiryReply or @MDEnquiry")
public class CreditDaysMdEnquiry {

}