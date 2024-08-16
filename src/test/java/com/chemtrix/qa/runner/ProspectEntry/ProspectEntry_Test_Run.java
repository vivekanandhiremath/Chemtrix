package com.chemtrix.qa.runner.ProspectEntry;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Prospect Entry.feature", glue = { "com.chemtrix.qa.stepdefinitions.prospectEntry",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/ProspectEntryHTMLReports/ProspectEntry.html",
				"json:report/ProspectEntryReports/ProspectEntry.json" }, tags = "@ProspectEntry")
public class ProspectEntry_Test_Run {

}