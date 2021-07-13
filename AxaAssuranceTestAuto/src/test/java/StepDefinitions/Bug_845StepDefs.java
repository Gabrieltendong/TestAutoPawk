package StepDefinitions;

import PageObject.HomePage;
import PageObject.PersonalLoanPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_845StepDefs {
    @Given("go to home page Personal loan")
    public void openHome(){
        PersonalLoanPage.openHomePage();
        HomePage.handleCookie();
    }

    @When("Click on Make a simulation")
    public void clickOnMakeASimulation() {
        PersonalLoanPage.navigateToSimalutionPage();
    }

    @Then("Compare personal loan price page personal loan on simalation page")
    public void comparePersonalLoanPricePagePersonalLoanOnSimalationPage() throws IOException {
        PersonalLoanPage.comparecreditAmount();
    }
}
