package com.manomano;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class BaseClass {
    public WebDriver driver;

    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = (WebDriver) new ChromeDriver();
        PageFactory.initElements(driver, LoginPage.class);
    }

    public void navigateToHomePage(){
        driver.get("https://www.manomano.fr/");
    }

    public void closeDriver(){
        driver.quit();
    }
}
