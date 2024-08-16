package com.chemtrix.qa.runner.collectionEntry;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/CollectionEntry.feature", glue = { "com.chemtrix.qa.stepdefinitions.CollectionEntry",
		"com.chemtrix.qa.hooks" }, publish = true, plugin = { "pretty",
				"html:report/ProspectEntryHTMLReports/CreateProspect.html",
				"json:report/ProspectEntryReports/CreateProspect.json" }, tags = "@CreateCollectionEntry")

public class CreateCollectionEntry {

}
