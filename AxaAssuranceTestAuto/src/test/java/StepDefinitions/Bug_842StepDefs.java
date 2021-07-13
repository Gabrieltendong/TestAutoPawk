package StepDefinitions;

import PageObject.CreditSimulatorPage;
import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_842StepDefs {
    @Given("go to credit simulator page")
    public void opensimulatorPage(){
        CreditSimulatorPage.openHome();
        HomePage.handleCookie();
    }

    @When("Click on the plus + to create a new simulation")
    public void createSimulator(){
        CreditSimulatorPage.addSimulator();
    }

    @And("Delete simulation n ° 1")
    public void deleteSimulator(){
        CreditSimulatorPage.deleteSimulator();
    }

    @Then("Create two new simulations and compare name")
    public void createTwoSimulatorAndCompareName() throws IOException {
        CreditSimulatorPage.addSimulator();
        CreditSimulatorPage.addSimulator();
        CreditSimulatorPage.compareTitleSimulator();
    }
}
