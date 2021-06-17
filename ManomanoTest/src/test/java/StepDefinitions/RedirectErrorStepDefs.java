package StepDefinitions;

import PageObject.FAQPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class RedirectErrorStepDefs {
    @Given("From the FAQ page")
    public void FromTheFAQPage(){

    }

    @When("Select \"Returns and Refunds\"")
    public void SelectReturnsAndRefunds(){

    }

    @And("Choose I changed my mind, I no longer want my product \\(withdrawal)")
    public void chooseIChangedMyMindINoLongerWantMyProductWithdrawal() {
        FAQPage.navigateToArticle();
    }

    @And("Click on Subscribe")
    public void clickOnSubscribe() throws InterruptedException {
        FAQPage.clickBtnSubscribe();
    }

    @Then("Close the login form using the cross")
    public void closeTheLoginFormUsingTheCross() throws IOException {
        FAQPage.clickCancelBtn();
    }
}
