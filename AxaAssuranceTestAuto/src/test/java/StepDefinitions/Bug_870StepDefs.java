package StepDefinitions;

import PageObject.BankAccountPage;
import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_870StepDefs {
    @When("Click on the Your procedures tab located just on the home page of the website")
    public static void clickOnTheYourProcedures(){
        HomePage.clickTabYourSteps();
    }

    @And("Click on the Stop payment on my bank card tab")
    public static void clickonTheStopPaymentOnMyBankCardTab(){
        HomePage.navigateToMakeAnOpposition();
    }

    @Then("Click on Visa first")
    public static void verifylinkVisaFirst() throws IOException {
        BankAccountPage.verifyVisaCardLink();
    }
}
