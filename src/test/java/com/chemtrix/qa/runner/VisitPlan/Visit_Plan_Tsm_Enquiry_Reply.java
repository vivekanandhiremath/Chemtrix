package com.chemtrix.qa.runner.VisitPlan;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/VisitPlanning.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.visitPlanning", "com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/VisitPlanHTMLReports/VisitPlanningTsmEnquiryReply.html",
				"json:report/VisitPlanReports/VisitPlanningTsmEnquiryReply.json" }, tags = "@CreateWithMandatory or @BMEnquiry or @TsmEnquiryReply")
public class Visit_Plan_Tsm_Enquiry_Reply {

}