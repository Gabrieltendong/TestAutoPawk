package StepDefinitions;

import PageObject.ProgrammeAffiliatePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class ErrorFormFAQ {
    @Given("From the affiliate page")
    public void openFAQPage(){
        ProgrammeAffiliatePage.navigateToFAQ();
    }

    @When("Fill out the form \"You have a question\"")
    public void FillOutTheForm(){
        ProgrammeAffiliatePage.sendQuestion();
        ProgrammeAffiliatePage.clickBtnSend();
    }

    @Then("see message error")
    public void seeMeesageError() throws InterruptedException, IOException {
        ProgrammeAffiliatePage.verifyMessageError();
    }
}
