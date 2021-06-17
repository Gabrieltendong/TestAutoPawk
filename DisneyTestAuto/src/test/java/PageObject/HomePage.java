package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomePage extends BaseClass {
    private static final String BASE_URL = "https://www.disneylandparis.com/fr-fr/";
    private static final String BASE_URL_DISNEY = "https://disney.fr/";
    private static JavascriptExecutor js;

    @FindBy(id = "footer_tc_privacy")
    private static WebElement cookieModal;

    @FindBy(id = "footer_tc_privacy_button")
    private static WebElement btnAcceptCookie;

    @FindBy(id = "dcpb-wrapper")
    private static WebElement modalCookieDisney;

    @FindBy(id = "dcpb-accept")
    private static WebElement dcpb_accept;

    @FindBy(id = "tab-1")
    private static WebElement tabService;

    @FindBy(id = "tab-2")
    private static WebElement tabAbout;

    @FindBy(xpath = "//*[@id=\"panel-2\"]/div/div/div/div[5]/a")
    private static WebElement infosEnterpriseLink;

    @FindBy(xpath = "//*[@id=\"panel-1\"]/div/div/div/div[10]/a")
    private static WebElement contactUsLink;

    @FindBy(xpath = "/html/body/div[4]/div[2]/main/div/section[2]/section[1]/h3[3]/p[4]/a[2]")
    private static WebElement businessTorismLink;

    @FindBy(xpath = "/html/body/h1")
    private static WebElement title;

    @FindBy(xpath = "//*[@id=\"LinkOne\"]/div/div[2]/a")
    private static WebElement morelink;

    @FindBy(xpath = "/html/body/div[3]/div[10]/div/div/div/div/div/div/div[1]/div/div[3]/div/a")
    private static WebElement secondmoreLink;

    @FindBy(xpath = "//*[@id=\"disneyAccount\"]/div[2]/div[1]/p/a[1]")
    private static WebElement loginLink;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div/main/div/section/section[1]/div/div[2]/h2")
    private static WebElement loginPageError;

    @FindBy(xpath = "//*[@id=\"ref-1-13\"]/div/div/div/div/p/a[1]")
    private static WebElement facebookLink;

    @FindBy(xpath = "//*[@id=\"ref-1-13\"]/div/div/div/div/p/a[2]")
    private static WebElement instagramLink;

    @FindBy(xpath = "//*[@id=\"ref-1-13\"]/div/div/div/div/p/a[3]")
    private static WebElement twitterLink;

    @FindBy(xpath = "//*[@id=\"ref-1-13\"]/div/div/div/div/p/a[4]")
    private static WebElement pinterstLink;

    @FindBy(xpath = "//*[@id=\"ref-1-13\"]/div/div/div/div/p/a[5]")
    private static WebElement youtubeLink;

    @FindBy(xpath = "//*[@id=\"goc-ft-about\"]/li[6]/a")
    private static WebElement privacyRuleLink;

    @FindBy(id = "globalMessaging")
    private static WebElement modalInfos;

    @FindBy(id = "dmi-CloseCrisis")
    private static WebElement btnCloseModalInfos;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div")
    private static WebElement modalNewsletter;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/div[1]/div[1]/button")
    private static WebElement btnCloseModalNewsletter;


    public static void navigateToHome(){
        driver.get(BASE_URL);
        handleAcceptCookie(cookieModal, btnAcceptCookie);
    }

    public static void navigatePrivacyPage(){
        navigateTo(privacyRuleLink);
    }

    public static void openHomePage(){
        driver.get(BASE_URL_DISNEY);
        handleAcceptCookie(modalCookieDisney, dcpb_accept);
    }

    public static void handleAcceptCookie(WebElement modal, WebElement btnAccept){
        if(modal.isDisplayed()){
            btnAccept.click();
        }
    }

    public static void handleModalInfos(){
        if(modalInfos.isDisplayed()){
            btnCloseModalInfos.click();
        }
    }

    public static void handleModalNewsletter(){
        if(modalNewsletter.isDisplayed()){
            btnCloseModalNewsletter.click();
        }
    }

    public static void clickOnServiceTab(){
        tabService.click();
    }

    public static void navigateToContactUs(){
        navigateTo(contactUsLink);
    }

    public static void navigateToBusinessTorismLink(){
        navigateTo(businessTorismLink);
    }

    public static void verifyMessageError() throws IOException {
        ExcelManager excelManager = new ExcelManager();
        if(title.getText().contains("403 ERROR")){
            excelManager.excelWriting("1283", "KO", getDate(), getTime());
            System.out.println("Bug non resolu");
        }else {
            excelManager.excelWriting("1283", "OK", getDate(), getTime());
            System.out.println("Bug resolu");
        }
    }

    public static void navigateToBookyourstay(){
        navigateTo(morelink);
    }

    public static void navigateToPayininstallments(){
        navigateTo(secondmoreLink);
    }

    public static void navigateToLoginPage(){
        navigateTo(loginLink);
    }

    public static void clickTabAbout(){
        tabAbout.click();
    }

    public static void navigateToInfosEnterprise(){
        System.out.println("infos start");
//        navigateTo(infosEnterpriseLink);
//        System.out.println("infos end");
        driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.MILLISECONDS);
        String url = infosEnterpriseLink.getAttribute("href");
        Actions action = new Actions(driver);
        action.click(infosEnterpriseLink).perform();


        System.out.println("infos end");
//        driver.switchTo().
    }

    public static void getmessageErrorLoginPage() throws IOException, InterruptedException {
        Thread.sleep(5000);
        ExcelManager excelManager = new ExcelManager();
        try {
            if(loginPageError.isDisplayed() && loginPageError.getText().contains("Quelqu'un a dévoré la page !")){
                excelManager.excelWriting("1118", "KO", getDate(), getTime());
            }else {
                excelManager.excelWriting("1118", "OK", getDate(), getTime());
            }
        }catch (Exception e){
            excelManager.excelWriting("1118", "OK", getDate(), getTime());
        }
    }

    public static void verifyLinkRS() throws IOException {
        ExcelManager excelManager = new ExcelManager();
        String urlFacebook = facebookLink.getAttribute("href");
        String urlInstagram = instagramLink.getAttribute("href");
        String urlTwitter = twitterLink.getAttribute("href");
        String urlPinterest = pinterstLink.getAttribute("href");
        String urlYoutube = youtubeLink.getAttribute("href");
        if(urlFacebook.contains("facebook") &&
                urlInstagram.contains("instagram") &&
                urlTwitter.contains("twitter") &&
                urlPinterest.contains("pinterest") &&
                urlYoutube.contains("youtube")){
            System.out.println("bug resolu");
            excelManager.excelWriting("1074", "OK", getDate(), getTime());
        }else{
            System.out.println("bug non resolu");
            excelManager.excelWriting("1074", "KO", getDate(), getTime());
        }
    }
}
