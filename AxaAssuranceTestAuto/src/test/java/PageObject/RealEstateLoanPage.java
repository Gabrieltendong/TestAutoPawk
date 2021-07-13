package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class RealEstateLoanPage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div/a")
    private static WebElement doASimulationLink;

    @FindBy(xpath = "//*[@id=\"simuCredImmo\"]/section[4]/div/div[1]")
    private static WebElement legalNotice;

    @FindBy(xpath = "//*[@id=\"simuCredImmo\"]/section[4]/div/div[2]/p[7]/a")
    private static WebElement aerasInfoslink;

    public static void navigateTodoASimulationLink(){
        navigateTo(doASimulationLink);
    }

    public static void clickTablegalNotice(){
        legalNotice.click();
    }

    public static void verifyLinkAerainfos() throws IOException {
        verifyLink(aerasInfoslink, "868");
    }
}
