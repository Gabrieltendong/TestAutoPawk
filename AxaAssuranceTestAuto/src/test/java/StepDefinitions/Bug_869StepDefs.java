package StepDefinitions;

import PageObject.AdvicePage;
import PageObject.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_869StepDefs {
    @When("click on the all advice tab and select the medical teleconsultation advice")
    public void navigateToTeleconsultationAdvice() throws InterruptedException {
        HomePage.navigateAllOurAdvicePage();
        AdvicePage.navigateToTeleconsultationAdvice();
    }

    @Then("click on the tab discover our offer")
    public void clickOnTheTabDiscoverOurOffer() throws IOException {
        AdvicePage.verifyDiscoverOurOfferLink();
    }
}
