package StepDefinitions;

import PageObject.HomePage;
import io.cucumber.java.en.Given;

public class BackgroundStepDefs {
    @Given("user in the home page")
    public void gotoHome(){
        HomePage.navigateToHome();
    }
}
