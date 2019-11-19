package com.geico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt" //this plugin will generate txt file of list of failed scenarios
        },
        tags = {"@autopolicy"}, //tags = {"@negative or @autopolicy"}
        features = {"src/test/resources/features" //to specify where are the features
        },
        //feature contains scenarios
        //every scenario is like a test
        //where is the implementation for features
        glue = {"com/geico/step_definitions"},
        //dry run - to generate step definitions automatically
        //you will see them in the console output
        dryRun = true
)

public class CukesRunner {
}
