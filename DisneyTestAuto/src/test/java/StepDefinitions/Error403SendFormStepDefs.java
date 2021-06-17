package StepDefinitions;

import PageObject.AboutEnterprisePage;
import PageObject.ContactPage;
import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Error403SendFormStepDefs {
    @When("Click on Company Information in the About section of the footer")
    public void navigateAboutEnterprise(){
        HomePage.clickTabAbout();
        HomePage.navigateToInfosEnterprise();
    }

    @And("Click on contact")
    public void navigateContactPage(){
//        AboutEnterprisePage.handleCookie();
//        AboutEnterprisePage.navigateContactPage();
//        AboutEnterprisePage.handleCookie();
    }

    @Then("Fill in the form and send")
    public void handleSendform() throws InterruptedException, IOException {
//        ContactPage.sendMessage();
    }
}
