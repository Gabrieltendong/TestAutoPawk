package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class MortgageInsurancePage extends BaseClass {
    private static final String BASE_URL = "https://www.axa.fr/compte-bancaire/pret-immobilier/assurance-pret-immobilier.html";

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[4]/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/a")
    private static WebElement doASimulationLink;

    public static void openHomePage(){
        driver.get(BASE_URL);
    }

    public static void verifyDoASimulationPage() throws IOException {
        verifyLink(doASimulationLink, "848");
    }
}
