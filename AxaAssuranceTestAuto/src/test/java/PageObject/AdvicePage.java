package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class AdvicePage extends BaseClass {

    private static final String BASE_URL = "https://www.axa.fr/epargne-retraite/conseils.html";

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/div[2]/div[2]/ul/li[2]/a")
    private static WebElement paginationTabsTwolink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[5]/div[2]/a")
    private static WebElement e_observationLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/figure/table/tbody/tr[12]/th[2]/a[2]")
    private static WebElement linkAppAndroid;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[7]/div[2]/a")
    private static WebElement medicalTeleconsultationlink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[9]/div/div/div/div/div[2]/a")
    private static WebElement discoverOurOfferLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[9]/div[2]/a")
    private static WebElement adviceSocialProtect;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/div/p[9]/a")
    private static WebElement managerialForesightLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[2]/div[2]/a")
    private static WebElement firstDayOfUniversityAdviceLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[3]/div/div/div/div[2]/p/a")
    private static WebElement studentsGovLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[2]/div[2]/a")
    private static WebElement helpComplementaryHealthLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[11]/div/div/ol/li[6]/a")
    private static WebElement comparatorLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[9]/div[2]/a")
    private static WebElement cmuAndacslink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[4]/div/figure/table/tbody/tr[7]/td[2]/p/a")
    private static WebElement allAboutACSlink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[1]/div[2]/div[2]/a")
    private static WebElement complementaryAstusesLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[5]/div/div/div/div[2]/ul/li[6]/div[2]/a")
    private static WebElement worldAlzheimerDayAstuselink;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/div/p[8]/a")
    private static WebElement  entreaidantsLink;

    public static void goToHomePage(){
        driver.get(BASE_URL);
    }

    public static void openPage(String page){
        driver.get(page);
    }

    public static void navigateToPagetwo(){
        navigateTo(paginationTabsTwolink);
    }

    public static void navigatePageDetailEObrservation(){
        navigateTo(e_observationLink);
    }

    public static void verifyLinkApp() throws IOException {
        verifyLink(linkAppAndroid, "841");
    }

    public static void verifyStudentsGovLink() throws IOException {
        verifyLink(studentsGovLink, "849");
    }

    public static void navigateToTeleconsultationAdvice() throws InterruptedException {
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=7";
        driver.navigate().to(url);
        Thread.sleep(3000);
        navigateTo(medicalTeleconsultationlink);
    }

    public static void navigateToAdviceScialProtect(){
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=7";
        driver.navigate().to(url);
        navigateTo(adviceSocialProtect);
    }

    public static void navigateToBackSchoolAdvice(){
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=2";
        driver.get(url);
        navigateTo(firstDayOfUniversityAdviceLink);
    }

    public static void navigateTotreeHelpComplementaryHealth(){
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=3";
        driver.get(url);
        navigateTo(helpComplementaryHealthLink);
    }

    public static void navigateToCMUAdvice(){
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=5";
        driver.get(url);
        navigateTo(cmuAndacslink);
    }

    public static void navigateToworldAlzheimerDayAstuselink(){
        String url = driver.getCurrentUrl() + "?categoryName=all&currentPage=9";
        driver.get(url);
        navigateTo(worldAlzheimerDayAstuselink);
    }

    public static void navigateTocomplementaryAstusesLink(){
        navigateTo(complementaryAstusesLink);
    }

    public static void verifyDiscoverOurOfferLink() throws IOException {
        verifyLink(discoverOurOfferLink, "869");
    }

    public static void verifymanagerialForesightLink() throws IOException {
        verifyLink(managerialForesightLink, "858");
    }

    public static void verifyComparatorLink() throws IOException {
        verifyLink(comparatorLink, "846");
    }

    public static void verifyAllAboutAcsLink() throws IOException {
        verifyLink(allAboutACSlink, "844");
    }

    public static void verifyentreaidantsLink() throws IOException {
        verifyLink(entreaidantsLink, "838");
    }

    public static void checkLoadImage() throws IOException {
        List<WebElement> headerImage = driver.findElements(By.className("card__header--img"));
        for(int i=0; i<headerImage.size(); i++){
            String style = headerImage.get(i).getAttribute("style");
            String[] url = style.split(": ")[1].split("\"");
            System.out.println("Style:  " + url[1]);
            ExcelManager excelManager = new ExcelManager();
            try{
                HttpURLConnection c= (HttpURLConnection)new URL(url[1]).openConnection();
                c.setRequestMethod("HEAD");
                c.connect();
                int r = c.getResponseCode();
                System.out.println("Http response code: " + r);
                if(r == 200){
                    excelManager.excelWriting("814", "OK", getDate(), getTime());
                }else {
                    excelManager.excelWriting("814", "KO", getDate(), getTime());
                    break;
                }
            }catch (Exception e){
                excelManager.excelWriting("814", "KO", getDate(), getTime());
                System.out.println("Http page not found");
                break;
            }
        }
    }
}
