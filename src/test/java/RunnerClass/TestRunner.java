package RunnerClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"C:\\Users\\JasdeepKaur\\OrangeHRM\\src\\test\\java\\FeatureFile\\Login.feature"},
                glue = {"StepDefinition"},
                monochrome = true,
                plugin = {"pretty","json:Report/Cucumber.json","junit:Report/XMLReport.xml",
                        "html:target/cucumberReport"}

        )

public class TestRunner {

}