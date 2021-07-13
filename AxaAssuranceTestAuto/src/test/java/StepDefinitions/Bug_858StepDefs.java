package StepDefinitions;

import PageObject.AdvicePage;
import PageObject.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_858StepDefs {
    @When("Click on the all advice tab and select the advice Social protection for the manager")
    public void clickOnTheAllAdvice(){
        HomePage.navigateAllOurAdvicePage();
        AdvicePage.navigateToAdviceScialProtect();
    }

    @Then("Click on the insurance tab and the corporate director's pension tab")
    public void clickOnTheInsuranceTabAndTheCorporateDirectorSPensionTab() throws IOException {
        AdvicePage.verifymanagerialForesightLink();
    }
}
