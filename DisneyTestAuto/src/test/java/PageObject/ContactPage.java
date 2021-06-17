package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class ContactPage extends BaseClass {
    @FindBy(id = "input_1_12")
    private static WebElement first_name;

    @FindBy(id = "input_1_3")
    private static WebElement email;

    @FindBy(id = "input_1_9")
    private static WebElement selectSubject;

    @FindBy(id = "input_1_11")
    private static WebElement message;

    @FindBy(id = "gform_submit_button_1")
    private static WebElement btnSubmit;

    @FindBy(id = "gform_ajax_spinner_1")
    private static WebElement spinner;

    public static void setFirst_name(){
        first_name.sendKeys("test name");
    }

    public static void setEmail(){
        email.sendKeys("toto@gmail.com");
    }

    public static void setSelectSubject(){
        Select subject = new Select(selectSubject);
        subject.selectByIndex(1);
    }

    public static void setMessage(){
        message.sendKeys("my message ");
    }

    public static void handleSubmit(){
        btnSubmit.submit();
    }

    public static void sendMessage() throws InterruptedException, IOException {
        ExcelManager excelManager = new ExcelManager();
        setFirst_name();
        setEmail();
        setSelectSubject();
        setMessage();
        handleSubmit();
        Thread.sleep(20000);
        if(spinner.isDisplayed()){
            System.out.println("Bug non resolu");
            excelManager.excelWriting("1097", "KO", getDate(), getTime());
        }else {
            System.out.println("Bug resolu");
            excelManager.excelWriting("1097", "OK", getDate(), getTime());
        }
    }
}
