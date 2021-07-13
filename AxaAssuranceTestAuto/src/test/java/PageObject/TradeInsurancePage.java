package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class TradeInsurancePage extends BaseClass {
    private static final String BASE_URL = "https://www.axa.fr/pro/secteurs-activites/assurance-commerce.html";

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[10]/div/div/div/div/div/button")
    private static WebElement btniscovermoreproducts;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[10]/div/div/div/div/div/div")
    private static WebElement modal;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[10]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/a")
    private static WebElement machineBreakDownLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[10]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[3]/a")
    private static WebElement equipmentRentalLink;

    public static void openPage() {
        driver.get(BASE_URL);
    }

    public static void clickbtniscovermoreproducts(){
        btniscovermoreproducts.click();
    }

    public static void verifyLinkequipmentRentalLink() throws IOException {
        ExcelManager excelManager = new ExcelManager();
        if(modal.isDisplayed()){
            String link_1 = machineBreakDownLink.getAttribute("href");
            String link_2 = equipmentRentalLink.getAttribute("href");
            if(link_1.contains(link_2)){
                excelManager.excelWriting("865", "KO", getDate(), getTime());
            }else {
                excelManager.excelWriting("865", "OK", getDate(), getTime());
            }
        }
    }
}
