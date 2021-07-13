package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class ActualityPage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div/ul/li[1]/div[2]/a")
    private static WebElement actualityRentAgilelink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[10]/div/div/p[1]/a")
    private static WebElement axaguaranteeLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[3]/div/div/div[2]/a")
    private static WebElement weatherAlertlink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[4]/div/div/p[2]/a")
    private static WebElement clientArealink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[4]/div[2]/a")
    private static WebElement reminisceneLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[6]/div/div/div/p[3]/a")
    private static WebElement daxLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div/ul/li[4]/div[2]/a")
    private static WebElement musicDefeatsLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[3]/div/div/div/div/div[2]/a")
    private static WebElement discoverOurOfferLink;

    public static void navigateActualityrentalArgile(){
        navigateTo(actualityRentAgilelink);
    }

    public static void verifyLinkaxaguarantee() throws IOException {
        verifyLink(axaguaranteeLink, "863");
    }

    public static void navigateToWeatherAlert(){
        navigateTo(weatherAlertlink);
    }

    public static void navigateToreminisceneLink(){
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=2";
        driver.get(url);
        navigateTo(reminisceneLink);
    }

    public static void navigateToMusicDefeatsLink(){
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=4";
        driver.get(url);
        navigateTo(musicDefeatsLink);
    }

    public static void verifyLinkClientArea() throws IOException {
        verifyLink(clientArealink, "864");
    }

    public static void verifyDaxLink() throws IOException {
        verifyLink(daxLink, "843");
    }

    public static void verifydiscoverOurOfferLink() throws IOException {
        verifyLink(discoverOurOfferLink, "840");
    }
}
