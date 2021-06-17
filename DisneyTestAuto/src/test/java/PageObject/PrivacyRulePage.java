package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class PrivacyRulePage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/div/div/div/div[1]")
    private static WebElement container_fluid;

    @FindBy(xpath = "//*[@id=\"search-icon\"]")
    private static WebElement header;

    public static void verifyAlignment() throws IOException {
        ExcelManager excelManager = new ExcelManager();
        Point pointContainer = container_fluid.getLocation();
        Point pointHeader = header.getLocation();
        if(pointContainer.getY() < pointHeader.getY()){
            System.out.println("Bug non resolu");
            excelManager.excelWriting("1051", "KO", getDate(), getTime());
        }else{
            System.out.println("Bug resolu");
            excelManager.excelWriting("1051", "OK", getDate(), getTime());
        }
    }
}
