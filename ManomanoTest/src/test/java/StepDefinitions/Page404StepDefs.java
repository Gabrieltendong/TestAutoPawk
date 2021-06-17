package StepDefinitions;

import PageObject.ProgrammeAffiliatePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Page404StepDefs {
    @Given("navigate to affiliate program")
    public void navigateToAffiliatepgram(){
        ProgrammeAffiliatePage.openPage();
    }
    @When("click to button Become a partner")
    public void clickTobuttonBecomeAPartner() throws IOException {
        ProgrammeAffiliatePage.verifybadLink();
    }
    @Then("user redirect 404 page error")
    public void userRedirect4040PageError(){

    }
}
