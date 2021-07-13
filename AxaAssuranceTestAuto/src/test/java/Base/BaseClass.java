package Base;

import Utils.ExcelManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static LocalDate date;
    public static LocalTime tps;
    public static String value_tps;
    public static String value_date;
    public static WebDriver driver;
    static String os = System.getProperty("os.name");
    static String path;

    public static void setUpDriver(){
        System.out.println("salut");
        System.out.println(os);
        if (os.startsWith("W")){
            System.out.println(System.getProperty("user.dir"));
//            path = "C:\\Users\\Gabriel\\Documents\\PAWK\\Projets\\ManomanoTest\\src\\test\\resources\\driver\\chromedriver.exe";
            path = (System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
        } else {
            path = (System.getProperty("user.dir")+"/src/test/driver/resources/chromedriver");
        }
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("driver: " + driver);
    }

    public static void closeDriver(WebDriver driver){
        driver.quit();
    }

    public static void navigateTo(WebElement element){
        String url = element.getAttribute("href");
        driver.navigate().to(url);
    }
    public static String getDate(){
        date = LocalDate.now();
        value_date = date.toString();
        return value_date;
    }
    public static String getTime(){
        tps = LocalTime.now();
        value_tps = tps.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return value_tps;
    }

    public static void verifyLink(WebElement element, String numBug) throws IOException {
        String url = element.getAttribute("href");
        ExcelManager excelManager = new ExcelManager();
        try{
            HttpURLConnection c= (HttpURLConnection)new URL(url).openConnection();
            c.setRequestMethod("HEAD");
            c.connect();
            int r = c.getResponseCode();
            System.out.println("Http response code: " + r);
            if(r == 200){
                excelManager.excelWriting(numBug, "OK", getDate(), getTime());
                Assert.assertTrue(true);
            }else {
                excelManager.excelWriting(numBug, "KO", getDate(), getTime());
                Assert.assertTrue(false);
            }
        }catch (Exception e){
            excelManager.excelWriting(numBug, "KO", getDate(), getTime());
            Assert.assertTrue(false);
            System.out.println("Http page not found");
        }
    }
}
