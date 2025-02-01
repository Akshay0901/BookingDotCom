package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/features/"},
glue={"StepDefinitions"},
tags="@tag1",
dryRun =false,
monochrome = true,
plugin = {"pretty","html:target/HTMLReports.html",
		"json:target/JSON/report.json",
		"junit:target/junit/reportJunit.xml"})


public class CucumberRunner {

}
