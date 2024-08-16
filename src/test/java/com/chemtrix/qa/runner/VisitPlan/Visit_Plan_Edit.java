package com.chemtrix.qa.runner.VisitPlan;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.visitPlanning",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/VisitPlanHTMLReports/EditVisitPlan.html",
				"json:report/VisitPlanReports/EditVisitPlan.json" }, tags = "@EditVisitPlan")
public class Visit_Plan_Edit {

}