package StepDefinitions;

import PageObject.AdvicePage;
import PageObject.ComplementaryHealthPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Bug_846StepDefs {
    @And("Click on the tab all the advice and choose the advice 3 things to know about..")
    public void navigateHelpComlementaryHealth(){
        ComplementaryHealthPage.navigateToAllAdvicePage();
        AdvicePage.navigateTotreeHelpComplementaryHealth();
    }

    @Then("Click on the link visible on the page")
    public void checkLinkComparatorPage() throws IOException {
        AdvicePage.verifyComparatorLink();
    }
}
