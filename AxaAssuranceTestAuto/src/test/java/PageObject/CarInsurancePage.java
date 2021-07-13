package PageObject;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class CarInsurancePage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[13]/div/div/div/div/a")
    private static WebElement allTheTipslink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[1]/div/div[2]/a")
    private static WebElement autoAdviceLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/div[2]/div[2]/ul/li[2]/a")
    private static WebElement paginationTabs2;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/div[2]/div[2]/ul/li[3]/a")
    private static WebElement paginationTabs3;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[4]/div[2]/a")
    private static WebElement detailStudentEveningNews;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[4]/div/div/div/p[2]/a[1]")
    private static WebElement roadSafetyLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[6]/div[2]/a")
    private static WebElement theMostImpressive;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/div/p[1]/a")
    private static WebElement carChaseLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[8]/div[2]/a")
    private static WebElement ecoBadgeLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[3]/div/div/p/a")
    private static WebElement certicatLink;

    public static void navigateAllTheTipsPage(){
        navigateTo(allTheTipslink);
    }

    public static void clickAutoAdviceLink(){
        navigateTo(autoAdviceLink);
    }

    public static void clickTabs2Pagination(){
        navigateTo(paginationTabs2);
    }

    public static void clickTabs3Pagination(){
        navigateTo(paginationTabs3);
    }

    public static void navigateTotheMostImpressive(){
        navigateTo(theMostImpressive);
    }

    public static void navigateTodetailStudentEveningNews(){
        navigateTo(detailStudentEveningNews);
    }

    public static void verifyLinkroadSafety() throws IOException {
        verifyLink(roadSafetyLink, "839");
    }

    public static void verifyCarChaseLink() throws IOException {
        verifyLink(carChaseLink, "855");
    }

    public static void navigateToEcoBadgeLink(){
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=6";
        driver.get(url);
        navigateTo(ecoBadgeLink);
    }

    public static void verifycerticatLink() throws IOException {
        verifyLink(certicatLink, "854");
    }
}
