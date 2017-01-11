package org.fasttrackit.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin =  {"rerun", "html:target/cucumber","json:target/jsonReports/RegisterTestRunner.json"},
        glue = {"org.fasttrackit"},
        features = {
                "src/test/resources/features/firstkid.feature"
        }
)

public class RegisterTestRunner {
}
