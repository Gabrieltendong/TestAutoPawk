package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class PersonalLoanPage extends BaseClass {
    private static final String BASE_URL = "https://www.axa.fr/compte-bancaire/pret-personnel.html";
    private static String pricepersonalLoan;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[7]/div[1]/div/div/ul/li[1]/div[2]/div/p/span")
    private static WebElement priceReady;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[7]/div[2]/div[2]/div/div/div/div/div[2]/a")
    private static WebElement btnSimulation;

    @FindBy(xpath = "//*[@id=\"credit-amount\"]")
    private static WebElement creditAmount;

    public static void openHomePage(){
        driver.get(BASE_URL);
        pricepersonalLoan = priceReady.getText();
    }

    public static void navigateToSimalutionPage(){
        navigateTo(btnSimulation);
    }

    public static void comparecreditAmount() throws IOException {
        ExcelManager excelManager = new ExcelManager();
        if(pricepersonalLoan.contains("120 000") && creditAmount.getAttribute("placeholder").contains("120 000")){
            excelManager.excelWriting("845", "OK", getDate(), getTime());
        }else {
            excelManager.excelWriting("845", "KO", getDate(), getTime());
        }
    }

}
