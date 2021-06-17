package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
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
            path = "C:\\Users\\Gabriel\\Documents\\PAWK\\Projets\\ManomanoTest\\src\\test\\resources\\driver\\chromedriver.exe";
//            path = (System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
        } else {
            path = (System.getProperty("user.dir")+"/src/test/driver/resources/chromedriver");
        }
        System.setProperty("webdriver.chrome.driver", path);
        ChromeOptions options = new ChromeOptions();
        //capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.addArguments("start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        options.addExtensions(new File(System.getProperty("user.dir")+"/src/test/resources/order/CaptchaBypass.crx"));
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
}
