package StepDefinitions;

import PageObject.AdvicePage;
import PageObject.ComplementaryHealthPage;
import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_849StepDefs {
    @When("Click on the complementary health tab")
    public void clickOnTheComplementaryHealth(){
        HomePage.navigateToComplementaryHealth();
    }

    @And("Click on the tab all advice, after that, select the advice Back to university: the student social security contribution failed")
    public void clickTheAdviceBackToUniversity() {
        ComplementaryHealthPage.navigateToAllAdvicePage();
        AdvicePage.navigateToBackSchoolAdvice();
    }

    @Then("Click on the link etudiants.gouv.fr.")
    public void clickOnTheLinkEtudiantsGouvFr() throws IOException {
        AdvicePage.verifyStudentsGovLink();
    }
}
