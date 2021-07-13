package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class RetirementInsurancePage extends BaseClass {

    private static final String BASE_URL = "https://www.axa.fr/epargne-retraite/assurance-retraite/contrat-madelin.html";

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div")
    private static WebElement bgImage;

    public static void openHomePage(){
        driver.get(BASE_URL);
    }

    public static void verifyLoadImage() throws IOException {
        String url = "https://www.axa.fr" + bgImage.getAttribute("data-responsive-background-desktop");
        System.out.println("url: "+ url);
        ExcelManager excelManager = new ExcelManager();
        try{
            HttpURLConnection c= (HttpURLConnection)new URL(url).openConnection();
            c.setRequestMethod("HEAD");
            c.connect();
            int r = c.getResponseCode();
            System.out.println("Http response code: " + r);
            if(r == 200){
                excelManager.excelWriting("852", "OK", getDate(), getTime());
            }else {
                excelManager.excelWriting("852", "KO", getDate(), getTime());
            }
        }catch (Exception e){
            excelManager.excelWriting("852", "KO", getDate(), getTime());
            System.out.println("Http page not found");
        }
    }
}