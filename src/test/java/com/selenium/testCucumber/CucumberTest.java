package com.selenium.testCucumber;


import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\workspace\\Themes_and_Epics_Module\\src\\test\\resources\\mainProject.feature", glue= {"StepDefinitions"},
monochrome=true,
plugin = {"pretty", "junit:target/JUnitReports/report.html","json:target/JSONReports/report.json",
		"html:target/HtmlReports"}
)

public class CucumberTest {

}
