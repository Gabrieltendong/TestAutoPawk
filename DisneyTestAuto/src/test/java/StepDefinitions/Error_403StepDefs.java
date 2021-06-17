package StepDefinitions;

import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Error_403StepDefs {

    @And("Click on the Service tab in the footer")
    public void clickOnTheServiceTabInTheFooter() {
        HomePage.clickOnServiceTab();
    }

    @And("Click on Contact us")
    public void clickOnContactUs() {
        HomePage.navigateToContactUs();
    }

    @And("In the Other contacts section under 'ORGANIZE A PROFESSIONAL AND BUSINESS TOURISM EVENT', click on the second 'click here'")
    public void clickBtnLink(){
        HomePage.navigateToBusinessTorismLink();
    }

    @Then("see the page 403")
    public void verifymessageError() throws IOException {
        HomePage.verifyMessageError();
    }
}
