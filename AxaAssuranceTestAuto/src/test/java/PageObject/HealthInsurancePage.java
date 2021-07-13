package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

public class HealthInsurancePage extends BaseClass {

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[2]/div/div/div/div[1]/div/div/div[3]/a")
    private static WebElement discoverOurOfferLink;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[18]/div/div/div/div/div/button/span")
    private static WebElement legalNoticelink;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[18]/div/div/div/div/div/div/div")
    private static WebElement isModal;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[18]/div/div/div/div/div/div/div/div[2]")
    private static WebElement contentModal;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[18]/div/div/div/div/div/div/div/div[2]/div")
    private static WebElement childContentModal;

    public static void navigateTodiscoverOurOfferLink(){
        navigateTo(discoverOurOfferLink);
    }

    public static void clicklegalNoticelink(){
        legalNoticelink.click();
    }

    public static void verifyContentModal() throws IOException {
        ExcelManager excelManager = new ExcelManager();
        List<WebElement> allTagcontentModal = contentModal.findElements(By.xpath(".//*"));
        List<WebElement> divTag = childContentModal.findElements(By.xpath(".//*"));
        if(isModal.isDisplayed()){
            if(allTagcontentModal.size() == 1 && divTag.size() == 0 && contentModal.getText().isEmpty()){
                excelManager.excelWriting("847", "KO", getDate(), getTime());
            }else {
                excelManager.excelWriting("847", "OK", getDate(), getTime());
            }
        }else{
            System.out.println("isModal: false");
        }
    }
}
