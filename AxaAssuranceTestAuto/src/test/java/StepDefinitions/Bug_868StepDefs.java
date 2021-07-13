package StepDefinitions;

import PageObject.BankAccountPage;
import PageObject.HomePage;
import PageObject.RealEstateLoanPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_868StepDefs {
    @When("Click on the bank account tab")
    public void clickOnTheBankAccountTab(){
        HomePage.navigateTobankAccountLink();
    }

    @And("Click on the mortgage loan tab")
    public void clickOnTheMortgageLoanTab() {
        BankAccountPage.navigateTorealEstateLoan();
    }

    @And("Click on the tab do a simulation")
    public void clickOnTheTabDoASimulation() {
        RealEstateLoanPage.navigateTodoASimulationLink();
    }

    @Then("Click on the legal notices tab located just at the bottom of the page and verify link www.aeras-infos.fr")
    public void clickOnTheLegalNoticesTabLocatedJustAtTheBottomOfThePageAndVerifyLinkWwwAerasInfosFr() throws IOException {
        RealEstateLoanPage.clickTablegalNotice();
        RealEstateLoanPage.verifyLinkAerainfos();
    }
}
