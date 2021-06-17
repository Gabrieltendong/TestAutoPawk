import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
        },
        features = {"src/test/resources/features"},
        glue = {"StepDefinitions"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
        @AfterSuite(alwaysRun = true)
        public void afterActivities(){
                System.out.println("********************* afterActivities ***********************");
        }
}
