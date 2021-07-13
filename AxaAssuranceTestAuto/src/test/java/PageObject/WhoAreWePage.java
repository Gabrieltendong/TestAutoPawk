package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhoAreWePage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[12]/div/div/div/div/a")
    private static WebElement allActualitylink;

    public static void navigateToActualyPage(){
        navigateTo(allActualitylink);
    }
}
