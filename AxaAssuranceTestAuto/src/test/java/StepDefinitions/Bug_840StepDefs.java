package StepDefinitions;

import PageObject.ActualityPage;
import PageObject.HomePage;
import PageObject.WhoAreWePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_840StepDefs {
    @When("Click on the tab Who are we? Then on All news")
    public void clickOnTheTabWhoAreWe(){
        HomePage.navigateWhoAreWelink();
    }

    @And("Click on the news The defeats of music: when concerts go live")
    public void clickOnTheNewsTheDefeatsOfMusicWhenConcertsGoLive() {
        WhoAreWePage.navigateToActualyPage();
        ActualityPage.navigateToMusicDefeatsLink();
    }

    @Then("Click on the Discover our offer tab")
    public void clickOnTheDiscoverOurOfferTab() throws IOException {
        ActualityPage.verifydiscoverOurOfferLink();
    }
}
