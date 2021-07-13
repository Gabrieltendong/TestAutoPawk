package StepDefinitions;

import PageObject.ActualityPage;
import PageObject.HomePage;
import PageObject.WhoAreWePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_863StepDefs {
    @And("Click on the tab who are we? visible at the bottom and on the home page of the site")
    public void ClickOnTheTabWhoAreWe(){
        HomePage.navigateWhoAreWelink();
    }

    @When("Click on the all our news tab and select the news AXA X Rent Agile: for easier rental")
    public void ClickOnTheAllOurNewsTabs(){
        WhoAreWePage.navigateToActualyPage();
        ActualityPage.navigateActualityrentalArgile();
    }

    @Then("Click on the AXA warranty tab")
    public void ClickOnTheAxaWarrantyTab() throws IOException {
        ActualityPage.verifyLinkaxaguarantee();
    }
}
