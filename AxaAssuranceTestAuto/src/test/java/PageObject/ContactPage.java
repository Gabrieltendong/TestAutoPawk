package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class ContactPage extends BaseClass {

    private static final String BASE_URL = "https://www.axa.fr/services-assistance/contact-axa.html";

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div[2]/button[3]")
    private static WebElement btnRDVAdvisor;

    @FindBy(xpath = "//*[@id=\"StoreLocator\"]/footer/div[1]/div[2]/section/ol/li[2]/button")
    private static WebElement proLink;

    public static void openContactPage(){
        driver.get(BASE_URL);
    }

    public static void clickbtnRDVAdvisor(){
        btnRDVAdvisor.click();
    }

    public static void clickProLink() throws InterruptedException, IOException {
        ExcelManager excelManager = new ExcelManager();
        String title1 = driver.getTitle();
        proLink.click();
        Thread.sleep(10000);
        String title2 = driver.getTitle();
        if(title1.contains(title2))
            excelManager.excelWriting("811", "KO", getDate(), getTime());
        else
            excelManager.excelWriting("811", "OK", getDate(), getTime());
    }
}
