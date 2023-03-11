package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/features",
            glue="stepDefinitions",
            dryRun = true,
            tags = "@NEW-2023",
            plugin = {"pretty","html:test-output",
                                "junit:target/cucumber-reports/Cucumber.xml"}
    )
    public class TestRunner {

}
