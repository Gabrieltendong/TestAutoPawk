package StepDefinitions;

import PageObject.ProPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_860StepDefs {
    @And("Click on the tab all the advice and select the company incentive advice")
    public void selectAdvice(){
        ProPage.navigateToOurAdviceLink();
        ProPage.navigateToInterssement();
    }

    @When("Click on the PEE tab")
    public void verifyLink() throws IOException {
        ProPage.verifyLinkpee();
    }

    @Then("Page not found PEE")
    public void PageNotFoundPEE(){

    }
}
