package StepDefinitions;

import PageObject.HomeInsurancePage;
import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_853StepDefs {
    @When("Click on the home insurance tab just at the bottom of the site's home page")
    public void clickOnTheHomeInsurance(){
        HomePage.navigateToHomeInsurancePage();
    }

    @And("Click on the all news tab, after that make sure you select the news AXA launches the #CaComptePourMoi operation!")
    public void clickOnTheAllNewsTabAfterThatMakeSureYouSelectTheNewsAXALaunchesTheCaComptePourMoiOperation() {
        HomeInsurancePage.navigateToAllNews();
        HomeInsurancePage.navigateToTab4();
        HomeInsurancePage.navigateToNewsOperation();
    }

    @Then("Click on the Facebook tab available")
    public void clickOnTheFacebookTabAvailable() throws IOException {
        HomeInsurancePage.verifyfacebookPage();
    }
}
