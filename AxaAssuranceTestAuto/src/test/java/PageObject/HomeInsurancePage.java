package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomeInsurancePage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[11]/div/div/div/div/a")
    private static WebElement allNewsLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/div[2]/div[2]/ul/li[4]/a")
    private static WebElement tab4;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[7]/div[2]/a")
    private static WebElement newsOperationLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[5]/div/div/p/a")
    private static WebElement facebookLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[2]/div[2]/a")
    private static WebElement newsburglarylink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[4]/div/div/div/div/div[2]/a")
    private static WebElement btnDiscover;

    public static void navigateToAllNews(){
        navigateTo(allNewsLink);
    }

    public static void navigateToTab4(){
        navigateTo(tab4);
    }

    public static void navigateToNewsOperation(){
        navigateTo(newsOperationLink);
    }

    public static void navigateToNewsburglaryLink(){
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=7";
        driver.get(url);
        navigateTo(newsburglarylink);
    }

    public static void verifyfacebookPage() throws IOException {
        verifyLink(facebookLink, "853");
    }

    public static void verifyDiscoverLink() throws IOException {
        verifyLink(btnDiscover, "850");
    }
}