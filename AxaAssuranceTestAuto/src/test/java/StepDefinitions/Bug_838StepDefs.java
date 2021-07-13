package StepDefinitions;

import PageObject.AdvicePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Bug_838StepDefs {
    @And("Select World Alzheimer's Day: helping loved ones")
    public void clickOnTheWordAlzheimersDay(){
        AdvicePage.navigateToworldAlzheimerDayAstuselink();
    }

    @Then("click entreaidants.fr, this link not found")
    public void clickEntreaidantsFrThisLinkNotFound() throws IOException {
        AdvicePage.verifyentreaidantsLink();
    }
}
