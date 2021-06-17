package StepDefinitions;

import com.manomano.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs  {
    private LoginPage loginPage = new LoginPage();

    @Given("aller sur la page de connexion")
    public void GotoHomePage(){
        System.out.println("salut");
    }

    @And("cliquer sur continuer avec google")
    public void clickContinueWithGoogle(){
        System.out.println("salut");
//        LoginPage.clickButtonConnexion();
    }

    @When("utilisateur selectionne le compte")
    public void userSelectAccount(){
        System.out.println("salut");
    }

    @Then("User home page is display")
    public void userHomePageIsDisplay(){
        System.out.println("salut");
    }
}
