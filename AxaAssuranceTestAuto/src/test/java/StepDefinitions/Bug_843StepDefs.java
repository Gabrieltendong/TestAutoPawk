package StepDefinitions;

import PageObject.ActualityPage;
import PageObject.AdvicePage;
import PageObject.ComplementaryHealthPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_843StepDefs {
    @When("Click on the all advice tab and Click on the Complementary health news tab")
    public void ClickOnTheComplementaryHealthNews(){
        ComplementaryHealthPage.navigateToAllAdvicePage();
        AdvicePage.navigateTocomplementaryAstusesLink();
    }

    @And("Select the news Reminiscence: an idea of therapy against Alzheimer's")
    public void selectTheNewsReminiscenceAnIdeaOfTherapyAgainstAlzheimerS() {
        ActualityPage.navigateToreminisceneLink();
    }

    @Then("Select the Dax.fr source which redirects to a page without information")
    public void selectTheDaxFrSourceWhichRedirectsToAPageWithoutInformation() throws IOException {
        ActualityPage.verifyDaxLink();
    }
}

