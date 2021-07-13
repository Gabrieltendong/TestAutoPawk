package StepDefinitions;

import PageObject.AdvicePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class Bug_814StepDefs {

    @When("^user open ([^\"]*)$")
    public void userOpenPage(String page){
        AdvicePage.openPage(page);
    }

    @Then("image header not load")
    public void imageHeaderNotLoad() throws IOException {
        AdvicePage.checkLoadImage();
    }

    @When("user open <page>")
    public void userOpenPage() {
    }
}
