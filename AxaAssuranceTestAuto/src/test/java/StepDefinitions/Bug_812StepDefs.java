package StepDefinitions;

import PageObject.HomePage;
import PageObject.LegaleNoticePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_812StepDefs {
    @When("At the level of the footer, click on Legal notices")
    public void clicklegalNotices(){
        HomePage.navigateToLegaleNoticeLink();
    }

    @Then("The Legal Notice page opens, go to the information for bank users section and click on the link mini guide of the French banking federation")
    public void checkIfLinkbankingFederationIsWorking() throws IOException {
        LegaleNoticePage.clickBtnInfoAccountBank();
        LegaleNoticePage.verifyfederationLink();
    }
}
