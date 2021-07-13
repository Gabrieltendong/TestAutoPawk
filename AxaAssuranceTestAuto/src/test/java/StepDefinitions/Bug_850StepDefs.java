package StepDefinitions;

import PageObject.HomeInsurancePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_850StepDefs {
    @And("Click on the all news tab, after that be sure to select the Burglary news: should we be more vigilant in 2019?")
    public void navigateToBurglaryNews(){
        HomeInsurancePage.navigateToAllNews();
        HomeInsurancePage.navigateToNewsburglaryLink();
    }

    @Then("Click on the Discover tab")
    public void clickOnTheDiscoverTab() throws IOException {
        HomeInsurancePage.verifyDiscoverLink();
    }
}
