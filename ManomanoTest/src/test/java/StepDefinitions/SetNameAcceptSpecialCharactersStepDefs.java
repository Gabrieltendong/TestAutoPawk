package StepDefinitions;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.MySettingsAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SetNameAcceptSpecialCharactersStepDefs {
    @Given("go to the login page")
    public void goToLoginPage(){
        HomePage.gotoHomePage();
        HomePage.navigateEspaceClient();
    }
    @And("connect to account")
    public void login() throws InterruptedException {
        LoginPage.auth();
        HomePage.acceptCookie();
    }

    @When("click on My account settings")
    public void clickOnMyaccountSettings() {
        HomePage.moveAccount();
        HomePage.navigateToMyAccountSettings();
    }

    @And("Go to My private information")
    public void goToMyPrivateInformation() {

    }

    @And("Enter the underscore \\(_) and period \\(.) Characters in the Last name and First name fields")
    public void enterTheUnderscore_AndPeriodCharactersInTheLastNameAndFirstNameFields() {
        MySettingsAccountPage.setFirstName("_");
        MySettingsAccountPage.setLastName(".dfdfs");
    }

    @Then("Click on Validate")
    public void clickOnValidate() throws IOException {
        MySettingsAccountPage.submitUpdate();
    }
}
