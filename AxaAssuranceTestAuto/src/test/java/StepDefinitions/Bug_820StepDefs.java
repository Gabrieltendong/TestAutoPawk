package StepDefinitions;

import PageObject.StockExchangePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_820StepDefs {
    @Given("go to stock Exchange page")
    public void openHome(){
        StockExchangePage.openHomepage();
    }

    @When("Scroll down to the Useful documents section and click on Conflict of interest prevention and management policy")
    public void verifyPage() throws IOException {
        StockExchangePage.verifyLinkpreventionPolicy();
    }
}
