package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class StockExchangePage extends BaseClass {

    private static final String BASE_URL = "https://www.axa.fr/epargne-retraite/bourse.html";

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[5]/div[2]/div[3]/div/div/div/div[2]/div[1]/a")
    private static WebElement preventionPolicyLink;

    public static void openHomepage(){
        driver.get(BASE_URL);
    }

    public static void verifyLinkpreventionPolicy() throws IOException {
        verifyLink(preventionPolicyLink, "820");
    }
}
