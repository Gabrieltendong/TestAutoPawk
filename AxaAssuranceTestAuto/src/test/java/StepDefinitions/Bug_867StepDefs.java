package StepDefinitions;

import PageObject.ProPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_867StepDefs {

    @When("Click on the all advice tab and select the advice How to declare a work stoppage?")
    public void clickOnTheAllAdviceTabAndSelectTheAdviceHowToDeclareaworkStoppage(){
        ProPage.navigateToOurAdviceLinkTab1();
        ProPage.navigateToAdviceStopWork();
    }

    @Then("click on the tab formality")
    public void clickOnTheTabFormality() throws IOException {
        ProPage.verifyLinkformality();
    }
}
