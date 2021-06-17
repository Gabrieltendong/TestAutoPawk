package StepDefinitions;

import PageObject.HomePage;
import PageObject.PrivacyRulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class OverlappingStepDefs {
    @Given("user in the home page disney")
    public static void navigateHome(){
        HomePage.openHomePage();
    }

    @When("In the footer, click on Privacy rules")
    public static void navigateToPrivacyRulePage(){
        HomePage.navigatePrivacyPage();
    }

    @Then("see Overlapping menu bar and page title")
    public void checkPointElement() throws IOException {
        PrivacyRulePage.verifyAlignment();
    }
}
