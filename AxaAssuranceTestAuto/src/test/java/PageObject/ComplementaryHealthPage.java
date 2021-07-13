package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComplementaryHealthPage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[20]/div/div/div/div/a")
    private static WebElement allAdviceLink;

    public static void navigateToAllAdvicePage(){
        navigateTo(allAdviceLink);
    }
}
