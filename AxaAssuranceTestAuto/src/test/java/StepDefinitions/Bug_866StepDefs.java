package StepDefinitions;

import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_866StepDefs {
    @When("Click on the Professionals and companies tab")
    public void clickOnTheProfessionalsAndCompaniesTab(){
        HomePage.navigateToProPage();
    }

    @And("click on the Services and assistance tab located at the top right corner of the site's home page")
    public void clickOnTheServicesAndAssistanceTabLocatedAtTheTopRightCornerOfTheSiteSHomePage() {
        HomePage.navigateToServiceSupportpage();
    }

    @Then("verify link Log in to your customer area")
    public void verifyLinkLogInToYourCustomerArea() throws IOException {
        HomePage.verifylogcustomerareaLink();
    }
}
