package PageObject;

import Base.BaseClass;
import Utils.ExcelManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class MySettingsAccountPage extends BaseClass {
    private static String firstName;
    private static String lastName;
    private static ExcelManager excelManager = new ExcelManager();

    @FindBy(id = "user_private_firstname")
    private static WebElement first_name;

    @FindBy(id = "user_private_lastname")
    private static WebElement last_name;

    @FindBy(xpath = "//*[@id=\"user_private\"]/button")
    private static WebElement btnSubmit;

    @FindBy(xpath = "/html/body/div[10]/aside/div/div/div/p")
    private static WebElement messageUpdate;

    public static void setFirstName(String value){
        firstName = value;
        first_name.sendKeys(value);
    }

    public static void setLastName(String value){
        lastName = value;
        last_name.sendKeys(value);
    }

    public static void submitUpdate() throws IOException {
        btnSubmit.submit();
        validedForm();
    }

    public static void validedForm() throws IOException {
        System.out.println("name user: " + lastName);
        if(isNotValidName(firstName) || isNotValidName(lastName) && getMessageUpdate().contains("Modification enregistrée")){
            System.out.println("Bug non resolu");
            excelManager.excelWriting("204", "KO", getDate(), getTime());
        }else {
            excelManager.excelWriting("204", "OK", getDate(), getTime());
        }
    }

    private static String getMessageUpdate(){
        return messageUpdate.getText();
    }

    public static boolean isNotValidName(String name){
        String regExp = "^.|_$";
        return name.matches(regExp);
    }
}
