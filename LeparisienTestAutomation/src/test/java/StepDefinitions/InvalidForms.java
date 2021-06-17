package StepDefinitions;

import PageObject.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class InvalidForms {
    @Given("user in the home page")
    public void userInTheHomePage(){
        HomePage.navigateToHome();
    }

    @When("^Log into your account ([^\"]*) and ([^\"]*)$")
    public void logIntoYourAccount(String email, String password) throws InterruptedException {
        HomePage.clickBtnConnect();
        HomePage.login(email, password);
    }

    @And("Click on the account icon")
    public void clickOnTheAccountIcon() {
        
    }

    @And("Click on My information")
    public void clickOnMyInformation() {
    }

    @And("Complete the form \\(first name; last name, nickname & date of birth, telephone & profession)")
    public void completeTheFormFirstNameLastNameNicknameDateOfBirthTelephoneProfession() throws InterruptedException {
        HomePage.updateProfil();
    }

    @And("Supprimer tous les champs optionnels")
    public void supprimerTousLesChampsOptionnels() {
        
    }

    @Then("save information")
    public void saveInformation() throws IOException {
        HomePage.saveUpdate();
    }
}
