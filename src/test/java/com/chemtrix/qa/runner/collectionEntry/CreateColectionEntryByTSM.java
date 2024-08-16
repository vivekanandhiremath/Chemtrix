package com.chemtrix.qa.runner.collectionEntry;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/CollectionEntry.feature", glue = {
		"com.chemtrix.qa.stepdefinitions.CollectionEntry", "com.chemtrix.qa.hooks" }, publish = true, plugin = {
				"pretty",
				"html:report/CollectioEntryHTMLReports/CreateCollecTionENtryByTSM.html" }, tags = "@CreateCollectionEntryByTSM")

public class CreateColectionEntryByTSM {
}
