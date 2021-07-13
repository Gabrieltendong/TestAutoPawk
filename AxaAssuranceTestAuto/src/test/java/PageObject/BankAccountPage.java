package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class BankAccountPage extends BaseClass {
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/div/div/h3/a[4]")
    private static WebElement realEstateLoan;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[3]/div/div/div/div[1]/div[3]")
    private static WebElement firstElement;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[3]/div/div/div/div[2]/div[3]")
    private static WebElement secondElement;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/div/ul[1]/li[2]/a[2]")
    private static WebElement visacardLink;

    public static void navigateTorealEstateLoan(){
        navigateTo(realEstateLoan);
    }

    public static void comparePosition() throws IOException {
        ExcelManager  excelManager = new ExcelManager();
        Point position1 = firstElement.getLocation();
        Point position2 = secondElement.getLocation();

        if(position1.getY() != position2.getY())
            excelManager.excelWriting("928", "KO", getDate(), getTime());
        else
            excelManager.excelWriting("928", "OK", getDate(), getTime());
    }

    public static void verifyVisaCardLink() throws IOException {
        verifyLink(visacardLink, "870");
    }
}
