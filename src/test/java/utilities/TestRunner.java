package utilities;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber.html"}
, features = "src/test/java/features/Purchaseproduct.feature"
        , glue = {"browsercontrol","StepDefinitions"}
       ,tags ="@SmokeTest"
)

//Cucumber uses reporter plugins to produce reports that contain information about what scenarios have passed or failed.
//we can generate local reports using built-in reporter plugins
public class TestRunner {
}
