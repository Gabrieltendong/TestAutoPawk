package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class MotorcycleInsurance extends BaseClass {
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[7]/div/div/div/ul/li[1]")
    private static WebElement firstLicenseLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[4]/div/div/div[2]/a")
    private static WebElement getyourrateonlineLink;

    public static void clickLinkFirstLicense(){
        firstLicenseLink.click();
    }

    public static void verifyLinkgetyourrateonline() throws IOException {
        verifyLink(getyourrateonlineLink, "837");
    }
}
