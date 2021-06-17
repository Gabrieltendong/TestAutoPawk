package com.manomano;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    protected  WebDriver driver;

    @FindBy(className = "google-social-signin-button")
    protected WebElement btnConnexion;

    public void clickButtonConnexion(){
//        btnConnexion.click();
        System.out.println("salut");
    }
}
