package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        plugin = {
                "html:target/default-reports",
                "json:target/json-reports/Cucumber.json"
        }

)

public class Runner {
}
