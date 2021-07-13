package StepDefinitions;

import PageObject.CarInsurancePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_839StepDefs {
    @When("Look for the Student nights tab: behave well!")
    public void lookForTheStudentNightsTaabs(){
        CarInsurancePage.clickTabs2Pagination();
        CarInsurancePage.navigateTodetailStudentEveningNews();
    }

    @Then("click on the Road Safety - Road Safety tab: road figures infographic")
    public void clickOnTheRoadSafetyRoadSafetyTabRoadFiguresInfographic() throws IOException {
        CarInsurancePage.verifyLinkroadSafety();
    }
}
