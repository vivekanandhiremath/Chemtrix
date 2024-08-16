package com.chemtrix.qa.runner.VisitPlan;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.visitPlanning",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/VisitPlanHTMLReports/SaveAsDraftAllField.html",
				"json:report/VisitPlanReports/SaveAsDraftAllField.json" }, tags = "@SaveAsDraftAllField")
public class Visit_Plan_Save_As_Draft_AllField {

}