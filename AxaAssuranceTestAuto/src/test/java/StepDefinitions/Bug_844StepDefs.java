package StepDefinitions;

import PageObject.AdvicePage;
import PageObject.ComplementaryHealthPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Bug_844StepDefs {
    @And("Click on the all advice tab and select the CMU-C and ACS advice: the comparison")
    public void selectTheCMUCAndACSAdvice(){
        ComplementaryHealthPage.navigateToAllAdvicePage();
        AdvicePage.navigateToCMUAdvice();
    }

    @Then("Click on the All about ACS tab")
    public void clickOnTheAllAboutACSTab() throws IOException {
        AdvicePage.verifyAllAboutAcsLink();
    }
}
