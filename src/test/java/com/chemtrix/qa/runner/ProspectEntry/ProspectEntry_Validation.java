package com.chemtrix.qa.runner.ProspectEntry;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.chemtrix.qa.stepdefinitions.prospectEntry",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/ProspectEntryHTMLReports/CreateProspectValidation.html",
				"json:report/ProspectEntryReports/CreateProspectValidation.json" }, tags = "@CreateProspectValidation")
public class ProspectEntry_Validation {

}