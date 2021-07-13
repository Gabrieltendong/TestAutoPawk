package StepDefinitions;

import PageObject.HomePage;
import PageObject.TradeInsurancePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_865StepDefs {
    @Given("go to home trade insurance")
    public void openHomePage(){
        TradeInsurancePage.openPage();
        HomePage.handleCookie();
    }

    @When("Click on Discover more products")
    public void clickOnDiscoverMoreProducts() {
        TradeInsurancePage.clickbtniscovermoreproducts();
    }

    @Then("verify link equipment rental")
    public void verifyLinkEquipmentRental() throws IOException {
        TradeInsurancePage.verifyLinkequipmentRentalLink();
    }
}
