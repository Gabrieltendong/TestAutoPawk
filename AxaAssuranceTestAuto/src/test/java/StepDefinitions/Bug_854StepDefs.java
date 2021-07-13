package StepDefinitions;

import PageObject.CarInsurancePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_854StepDefs {
    @When("Click on the all the news tab and select the Eco-badge Crit'Air news: let's go!")
    public void clickOnTheAllTheNewsTabs(){
        CarInsurancePage.navigateAllTheTipsPage();
        CarInsurancePage.navigateToEcoBadgeLink();
    }

    @Then("Click on click certicate link")
    public void clickOnClickCerticateLink() throws IOException {
        CarInsurancePage.verifycerticatLink();
    }
}
