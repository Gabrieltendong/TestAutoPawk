package StepDefinitions;

import PageObject.HealthInsurancePage;
import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_847StepDefs {

    @And("At the level of the footer, click on complementary collective health")
    public void clickOnComplementaryCollectiveHealth(){
        HomePage.navigateToHealthlink();
    }

    @When("The page opens, click on discover our offer located in the complementary health management panel")
    public void thePageOpensClickOnDiscoverOurOfferLocatedInTheComplementaryHealthManagementPanel() {
        HealthInsurancePage.navigateTodiscoverOurOfferLink();
    }

    @And("The page opens by clicking on legal mentions")
    public void thePageOpensByClickingOnLegalMentions() {
        HealthInsurancePage.clicklegalNoticelink();
    }

    @Then("verify content modal")
    public void verifyContentModal() throws IOException {
        HealthInsurancePage.verifyContentModal();
    }
}
