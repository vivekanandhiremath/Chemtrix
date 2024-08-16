package com.chemtrix.qa.runner.checkInCheckOut;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.checkInCheckOut",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/CheckInCheckOutHTMLReports/CheckInCheckOut.html" }, tags = "@OfficeVisit", monochrome = false)

public class CheckInCheckOutTestRun {

}