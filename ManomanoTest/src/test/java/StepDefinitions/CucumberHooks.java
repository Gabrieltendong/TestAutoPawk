package StepDefinitions;

import Base.BaseClass;
import PageObject.*;
import Utils.SendMail;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CucumberHooks extends BaseClass {
    @Before
    public void setup(){
        setUpDriver();
        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, ProgrammeAffiliatePage.class);
        PageFactory.initElements(driver, FAQPage.class);
        PageFactory.initElements(driver, LoginPage.class);
        PageFactory.initElements(driver, MySettingsAccountPage.class);
    }
    @After
    public void teardown() throws IOException {
        closeDriver(driver);
        SendMail sendMail = new SendMail();
        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "gtendong@gmail.com");
        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "fokourou@zenity.fr");
    }
}