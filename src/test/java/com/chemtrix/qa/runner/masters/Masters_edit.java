package com.chemtrix.qa.runner.masters;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/Masters.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.masters", "com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/MastersHTMLReports/MastersEdit.html",
				"json:report/MastersReports/MastersEdit.json" }, tags = "@MastersEdit")
public class Masters_edit {

}