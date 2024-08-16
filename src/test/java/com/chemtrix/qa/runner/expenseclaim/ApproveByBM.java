package com.chemtrix.qa.runner.expenseclaim;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/ExpenseClaim.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.expenseclaim", "com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/ExpenseClaimHTMLReports/ApproveByBM.html", }, tags = "@ApproveByBm")
public class ApproveByBM {

}