package StepDefinitions;

import PageObject.ContactPage;
import PageObject.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_811StepDefs {
    @Given("go to contact page")
    public void goToConactPage(){
        ContactPage.openContactPage();
        HomePage.handleCookie();
    }

    @When("Click on By making an appointment with an advisor")
    public void clickOnByMakingAnAppointmentWithAnAdvisor() {
        ContactPage.clickbtnRDVAdvisor();
    }

    @Then("Click on Professionals in the footer")
    public void clickOnProfessionalsInTheFooter() throws IOException, InterruptedException {
        ContactPage.clickProLink();
    }
}
