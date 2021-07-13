package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseClass {
    private static final String BASE_URL = "https://www.axa.fr";

    @FindBy(xpath = "/html/body/div[3]/header/div/nav/div[1]/ul/li[2]/a")
    private static WebElement propAndEnterpriseLink;

    @FindBy(id = "footer_tc_privacy")
    private static WebElement modal;

    @FindBy(id = "footer_tc_privacy_button")
    private static WebElement btnAcceptCookie;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div[1]/div[2]/ol/li[4]/a")
    private static WebElement whoAreWelink;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/div[1]/div/h3/a[4]")
    private static WebElement bankAccountLink;

    @FindBy(xpath = "/html/body/div[3]/header/div/nav/div[2]/ul/li[1]/a")
    private static WebElement serviceSupportLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[6]/div/div/div/div/div/div/div/div/div[2]/a")
    private static WebElement logcustomerareaLink;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div[1]/div[1]/ol/li[4]/a")
    private  static WebElement complementaryCollectiveHealthlink;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div[1]/div[1]/ol/li[1]/a")
    private static WebElement carInsuranceLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/div[1]/button")
    private static WebElement btnAllProduct;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/div[2]/div/div/div/div[1]/div[4]/a")
    private static WebElement two_wheelInsurancelink;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/div[1]/div/h3/a[4]")
    private static WebElement accountBankLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[2]/nav/button[2]")
    private static WebElement yourSteps;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[2]/div/div[2]/div[1]/div/h3/a[4]")
    private static WebElement makeAndOppositionLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[14]/div/div/div/div/div/a")
    private static WebElement allOurAdvice;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div[1]/div[1]/ol/li[2]/a")
    private static WebElement homeInsuranceLink;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div[1]/div[1]/ol/li[3]/a")
    private static WebElement complementaryHealthLink;

    @FindBy(xpath = "/html/body/div[3]/header/div/nav/div[2]/ul/li[2]/a")
    private static WebElement clientAreaBtn;

    @FindBy(xpath = "//*[@id=\"footer\"]/div[1]/div[1]/div[2]/ol/li[5]/a")
    private static WebElement legaleNoticeLink;

    public static void navigateToHome(){
        driver.get(BASE_URL);
        handleCookie();
    }

    public static void navigateToProPage(){
        navigateTo(propAndEnterpriseLink);
    }

    public static void handleCookie(){
        if(modal.isDisplayed()){
            btnAcceptCookie.click();
        }
    }

    public static void navigateWhoAreWelink(){
        navigateTo(whoAreWelink);
    }

    public static void navigateToServiceSupportpage(){
        navigateTo(serviceSupportLink);
    }

    public static void navigateTobankAccountLink(){
        navigateTo(bankAccountLink);
    }

    public static void navigateToHealthlink(){
        navigateTo(complementaryCollectiveHealthlink);
    }

    public static void navigateToCarInsurancePage(){
        navigateTo(carInsuranceLink);
    }

    public static void navigateTotwo_wheelInsurancelink(){
        navigateTo(two_wheelInsurancelink);
    }

    public static void navigateToMakeAnOpposition(){
        navigateTo(makeAndOppositionLink);
    }

    public static void navigateAllOurAdvicePage(){
        navigateTo(allOurAdvice);
    }

    public static void navigateToHomeInsurancePage(){
        navigateTo(homeInsuranceLink);
    }

    public static void navigateToComplementaryHealth(){
        navigateTo(complementaryHealthLink);
    }

    public static void navigateToLegaleNoticeLink(){
        navigateTo(legaleNoticeLink);
    }

    public static void clickBtnAllProduct(){
        btnAllProduct.click();
    }

    public static void clickTabYourSteps(){
        yourSteps.click();
    }

    public static void navigateAccountBankPage(){
        navigateTo(accountBankLink);
    }

    public static void verifylogcustomerareaLink() throws IOException {
        verifyLink(logcustomerareaLink, "866");
    }

}
