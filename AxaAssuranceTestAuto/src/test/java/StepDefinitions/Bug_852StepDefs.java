package StepDefinitions;

import PageObject.RetirementInsurancePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Bug_852StepDefs {
    @Given("go to home retirement insurance")
    public void goToHomeRetirementInsurance(){
        RetirementInsurancePage.openHomePage();
    }

    @Then("image banner not load")
    public void imageBannerNotLoad() throws IOException {
        RetirementInsurancePage.verifyLoadImage();
    }
}
