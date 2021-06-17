package StepDefinitions;

import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class loginpageNotfoundStepDefs {
    @And("Click on \"See all the advantages\" in the \"Book your stay with confidence\" section")
    public void ClickonSeeAllTheAdvantagesInTheBookyourStay(){
        HomePage.navigateToBookyourstay();
    }

    @And("Click on the \"Find out more\" button in the \"Pay in several installments, free of charge\" section")
    public void clickFindOutMorePayInSeveralInstallements() throws InterruptedException {
//        HomePage.handleModalInfos();
        Thread.sleep(10000);
        HomePage.handleModalNewsletter();
        HomePage.navigateToPayininstallments();
    }

    @When("In \"Payment of the balance\" under \"On your Disney account: easy!\" click on \"Connect\" or on \"Create your own now!\"")
    public void clickOnConnectorOnCreateyourownnow(){
        HomePage.navigateToLoginPage();
    }

    @Then("see message error")
    public void getMessageError() throws IOException, InterruptedException {
        HomePage.getmessageErrorLoginPage();
    }
}
