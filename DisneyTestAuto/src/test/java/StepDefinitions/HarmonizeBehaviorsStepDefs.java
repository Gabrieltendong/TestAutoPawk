package StepDefinitions;

import Base.BaseClass;
import PageObject.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class HarmonizeBehaviorsStepDefs {

    @Given("user in the home page disney.fr")
    public void navigateHomePage(){
        HomePage.openHomePage();
    }

    @When("click in the link social network")
    public void navigateLinkSocialnetwork(){

    }

    @Then("link does not redirect directly to the social network page")
    public void linkDoesNotRedirectDirectlyToTheSocialNetworkPage() throws IOException {
        HomePage.verifyLinkRS();
    }
}
