package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class FAQPage extends BaseClass {
    private static ExcelManager excelManager = new ExcelManager();

    private static final String BASE_URL = "https://faq.manomano.com/hc/fr/articles/360000487367-J-ai-chang%C3%A9-d-avis-je-ne-veux-plus-mon-produit-r%C3%A9tractation";

    @FindBy(className = "article__vote-item_down")
    private static WebElement btnDown;

    @FindBy(className = "article__vote-item_up")
    private static WebElement btnUp;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div/div/div[1]/div[1]/h1/div/a")
    private static WebElement btnSubscribe;

    @FindBy(xpath = "//*[@id=\"cancel-link\"]/a")
    private static WebElement btnCancelModal;

    @FindBy(id = "signin_title")
    private static WebElement titleModal;

    @FindBy(xpath = "/html/body/div[3]/iframe")
    private static WebElement modal;

    public static void navigateToArticle(){
        driver.get(BASE_URL);
    }

    public static void clickBtn() throws IOException {
        if(btnUp.getAttribute("href").contains("#") || btnDown.getAttribute("href").contains("#")){
            System.out.println("bug non resolu");
            excelManager.excelWriting("202", "KO", getDate(), getTime());
        }else {
            excelManager.excelWriting("202", "OK", getDate(), getTime());
        }
    }

    public static void clickBtnSubscribe() throws InterruptedException {
        btnSubscribe.click();
        Thread.sleep(5000);
    }

    public static void clickCancelBtn() throws IOException {
        System.out.println("title modal: " + driver.getCurrentUrl());
        driver.switchTo().frame(modal);
        btnCancelModal.click();
        if(driver.getTitle().contains("ManoMano.fr")){
            System.out.println("bug KO");
            excelManager.excelWriting("225", "KO", getDate(), getTime());
        }else {
            System.out.println("bug OK");
            excelManager.excelWriting("225", "OK", getDate(), getTime());
        }
    }
}
