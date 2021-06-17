package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"headerContainer\"]/div/nav[3]/div/a")
    private static WebElement btnespaceClient;

    @FindBy(id = "CybotCookiebotDialog")
    private static WebElement cookieModal;

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private static WebElement btnAcceptCookie;

    @FindBy(linkText = "Mes paramètres de compte")
    private static WebElement linkAccountsettings;

    public static void gotoHomePage(){
        driver.get("https://www.manomano.fr/");
    }

    public static void navigateEspaceClient(){
        navigateTo(btnespaceClient);
    }

    public static void acceptCookie(){
        if(cookieModal.isDisplayed()){
            btnAcceptCookie.click();
        }
    }

    public static void moveAccount(){
        Actions action = new Actions(driver);
        action.moveToElement(btnespaceClient).perform();
        action.moveToElement(linkAccountsettings).perform();
        action.click();
    }

    public static void navigateToMyAccountSettings(){
        navigateTo(linkAccountsettings);
    }
}
