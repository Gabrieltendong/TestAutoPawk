package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class LegaleNoticePage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[2]/div/div/ul/li[4]/button")
    private static WebElement infosAccountBankBtn;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[2]/div/div/ul/li[4]/div[1]/p[3]/u[1]/a")
    private static WebElement federationBankLink;

    public static void clickBtnInfoAccountBank(){
        infosAccountBankBtn.click();
    }

    public static void verifyfederationLink() throws IOException {
        verifyLink(federationBankLink, "812");
    }
}
