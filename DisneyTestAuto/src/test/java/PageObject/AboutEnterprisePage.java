package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutEnterprisePage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"menu-1-74479840\"]/li[2]/a")
    private static WebElement contactLink;

    @FindBy(id = "BorlabsCookieBox")
    private static WebElement modal;

    @FindBy(xpath = "//*[@id=\"BorlabsCookieBox\"]/div/div/div/div[1]/div/div/div/p[2]/a")
    private static WebElement btnAcceptCookie;

    public static void navigateContactPage(){
        navigateTo(contactLink);
    }

    public static void handleCookie(){
        System.out.println("modal");
        if(modal.isDisplayed()){
            System.out.println("modal is visible");
            btnAcceptCookie.click();
        }
    }
}
