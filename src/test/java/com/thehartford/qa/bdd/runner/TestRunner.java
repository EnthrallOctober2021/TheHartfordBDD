package com.thehartford.qa.bdd.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(	tags = "@auto",
					features = {"features"},
					glue = {"classpath:/com/thehartford/qa/bdd/hooks",
							"classpath:/com/thehartford/qa/bdd/commonSteps",
							"classpath:/com/thehartford/qa/bdd/autoSteps",
							"classpath:/com/thehartford/qa/bdd/homeSteps"},
					monochrome = true,
					dryRun = false,
					plugin = {"json:target/jsonReport.json", "junit:target/xmlReport.xml", "html:target/htmlReport.html"})
public class TestRunner {

}
