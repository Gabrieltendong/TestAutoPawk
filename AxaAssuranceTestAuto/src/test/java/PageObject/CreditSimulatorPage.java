package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import Utils.ZipReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

public class CreditSimulatorPage extends BaseClass {
    private static final String BASE_URL = "https://www.axa.fr/compte-bancaire/pret-immobilier/simulateur-credit-immo.html";

    @FindBy(id = "simuTab-add")
    private static WebElement btnaddSimulator;

    @FindBy(id = "simuTabClose-1")
    private static WebElement btnDeleteSimulator;

    @FindBy(id = "simuTab-1")
    private static WebElement simuTab_1;

    @FindBy(id = "simuTab-2")
    private static WebElement simuTab_2;

    @FindBy(id = "simuTab-3")
    private static WebElement simuTab_3;

    public static void openHome(){
        driver.get(BASE_URL);
    }

    public static void addSimulator(){
//        Actions action = new Actions(driver);
//        action.moveToElement(btnaddSimulator).click().perform();
        btnaddSimulator.click();
    }

    public static void deleteSimulator(){
        simuTab_1.click();
        btnDeleteSimulator.click();
    }

    public static void compareTitleSimulator() throws IOException {
        ZipReport zipReport = new ZipReport();
        ExcelManager excelManager = new ExcelManager();
        String titleSimulatorTab2 = simuTab_2.findElements(By.tagName("li")).get(0).getText();
        String titleSimulatorTab3 = simuTab_3.findElements(By.tagName("li")).get(0).getText();
        if(titleSimulatorTab2.contains(titleSimulatorTab3))
            excelManager.excelWriting("842", "KO", getDate(), getTime());
        else
            excelManager.excelWriting("842", "OK", getDate(), getTime());
    }
}
