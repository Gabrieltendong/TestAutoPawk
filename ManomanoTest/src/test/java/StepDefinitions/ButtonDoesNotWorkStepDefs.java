package StepDefinitions;

import PageObject.FAQPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class ButtonDoesNotWorkStepDefs {
    @Given("On the Customer FAQ page")
    public void onTheCustomerFAQPage(){

    }

    @And("Select the article")
    public void selectArticle(){
        FAQPage.navigateToArticle();
    }

    @And("Scroll to the \"Was this article helpful?\"")
    public void scrollToTheWasThisarticleHelpful(){

    }

    @Then("Click either on \"Yes\" or \"No\"")
    public void ClickEitherOnYesorNo() throws IOException {
        FAQPage.clickBtn();
    }
}
