package StepDefinitions;

import PageObject.ProPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_862StepDefs {
    @When("Click on the tab all the councils and select the council Social protection in question")
    public void selectAdvice(){
        ProPage.navigateToOurAdviceLinkTab2();
        ProPage.navigateToSocialprotection();
    }

    @Then("Click on the director's liability tab")
    public void verifyLinkdirectorLiability() throws IOException {
        ProPage.verifyLinkdirector();
    }
}
