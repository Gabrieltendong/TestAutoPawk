package StepDefinitions;

import PageObject.ProPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_861StepDefs {
    @When("Click on the tab all the advice and select the advice How to choose your car insurance?")
    public void selectAdvice(){
        ProPage.navigateToOurAdviceLink();
        ProPage.navigateToCarInsurancePage();
    }

    @Then("Click on the fleet contract tab")
    public void verifyLink() throws IOException {
        ProPage.verifyLinkfleetContract();
    }
}
