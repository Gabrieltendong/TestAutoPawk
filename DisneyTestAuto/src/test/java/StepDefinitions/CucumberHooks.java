package StepDefinitions;

import Base.BaseClass;
import PageObject.AboutEnterprisePage;
import PageObject.ContactPage;
import PageObject.HomePage;
import PageObject.PrivacyRulePage;
import Utils.SendMail;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;

import java.io.IOException;

public class CucumberHooks extends BaseClass {
    @Before
    public void setup(){
        setUpDriver();
        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, PrivacyRulePage.class);
        PageFactory.initElements(driver, AboutEnterprisePage.class);
        PageFactory.initElements(driver, ContactPage.class);
    }
    @After
    public void teardown() throws IOException {
        closeDriver(driver);
        SendMail sendMail = new SendMail();
        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "gtendong@gmail.com");
        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "fokourou@zenity.fr");
    }

    @AfterSuite(alwaysRun=true)
    public void afterTestSuite(){
        System.out.println("test suite finish");
    }
}