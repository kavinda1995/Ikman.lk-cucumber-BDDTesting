package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Kavinda\\IdeaProjects\\Java\\IkmanCucumberBDDTesting\\src\\test\\resources\\houseads.feature"
        ,glue={"IkmanBDD"}
)

public class TestRunner {

}