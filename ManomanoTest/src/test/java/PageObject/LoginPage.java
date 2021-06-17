package PageObject;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class LoginPage extends BaseClass {
    @FindBy(id = "username")
    private static WebElement username;

    @FindBy(id = "password")
    private static WebElement password;

    @FindBy(xpath = "//*[@id=\"login-section\"]/footer/button")
    private static WebElement btnConnect;

    @FindBy(xpath = "//*[@id=\"rc-imageselect\"]/div[3]/div[2]/div[1]/div[1]/div[4]")
    private static WebElement solver_btn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/iframe")
    private static WebElement iframe;

    public static void auth() throws InterruptedException {
        username.sendKeys("techboa77@gmail.com");
        password.sendKeys("Admin-9114");
        btnConnect.click();
        Thread.sleep(5000);
        try{
            if(iframe.isDisplayed()){
                getSecurityElement_2();
            }
        }catch (Exception e){

        }

    }

    public static void getSecurityElement_2() throws InterruptedException {
        System.out.println("number: " );
        ((JavascriptExecutor) driver).executeScript("window.open()");
        // 2 - handle new_tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        try {
            driver.switchTo().window(tabs.get(0));
            driver.switchTo().defaultContent();
            driver.switchTo().frame(iframe);
            System.out.println("text frame: " + driver.findElement(By.xpath("//*[@id=\"rc-imageselect\"]/div[2]/div[1]/div[1]/div/strong")).getText());
            Thread.sleep(3000);
            solver_btn.click();
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(10000);
            driver.close();
            System.out.println("close windows");
        } catch (Exception e) {
            System.out.println("Exception 2" + e);
        }
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        System.out.println("switch new windows");
        try{
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(10000);
            driver.close();
        }catch (Exception e){
            System.out.println("Exception 1" + e);
        }
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        Thread.sleep(15000);
//        perfom_info.click();
//        Thread.sleep(1000);
//        message = p_element.getText();
//        scroll((p_element.getLocation().getY()-50));
//        Thread.sleep(3000);
    }
}
