package StepDefinitions;

import PageObject.HomePage;
import PageObject.ProPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_859StepDefs {
    @And("Click on the tab professionals and companies visible at the top and on the home page of the site")
    public void navigateToProPage(){
        HomePage.navigateToProPage();
    }

    @And("Click on the tab all advice and select the advice Prevent environmental risk")
    public void navigateToAdvice(){
        ProPage.navigateToOurAdviceLink();
        ProPage.navigateToAdvice();
    }

    @When("Click on the Contact your AXA advisor tab")
    public void navigateContactYourAXA(){
        ProPage.navigateToContactyourAXAadvisor();
    }

    @Then("Page not found")
    public void pageNotFound() throws IOException {
        ProPage.verifyLinkAdvisor();
    }
}
