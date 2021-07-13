package StepDefinitions;

import PageObject.MortgageInsurancePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Bug_848StepDefs {
    @Given("go to Home page mortgage insurance")
    public void goToHome(){
        MortgageInsurancePage.openHomePage();
    }

    @Then("verify link do a simulation")
    public void verifyLinkDoASimulation() throws IOException {
        MortgageInsurancePage.verifyDoASimulationPage();
    }
}
