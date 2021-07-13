package StepDefinitions;

import PageObject.BankAccountPage;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Bug_928StepDefs {
    @Then("on tab Opening an account image not alignment")
    public void comparePositionElement() throws IOException {
        BankAccountPage.comparePosition();
    }
}
