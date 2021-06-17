package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import io.cucumber.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class HomePage extends BaseClass {
    private static final String BASE_URL = "https://www.leparisien.fr/";

    @FindBy(xpath = "/html/body/header/div/div[2]/a")
    private static WebElement btnAccount;

    @FindBy(xpath = "/html/body/app-main/app-widget/screen-layout/main/current-screen/div/screen-login/p[3]/input")
    private static WebElement emailAdress;

    @FindBy(xpath = "/html/body/app-main/app-widget/screen-layout/main/current-screen/div/screen-login/p[4]/input")
    private static WebElement password;

    @FindBy(id = "tp-login-button")
    private static WebElement btnConnect;

    @FindBy(xpath = "//*[@id=\"didomi-popup\"]/div/div")
    private static WebElement popup;

    @FindBy(id = "didomi-notice-agree-button")
    private static WebElement btnAcceptCookie;

    @FindBy(xpath = "//*[@id=\"nav\"]/nav/div[3]/ul/li[5]/a")
    private static WebElement btnSubscribe;

    @FindBy(xpath = "//*[@id=\"piano-id-yTiKi\"]")
    private static WebElement iframe;

    @FindBy(xpath = "//*[@id=\"app\"]/div/section[2]/div/form/div[6]/div[2]/div/div[2]")
    private static WebElement mounthSelect;

    @FindBy(xpath = "//*[@id=\"app\"]/div/section[2]/div/form/div[6]/div[2]/div/div[3]")
    private static WebElement yearSelect;

    @FindBy(xpath = "//*[@id=\"app\"]/div/section[2]/div/form/div[6]/div[2]/div/div[1]")
    private static WebElement selectBirthday;

    @FindBy(xpath = "//*[@id=\"app\"]/div/section[2]/div/form/div[6]/div[2]/div/div[1]/ul/li[1]")
    private static WebElement day_one;

    @FindBy(xpath = "//*[@id=\"app\"]/div/section[2]/div/form/div[6]/div[2]/div/div[2]/ul/li[1]")
    private static WebElement mounth_jan;

    @FindBy(xpath = "//*[@id=\"app\"]/div/section[2]/div/form/div[6]/div[2]/div/div[3]/ul/li[1]")
    private static WebElement year_1;

    @FindBy(className = "ui-select__list-element-tick")
    private static WebElement checked;

    @FindBy(xpath = "//*[@id=\"app\"]/div/section[2]/div/form/div[9]/button")
    private static WebElement btnUpdate;

    @FindBy(xpath = "//*[@id=\"app\"]/div/section[2]/div/form/div[6]/div[2]/div[2]")
    private static WebElement invalidDate;

    public static void navigateToHome(){
        driver.get(BASE_URL);
        acceptCookie();
    }

    public static void clickBtnConnect() throws InterruptedException {
        navigateTo(btnSubscribe);
        navigateTo(btnAccount);
    }

    private static void acceptCookie(){
        if(popup.isDisplayed()){
            btnAcceptCookie.click();
        }
    }

    public static void login(String email, String pass) throws InterruptedException {
        System.out.println("login-------------------------: ");
        driver.switchTo().frame(1);
        System.out.println("switch to frame ---------------");
        emailAdress.sendKeys(email);
        password.sendKeys(pass);
        btnConnect.click();
    }

    public static void updateProfil() throws InterruptedException {
        Thread.sleep(10000);
        Actions action = new Actions(driver);
        action.moveToElement(selectBirthday).click().perform();
        action.moveToElement(day_one).click().perform();
        action.moveToElement(selectBirthday).click().perform();
        action.moveToElement(checked).click().perform();

        action.moveToElement(mounthSelect).click().perform();
        action.moveToElement(mounth_jan).click().perform();
        action.moveToElement(mounthSelect).click().perform();
        action.moveToElement(checked).click().perform();

        action.moveToElement(yearSelect).click().perform();
        action.moveToElement(year_1).click().perform();
        action.moveToElement(yearSelect).click().perform();
        action.moveToElement(checked).click().perform();
    }

    public static void saveUpdate() throws IOException {
        ExcelManager excelManager = new ExcelManager();
        btnUpdate.click();
        if(invalidDate.isDisplayed()){
            excelManager.excelWriting("1294", "KO", getDate(), getTime());
            System.out.println("Bug non resolu");
        }else {
            excelManager.excelWriting("1294", "OK", getDate(), getTime());
            System.out.println("Bug  resolu");
        }
    }

}
