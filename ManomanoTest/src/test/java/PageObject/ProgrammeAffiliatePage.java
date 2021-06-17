package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ProgrammeAffiliatePage extends BaseClass {

    private final static String BASE_URL = "https://affiliation.manomano.fr/";
    private final static String URL_FAQ = "https://affiliation.manomano.fr/faq-migration-awin/";
    private static ExcelManager excelManager = new ExcelManager();

    @FindBy(tagName = "a")
    private static List<WebElement> link;

    @FindBy(name = "your-name")
    private static WebElement nameUSer;

    @FindBy(name = "your-email")
    private static WebElement emailUser;

    @FindBy(name = "your-subject")
    private static WebElement subjectUser;

    @FindBy(name = "your-message")
    private static WebElement messageUser;

    @FindBy(xpath = "//*[@id=\"wpcf7-f425-p9327-o2\"]/form/p[5]/input")
    private static WebElement submitBtn;

    @FindBy(xpath = "//*[@id=\"wpcf7-f425-p9327-o2\"]/form/div[2]")
    private static WebElement blocMessageError;

    public static void openPage(){
        driver.navigate().to(BASE_URL);
    }

    public static void navigateToFAQ(){
        driver.navigate().to(URL_FAQ);
    }

    public static void sendQuestion(){
        nameUSer.sendKeys("Gabriel");
        emailUser.sendKeys("gtendong@gmail.com");
        subjectUser.sendKeys("sujet du message");
        messageUser.sendKeys("message de la question");
    }

    public static void clickBtnSend(){
        submitBtn.submit();
    }

    public static void verifyMessageError() throws InterruptedException, IOException {
        Thread.sleep(10000);
        System.out.println("test test");
        if(blocMessageError.isDisplayed()){
            System.out.println("bug non resolu");
            excelManager.excelWriting("193", "KO", getDate(), getTime());
        }else {
            excelManager.excelWriting("193", "OK", getDate(), getTime());
        }
    }

    public static void verifybadLink() throws IOException {
        for(int i = 0; i < link.size(); i++){
            String url = link.get(i).getAttribute("href");
            if(url.split(":")[0].equals("https")){
                try{
                    HttpURLConnection Connect = (HttpURLConnection) (new URL(url)).openConnection();
                    int Response = Connect.getResponseCode();
                    if(Response != 200){
                        excelManager.excelWriting("173_176", "KO", getDate(), getTime());
                    }else {
                        excelManager.excelWriting("173_176", "OK", getDate(), getTime());
                    }
                }catch (Exception e){
                    excelManager.excelWriting("173_176", "KO", getDate(), getTime());
                }
            }
        }
    }
}
