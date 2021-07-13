package StepDefinitions;

import PageObject.HomePage;
import PageObject.MotorcycleInsurance;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_837StepDefs {

    @And("Click on the tab see all products from the home page of the website")
    public void clickOnTheTabSeeAllProductsFromTheHomePageOfTheWebsite() {
        HomePage.clickBtnAllProduct();
    }

    @And("Click on the vehicle tab and select two-wheel insurance")
    public void clickOnTheVehicleTabAndSelectWheelInsurance() {
        HomePage.navigateTotwo_wheelInsurancelink();
    }

    @When("Click on the tab pass your motorcycle license located at the bottom of the page")
    public void clickOnTheTabPassYourMotocycleLicense(){
        MotorcycleInsurance.clickLinkFirstLicense();
    }

    @Then("click on the tab get your price online located at the bottom of the page")
    public void clickOnTheTabGetYourPriceOnlineLocatedAtTheBottomOfThePage() throws IOException {
        MotorcycleInsurance.verifyLinkgetyourrateonline();
    }
}
