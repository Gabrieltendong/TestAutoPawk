package StepDefinitions;

import PageObject.CarInsurancePage;
import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_855StepDefs {
    @And("Click on the auto insurance tab visible just at the bottom of the site's home page")
    public void clickOnTheAutoInsurance(){
        HomePage.navigateToCarInsurancePage();
    }

    @When("Click on the all the news tab and select the news The most impressive car scenes in cinema")
    public void clickOnTheAllTheNewsTabAndSelectTheNewsTheMostImpressiveCarScenesInCinema() {
        CarInsurancePage.navigateAllTheTipsPage();
        CarInsurancePage.clickTabs3Pagination();
        CarInsurancePage.navigateTotheMostImpressive();
    }

    @Then("Click on the chase tab")
    public void clickOnTheChaseTab() throws IOException {
        CarInsurancePage.verifyCarChaseLink();
    }
}
