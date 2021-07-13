package StepDefinitions;

import Base.BaseClass;
import PageObject.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CucumberHooks extends BaseClass {
    @Before
    public void setup(){
        setUpDriver();
        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, ProPage.class);
        PageFactory.initElements(driver, ActualityPage.class);
        PageFactory.initElements(driver, WhoAreWePage.class);
        PageFactory.initElements(driver, BankAccountPage.class);
        PageFactory.initElements(driver, RealEstateLoanPage.class);
        PageFactory.initElements(driver, TradeInsurancePage.class);
        PageFactory.initElements(driver, RetirementInsurancePage.class);
        PageFactory.initElements(driver, MortgageInsurancePage.class);
        PageFactory.initElements(driver, HealthInsurancePage.class);
        PageFactory.initElements(driver, PersonalLoanPage.class);
        PageFactory.initElements(driver, CarInsurancePage.class);
        PageFactory.initElements(driver, AdvicePage.class);
        PageFactory.initElements(driver, MotorcycleInsurance.class);
        PageFactory.initElements(driver, StockExchangePage.class);
        PageFactory.initElements(driver, HomeInsurancePage.class);
        PageFactory.initElements(driver, ComplementaryHealthPage.class);
        PageFactory.initElements(driver, ContactPage.class);
        PageFactory.initElements(driver, LegaleNoticePage.class);
        PageFactory.initElements(driver, CreditSimulatorPage.class);
    }
    @After
    public void teardown() throws IOException {
        closeDriver(driver);
//        SendMail sendMail = new SendMail();
//        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "gtendong@gmail.com");
//        sendMail.sendEmail("gabitendong@gmail.com", "gabi2017", "fokourou@zenity.fr");
    }
}