package StepDefinitions;

import PageObject.AdvicePage;
import PageObject.CarInsurancePage;
import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_841StepDefs {
    @And("Click on the auto insurance tab visible just at the bottom of the website home page")
    public void navigateToCarInsurance(){
        HomePage.navigateToCarInsurancePage();
    }

    @And("Click on all the news")
    public void clickOnAllTheNews() {
        CarInsurancePage.navigateAllTheTipsPage();
    }

    @When("click on the auto advice tab")
    public void clickOnTheAutoAdviceTab() {
        CarInsurancePage.clickAutoAdviceLink();
    }

    @And("Click on the advice Amicable report or e-report: the match")
    public void clickOnTheAdviceAmicableReportOrEReportTheMatch() {
        AdvicePage.navigateToPagetwo();
        AdvicePage.navigatePageDetailEObrservation();
    }

    @Then("click on the Android tab for the e-finding application")
    public void clickOnTheAndroidTabForTheEFindingApplication() throws IOException {
        AdvicePage.verifyLinkApp();
    }
}
