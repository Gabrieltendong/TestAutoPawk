package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ProPage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[14]/div/div/div/div/div/a")
    private static WebElement ouradviceLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[6]/div[2]/a")
    private static WebElement advice;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[5]/div/div/ul/li[2]/button")
    private static WebElement toggleourAdvice;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[5]/div/div/ul/li[2]/div/p[6]/a")
    private static WebElement contactAdvisor;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[4]/div[2]/a")
    private static WebElement interssementLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/div/ul[2]/li[2]/a")
    private static WebElement peeLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[1]/div[2]/a")
    private static WebElement carinsuranceLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/div/ul[2]/li[2]/b[2]/a")
    private static WebElement fleetContract;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[4]/div[2]/a")
    private static WebElement socialProtectionLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[3]/div/div/div/div[2]/p[1]/a")
    private static WebElement civilliabilityLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[3]/div[2]/a")
    private static WebElement adviceStopWork;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[5]/div/div/div/div/div/div/ul/li[1]/a")
    private static WebElement formalityLink;

    public static void navigateToOurAdviceLink(){
        navigateTo(ouradviceLink);
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=7";
        driver.get(url);
    }

    public static void navigateToOurAdviceLinkTab2(){
        navigateTo(ouradviceLink);
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=2";
        driver.get(url);
    }

    public static void navigateToOurAdviceLinkTab1(){
        navigateTo(ouradviceLink);
    }

    public static void navigateToAdvice(){
        navigateTo(advice);
    }

    public static void navigateToContactyourAXAadvisor(){
        toggleourAdvice.click();
    }

    public static void navigateToInterssement(){
        navigateTo(interssementLink);
    }

    public static void navigateToCarInsurancePage(){
        navigateTo(carinsuranceLink);
    }

    public static void navigateToSocialprotection(){
        navigateTo(socialProtectionLink);
    }

    public static void navigateToAdviceStopWork(){
        navigateTo(adviceStopWork);
    }

    public static void verifyLinkAdvisor() throws IOException {
        verifyLink(contactAdvisor, "859");
    }

    public static void verifyLinkpee() throws IOException {
        verifyLink(peeLink, "860");
    }

    public static void verifyLinkfleetContract() throws IOException {
        verifyLink(fleetContract, "861");
    }

    public static void verifyLinkdirector() throws IOException {
        verifyLink(civilliabilityLink, "862");
    }

    public static void verifyLinkformality() throws IOException {
        verifyLink(formalityLink, "867");
    }
}
