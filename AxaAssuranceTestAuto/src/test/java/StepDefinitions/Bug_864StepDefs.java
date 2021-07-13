package StepDefinitions;

import PageObject.ActualityPage;
import PageObject.WhoAreWePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_864StepDefs {
    @When("Click on the all our news tab and select the news Weather alerts: it changes your life to be warned!")
    public void clickOnTheAllOurnewsTabAndSelectTheNewsWeatherAlerts(){
        WhoAreWePage.navigateToActualyPage();
        ActualityPage.navigateToWeatherAlert();
    }

    @Then("Click on the Customer Area tab.")
    public void clickOnTheCustomAreaTab() throws IOException {
        ActualityPage.verifyLinkClientArea();
    }
}
